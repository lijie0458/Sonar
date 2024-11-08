package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9CC0EE8B16D7F77961F310C582D9C396; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.GetProductionMaterialRequisitionCustomizeServiceMapper; 

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
public class GetProductionMaterialRequisitionCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private GetProductionMaterialRequisitionCustomizeServiceMapper getProductionMaterialRequisitionCustomizeServiceMapper;

    public AnonymousStructure_9CC0EE8B16D7F77961F310C582D9C396 getProductionMaterialRequisition(String param1) {
        List<AnonymousStructure_9CC0EE8B16D7F77961F310C582D9C396> variable1 = new ArrayList<>();
        AnonymousStructure_9CC0EE8B16D7F77961F310C582D9C396 result = new AnonymousStructure_9CC0EE8B16D7F77961F310C582D9C396();
        variable1 = getProductionMaterialRequisitionCustomizeServiceMapper.getSql1(param1); 
        result = CommonFunctionUtil.get(variable1, 0L); 
        return result;
    } 

}
