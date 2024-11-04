package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadCountInventoryByCodeAndWahouseCustomizeServiceMapper; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import java.math.BigDecimal; 

@Service
public class LoadCountInventoryByCodeAndWahouseCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadCountInventoryByCodeAndWahouseCustomizeServiceMapper loadCountInventoryByCodeAndWahouseCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_8B8C913856E170F98C3B9D88CC8F9784 loadCountInventoryByCodeAndWahouse(Long Warehouse, String code) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2F4DB4E95AB871687BA63AFCB56ABB2C> variable1 = new ArrayList<>();
        LambdaParamWrapper<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2F4DB4E95AB871687BA63AFCB56ABB2C> variable2 = new LambdaParamWrapper<>(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2F4DB4E95AB871687BA63AFCB56ABB2C());
        LambdaParamWrapper<BigDecimal> variable3 = new LambdaParamWrapper<>(BigDecimal.ZERO);
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_8B8C913856E170F98C3B9D88CC8F9784 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_8B8C913856E170F98C3B9D88CC8F9784();
        variable1 = loadCountInventoryByCodeAndWahouseCustomizeServiceMapper.getSql1(Warehouse, code); 
        if ((CommonFunctionUtil.length(variable1).compareTo(0L) > 0)) {
            variable2.param = CommonFunctionUtil.get(variable1, 0L); 
            variable3.param = (variable2.param.stockQuantity.subtract(variable2.param.occupiedQuantity)); 
            result = CommonFunctionUtil.newWithInitiation(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_8B8C913856E170F98C3B9D88CC8F9784(), _bean335 -> {
    _bean335.total = variable3.param; 
    _bean335.batchNumber = variable2.param.id; 
} ); 
        } else {
            variable3.param = new BigDecimal(0L); 
            result = CommonFunctionUtil.newWithInitiation(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_8B8C913856E170F98C3B9D88CC8F9784(), _bean700 -> {
    _bean700.total = variable3.param; 
    _bean700.batchNumber = 0L; 
} ); 
        } 

        return result;
    } 


}
