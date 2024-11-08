package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_53DAF547B1A8EB1D1E8C43C4FE2C6055; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.GetMaterialDetailsByCodeListCustomizeServiceMapper; 

/**
 * 根据物料编号列表拿到物料信息-ljl
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
public class GetMaterialDetailsByCodeListCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private GetMaterialDetailsByCodeListCustomizeServiceMapper getMaterialDetailsByCodeListCustomizeServiceMapper;

    public AnonymousStructure_53DAF547B1A8EB1D1E8C43C4FE2C6055 getMaterialDetailsByCodeList(List<String> MaterialCodeList) {
        AnonymousStructure_53DAF547B1A8EB1D1E8C43C4FE2C6055 result = new AnonymousStructure_53DAF547B1A8EB1D1E8C43C4FE2C6055();
        result = CommonFunctionUtil.createListPage(getMaterialDetailsByCodeListCustomizeServiceMapper.getAnonymousStructure_67157391F5C859BD7A607E15FE4E75BD(MaterialCodeList), getMaterialDetailsByCodeListCustomizeServiceMapper.countAnonymousStructure_67157391F5C859BD7A607E15FE4E75BD(MaterialCodeList).intValue(), AnonymousStructure_53DAF547B1A8EB1D1E8C43C4FE2C6055.class); 
        return result;
    } 

}
