package com.dogfood.aa20240808.web.controller;
import com.dogfood.aa20240808.service.DepartmentService;
import com.dogfood.aa20240808.web.dto.DepartmentDTO;
import com.dogfood.aa20240808.web.dto.DepartmentRes;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.UserInfoService;
import com.dogfood.aa20240808.service.UserRoleService;
import com.dogfood.aa20240808.web.dto.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
* auto generate DepartmentController
* 给ide提供一个全局系统逻辑来获取部门列表
*
* @author sys
*/
@RestController
@RequestMapping("api/system")
public class DepartmentController {
    private Logger log = LoggerFactory.getLogger(DepartmentController.class);
    @Resource
    private DepartmentService departmentService;
    @Resource
    private UserInfoService userInfoService;
    @Resource
    private UserRoleService userRoleService;
    @PostMapping("department/appDeptList")
    public Object getAppDeptList(@RequestBody DepartmentDTO departmentDTO) {
        log.info("appDeptListInner param{}",departmentDTO);
        try {
            List<DepartmentRes> list = departmentService.getDepartments(departmentDTO.getName());
            log.info("appDeptListInner list {}",list);
            return ApiReturn.of(list);
        }catch (Exception e){
            return ApiReturn.of(null,500,"appDeptList error");
        }
    }

    @PostMapping("role/appRoleList")
    public Object getAppRoleList(@RequestBody RoleListReqDTO query) {
        log.info("appRoleList param{}",query);
        try {
            List<RoleListResDTO> list = userRoleService.getRoleList(query);
            return ApiReturn.of(list);
        }catch (Exception e){
            return ApiReturn.of(null,500,"appRoleList error");
        }
    }
    @PostMapping("user/appUserList")
    public Object getAppUserList(@RequestBody UserListReqDTO reqDTO) {
        log.info("appUserList param{}",reqDTO);
        try {
            List<UserListResDTO> list = userInfoService.getUserListFromAppOrNuims(reqDTO);
            return ApiReturn.of(list.stream().map(x -> {
                UserResDTO userData = new UserResDTO();
                userData.setUserId(x.getUserId());
                // 用户下沉时，用户数据本身不区分环境，环境概念体现在应用上
                userData.setEnv("");
                userData.setUserName(x.getUserName());
                userData.setSource(x.getSource());
                return userData;
            }).collect(Collectors.toList()));
        }catch (Exception e){
            return ApiReturn.of(null,500,"appUserList error");
        }
    }
}
