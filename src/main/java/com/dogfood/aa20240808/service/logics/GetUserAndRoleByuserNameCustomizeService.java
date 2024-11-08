package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.GetUserAndRoleByuserNameCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DB888B8BD7DBFF31665BCA5E50FB8625; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 根据userName获取用户和角色信息
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
public class GetUserAndRoleByuserNameCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private GetUserAndRoleByuserNameCustomizeServiceMapper getUserAndRoleByuserNameCustomizeServiceMapper;

    public AnonymousStructure_DB888B8BD7DBFF31665BCA5E50FB8625 getUserAndRoleByuserName(String userName) {
        AnonymousStructure_DB888B8BD7DBFF31665BCA5E50FB8625 result = new AnonymousStructure_DB888B8BD7DBFF31665BCA5E50FB8625();
        result = CommonFunctionUtil.listHead(getUserAndRoleByuserNameCustomizeServiceMapper.getAnonymousStructure_DB888B8BD7DBFF31665BCA5E50FB8625(userName)); 
        return result;
    } 

}
