package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3D26FC4B14C7240A937FF824EB2C8626; 
import java.util.List; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LoadquantityShippedByDetailsIdCustomizeServiceMapper; 

/**
 * 根据明细id查询发货数量
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
public class LoadquantityShippedByDetailsIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadquantityShippedByDetailsIdCustomizeServiceMapper loadquantityShippedByDetailsIdCustomizeServiceMapper;

    public List<AnonymousStructure_3D26FC4B14C7240A937FF824EB2C8626> loadquantityShippedByDetailsId() {
        List<AnonymousStructure_3D26FC4B14C7240A937FF824EB2C8626> result = new ArrayList<>();
        result = loadquantityShippedByDetailsIdCustomizeServiceMapper.getSql1(); 
        return result;
    } 

}
