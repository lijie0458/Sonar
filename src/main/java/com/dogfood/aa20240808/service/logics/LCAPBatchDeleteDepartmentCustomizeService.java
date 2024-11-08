package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C3F54AE7C6EB0826B17CF78EDFE6659E; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.service.entities.LCAPDepartmentService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LCAPBatchDeleteDepartmentCustomizeServiceMapper; 

/**
 * 批量删除部门
 * 
 * @author sys
 * 
 * @date 2024-11-8 10:18
 * 
 * @version 1.0
 * 
 * @BelongsProject mybatis审计日志
 * 
 * @BelongsPackage src/main/java/com/dogfood/aa20240808/service/logics
 */
@Service
public class LCAPBatchDeleteDepartmentCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LCAPBatchDeleteDepartmentCustomizeServiceMapper lCAPBatchDeleteDepartmentCustomizeServiceMapper;

    @Autowired
    private LCAPDepartmentService lCAPDepartmentService;

    public String lCAPBatchDeleteDepartment(List<Long> ids) {
        List<AnonymousStructure_C3F54AE7C6EB0826B17CF78EDFE6659E> deptList = new ArrayList<>();
        List<String> deptIdList = new ArrayList<>();
        List<AnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2> userList = new ArrayList<>();
        String result = "";
        if (CommonFunctionUtil.hasValue(ids)) {
            deptIdList = lCAPBatchDeleteDepartmentCustomizeServiceMapper.getString(ids); 
            userList = lCAPBatchDeleteDepartmentCustomizeServiceMapper.getAnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2(deptIdList); 
            if ((CommonFunctionUtil.length(userList).compareTo(0L) > 0)) {
                result = "请先移除该部门下用户"; 
            } else {
                deptList = lCAPBatchDeleteDepartmentCustomizeServiceMapper.getSql1(deptIdList); 
                if ((CommonFunctionUtil.length(deptList).compareTo(0L) > 0)) {
                    result = "请先删除子部门"; 
                } else {
                    lCAPDepartmentService.batchDelete(ids);
                    result = "200"; 
                } 

            } 

        } else {
            result = "500"; 
        } 

        return result;
    } 

}
