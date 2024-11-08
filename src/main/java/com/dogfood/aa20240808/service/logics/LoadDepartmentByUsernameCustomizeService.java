package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632; 
import com.dogfood.aa20240808.service.entities.DepartmentEntityService; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadDepartmentByUsernameCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.entities.DepartmentEntity; 
import com.dogfood.aa20240808.config.Constants; 

/**
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
public class LoadDepartmentByUsernameCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private DepartmentEntityService departmentEntityService;

    @Autowired
    private LoadDepartmentByUsernameCustomizeServiceMapper loadDepartmentByUsernameCustomizeServiceMapper;

    public DepartmentEntity loadDepartmentByUsername(String UserName) {
        DepartmentEntity result = new DepartmentEntity();
        result = departmentEntityService.get(CommonFunctionUtil.get(CommonFunctionUtil.createListPage(loadDepartmentByUsernameCustomizeServiceMapper.getAnonymousStructure_47C167E7217746A55100F50A57F637C0(UserName), loadDepartmentByUsernameCustomizeServiceMapper.countAnonymousStructure_47C167E7217746A55100F50A57F637C0(UserName).intValue(), AnonymousStructure_90BB04F104917B26166C550B4A1B0632.class).list, 0L).lCAPUser.department_Id); 
        return result;
    } 

}
