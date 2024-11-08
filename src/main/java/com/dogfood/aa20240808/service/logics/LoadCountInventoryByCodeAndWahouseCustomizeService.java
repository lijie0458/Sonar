package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadCountInventoryByCodeAndWahouseCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_8B8C913856E170F98C3B9D88CC8F9784; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2F4DB4E95AB871687BA63AFCB56ABB2C; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import java.math.BigDecimal; 

/**
 * 通过仓库和物料名称查询库存-cmk
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
public class LoadCountInventoryByCodeAndWahouseCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadCountInventoryByCodeAndWahouseCustomizeServiceMapper loadCountInventoryByCodeAndWahouseCustomizeServiceMapper;

    public AnonymousStructure_8B8C913856E170F98C3B9D88CC8F9784 loadCountInventoryByCodeAndWahouse(Long Warehouse, String code) {
        List<AnonymousStructure_2F4DB4E95AB871687BA63AFCB56ABB2C> variable1 = new ArrayList<>();
        LambdaParamWrapper<AnonymousStructure_2F4DB4E95AB871687BA63AFCB56ABB2C> variable2 = new LambdaParamWrapper<>(new AnonymousStructure_2F4DB4E95AB871687BA63AFCB56ABB2C());
        LambdaParamWrapper<BigDecimal> variable3 = new LambdaParamWrapper<>(BigDecimal.ZERO);
        AnonymousStructure_8B8C913856E170F98C3B9D88CC8F9784 result = new AnonymousStructure_8B8C913856E170F98C3B9D88CC8F9784();
        variable1 = loadCountInventoryByCodeAndWahouseCustomizeServiceMapper.getSql1(Warehouse, code); 
        if ((CommonFunctionUtil.length(variable1).compareTo(0L) > 0)) {
            variable2.param = CommonFunctionUtil.get(variable1, 0L); 
            variable3.param = (variable2.param.stockQuantity.subtract(variable2.param.occupiedQuantity)); 
            result = CommonFunctionUtil.newWithInitiation(new AnonymousStructure_8B8C913856E170F98C3B9D88CC8F9784(), _bean1 -> {
    _bean1.total = variable3.param; 
    _bean1.batchNumber = variable2.param.id; 
} ); 
        } else {
            variable3.param = BigDecimal.valueOf(0L); 
            result = CommonFunctionUtil.newWithInitiation(new AnonymousStructure_8B8C913856E170F98C3B9D88CC8F9784(), _bean1 -> {
    _bean1.total = variable3.param; 
    _bean1.batchNumber = 0L; 
} ); 
        } 

        return result;
    } 

}
