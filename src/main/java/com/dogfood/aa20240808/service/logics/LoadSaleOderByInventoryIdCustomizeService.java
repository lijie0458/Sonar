package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadSaleOderByInventoryIdCustomizeServiceMapper; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9E4317B835B85F4F0A55543D88FC5FF1; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 根据销售订单新增物料的id生成详情
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
public class LoadSaleOderByInventoryIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadSaleOderByInventoryIdCustomizeServiceMapper loadSaleOderByInventoryIdCustomizeServiceMapper;

    public List<AnonymousStructure_9E4317B835B85F4F0A55543D88FC5FF1> loadSaleOderByInventoryId(List<String> param1) {
        List<AnonymousStructure_9E4317B835B85F4F0A55543D88FC5FF1> result = new ArrayList<>();
        result = loadSaleOderByInventoryIdCustomizeServiceMapper.getSql1(param1); 
        return result;
    } 

}
