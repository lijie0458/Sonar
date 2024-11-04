package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadWarehouseByCodeCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadWarehouseByCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadWarehouseByCodeCustomizeServiceMapper loadWarehouseByCodeCustomizeServiceMapper;
    public List<Warehouse_levelTwoEntity> loadWarehouseByCode(String param1) {
        List<Long> variable1 = new ArrayList<>();
        List<Warehouse_levelTwoEntity> result = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(loadWarehouseByCodeCustomizeServiceMapper.getLong(param1), loadWarehouseByCodeCustomizeServiceMapper.countLong(param1).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_29F3A3578E534341215DC8E95EA1758E.class).list; 
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2> currentLcpEachName_1 = CommonFunctionUtil.createListPage(loadWarehouseByCodeCustomizeServiceMapper.getAnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2(variable1), loadWarehouseByCodeCustomizeServiceMapper.countAnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2(variable1).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D68ADEA2FD6A42F4478E1BA20619B4E3.class).list;
        for (Long index = 0L; index < currentLcpEachName_1.size(); index++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2 item = currentLcpEachName_1.get(index.intValue());
            CommonFunctionUtil.add(result, CommonFunctionUtil.clone(item.warehouse_levelTwo));
        } 

        return result;
    } 


}
