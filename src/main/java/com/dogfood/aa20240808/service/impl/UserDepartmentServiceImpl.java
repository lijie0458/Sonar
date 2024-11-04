package com.dogfood.aa20240808.service.impl;
import com.dogfood.aa20240808.domain.entities.LCAPDepartment;
import com.dogfood.aa20240808.domain.entities.LCAPUserDeptMapping;
import com.dogfood.aa20240808.repository.UserDeptMappingMapper;
import com.dogfood.aa20240808.domain.entities.LCAPUser;
import com.dogfood.aa20240808.repository.entities.LCAPUserMapper;
import com.dogfood.aa20240808.repository.LCAPUserInfoMapper;
import com.dogfood.aa20240808.web.dto.DepartmentRes;
import com.dogfood.aa20240808.service.DepartmentService;
import com.dogfood.aa20240808.service.UserDepartmentService;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.atomic.ColumnQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.atomic.ListLiteralQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.logic.binary.compare.EqualQueryFilter;
import com.dogfood.aa20240808.web.dto.UserListResDTO;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.Collections;

/**
* auto generate UserRoleServiceImpl logic
* 权限下沉情况下 处理角色下用户逻辑
*
* @author sys
*/
@Service
public class UserDepartmentServiceImpl implements UserDepartmentService{

    private Logger log = LoggerFactory.getLogger(UserDepartmentServiceImpl.class);



    @Resource
    private DepartmentService departmentService;
    @Resource
    private UserDeptMappingMapper userDeptMappingMapper;
    @Resource
    private LCAPUserInfoMapper lcapUserInfoMapper;
    @Resource
    private LCAPUserMapper lcapUserMapper;

    @Override
    public UserListResDTO getUserLevelNthUpDirectManager(String userId, Long level) {
    log.info("getUserLevelNthUpDirectManager start userId {} level {}",userId,level);
        if (level == null || level<=0){
            return null;
        }
        UserListResDTO resDTO = new UserListResDTO();
        UserListResDTO userListResDTO = new UserListResDTO();
        LCAPUser lcapUser = lcapUserInfoMapper.getByUserId(userId);
        if(lcapUser == null  || StringUtils.isBlank(lcapUser.getUserId())){
               return null;
        }
        lcapUser = lcapUserInfoMapper.getByUserId(lcapUser.getDirectLeaderId());
        if(lcapUser == null  || StringUtils.isBlank(lcapUser.getUserId())){
              return null;
        }
        level--;
        while (level >0){
            lcapUser = lcapUserInfoMapper.getByUserId(lcapUser.getDirectLeaderId());
        if(lcapUser == null  || StringUtils.isBlank(lcapUser.getUserId())){
            return null;
        }
            level--;
        }
        BeanUtils.copyProperties(lcapUser,userListResDTO);
        return userListResDTO;
    }
    // TODO 方法名命名
    @Override
    public UserListResDTO getUserLevelNthUpDeptManager(String userId, Long level) {
        log.info("getUserLevelNthUpDeptManager start userId {} level {}",userId,level);
        if (StringUtils.isBlank(userId)){
            return null;
        }
        if (level == null || level < 1){
            return null;
        }
        UserListResDTO resDTO = new UserListResDTO();
        // get dept
        List<LCAPUserDeptMapping> mappings = userDeptMappingMapper.selectByUserId(userId);
        DepartmentRes department = null;
        if (mappings != null && mappings.size() > 0){
            department = departmentService.queryByDeptId(mappings.get(0).getDeptId());
            level--;
        }
        //默认只有一条
        // target level dept
        while (level > 0){
            department = departmentService.queryByDeptId(department.getParentDeptId());
            level--;
        }
        // dept leader
        LCAPUserDeptMapping mapping = userDeptMappingMapper.selectLeaderByDeptId(department.getDeptId());
        if (mapping == null){
            log.info("user department relation not exist {}",department.getDeptId());
            return null;
        }
        LCAPUser lcapUser = lcapUserInfoMapper.getByUserId(mapping.getUserId());
        if(lcapUser == null  || StringUtils.isBlank(lcapUser.getUserId())){
             return null;
        }
        BeanUtils.copyProperties(lcapUser,resDTO);
        return resDTO;
    }

    @Override
    public UserListResDTO getUserLevelNthDeptManager(String userId, Long level) {
        log.info("getUserLevelNthDeptManager start userId {} level {}",userId,level);
        UserListResDTO userListResDTO = new UserListResDTO();
        if (level == null || level<1){
            return null;
        }
        List<LCAPDepartment> list = null;
        String currentId = null;
        Stack<DepartmentRes> stack = new Stack<>();
        // get current dept
        List<LCAPUserDeptMapping> deptMappings = userDeptMappingMapper.selectByUserId(userId);
        if (deptMappings!= null && deptMappings.size()>0){
            DepartmentRes department = departmentService.queryByDeptId(deptMappings.get(0).getDeptId());
            stack.push(department);
            while (department != null && StringUtils.isNotBlank(department.getParentDeptId())){
                 department = departmentService.queryByDeptId(department.getParentDeptId());
                 if (department != null){
                     stack.push(department);
                 }
            }
        }
        DepartmentRes department = null;
        while (level>0){
            if (stack.isEmpty()){
                return null;
            }
            department = stack.pop();
            level--;
        }

        LCAPUserDeptMapping mapping = userDeptMappingMapper.selectLeaderByDeptId(department.getDeptId());
        if (mapping != null){
            LCAPUser user = lcapUserInfoMapper.getByUserId(mapping.userId);
            if (user!= null){
                BeanUtils.copyProperties(user,userListResDTO);
                return userListResDTO;
            }
        }
        return null;
    }

    @Override
    public List<UserListResDTO> getDeptUsers(String deptId,Boolean managerOnly) {
        if (StringUtils.isBlank(deptId)){
            return Collections.emptyList();
        }
        List<LCAPUser> list = userDeptMappingMapper.getUserByDept(deptId,managerOnly);
        return list.stream().map(x -> {
            UserListResDTO userListResDTO = new UserListResDTO();
            userListResDTO.setUserId(x.getUserId());
            userListResDTO.setUserName(x.getUserName());
            userListResDTO.setSource(x.getSource().getCode());
            return userListResDTO;
        }).collect(Collectors.toList());
    }

        @Override
        public List<UserListResDTO> getUsersByUserName(String userName) {
                if (StringUtils.isBlank(userName)){
                    return Collections.emptyList();
                }
            AbstractQueryFilter queryFilter = new EqualQueryFilter()
                    .left(new ColumnQueryFilter("LCAPUser", "lcap_user", "userName", "user_name"))
                    .right(new ListLiteralQueryFilter(userName));
            List<LCAPUser> list = lcapUserMapper.selectList(queryFilter);

            return list.stream().map(x -> {
                UserListResDTO userListResDTO = new UserListResDTO();
                userListResDTO.setUserId(x.getUserId());
                userListResDTO.setUserName(x.getUserName());
                userListResDTO.setSource(x.getSource().getCode());
                return userListResDTO;
            }).collect(Collectors.toList());
        }

}
