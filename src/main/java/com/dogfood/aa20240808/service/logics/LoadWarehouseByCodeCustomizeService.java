package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadWarehouseByCodeCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_29F3A3578E534341215DC8E95EA1758E; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D68ADEA2FD6A42F4478E1BA20619B4E3; 

/**
 * 查询拥有当前物料的仓库-cmk
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
public class LoadWarehouseByCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadWarehouseByCodeCustomizeServiceMapper loadWarehouseByCodeCustomizeServiceMapper;

    public List<Warehouse_levelTwoEntity> loadWarehouseByCode(String param1) {
        List<Long> variable1 = new ArrayList<>();
        List<Warehouse_levelTwoEntity> result = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(loadWarehouseByCodeCustomizeServiceMapper.getLong(param1), loadWarehouseByCodeCustomizeServiceMapper.countLong(param1).intValue(), AnonymousStructure_29F3A3578E534341215DC8E95EA1758E.class).list; 
        List<AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2> currentLcpEachName_1 = CommonFunctionUtil.createListPage(loadWarehouseByCodeCustomizeServiceMapper.getAnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2(variable1), loadWarehouseByCodeCustomizeServiceMapper.countAnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2(variable1).intValue(), AnonymousStructure_D68ADEA2FD6A42F4478E1BA20619B4E3.class).list;
        for (Long index = 0L; index < currentLcpEachName_1.size(); index++) {
            AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2 item = currentLcpEachName_1.get(index.intValue());
            CommonFunctionUtil.add(result, CommonFunctionUtil.clone(item.warehouse_levelTwo));
        } 

        return result;
    } 

}
