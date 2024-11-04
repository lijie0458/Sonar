package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.service.entities.Storage_locationEntityService; 
import com.dogfood.aa20240808.domain.entities.Storage_locationEntity; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.LogicStorageLocationCustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LogicStorageLocationCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LogicStorageLocationCustomizeServiceMapper logicStorageLocationCustomizeServiceMapper;
    @Autowired
    private Storage_locationEntityService storage_locationEntityService;
    public void logicStorageLocation(String warehouse_code, String warehouse_name) {
        LambdaParamWrapper<String> warehouse_nameWrapper = new LambdaParamWrapper<>(warehouse_name);
        LambdaParamWrapper<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2> variable1 = new LambdaParamWrapper<>(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2());
        Storage_locationEntity StorageLocation = new Storage_locationEntity();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB> StorageLocationList = new ArrayList<>();
        Long num = 0L;
        String StringNum = "";
        LambdaParamWrapper<String> location_code = new LambdaParamWrapper<>("");
        variable1.param = CommonFunctionUtil.listHead(logicStorageLocationCustomizeServiceMapper.getAnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2(warehouse_nameWrapper.param, warehouse_code)); 
        StorageLocationList = logicStorageLocationCustomizeServiceMapper.getAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(); 
        if ((CommonFunctionUtil.length(StorageLocationList).compareTo(0L) > 0)) {
            num = CommonFunctionUtil.convert(CommonFunctionUtil.get(StorageLocationList, 0L).storage_location.location_code, Long.class); 
        } else {
            num = 0L; 
        } 

        StringNum = CommonFunctionUtil.convert((num + 1L), String.class); 
        if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 1L))) {
            location_code.param = new StringBuilder().append(CommonFunctionUtil.toString("000")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 2L))) {
            location_code.param = new StringBuilder().append(CommonFunctionUtil.toString("00")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 3L))) {
            location_code.param = new StringBuilder().append(CommonFunctionUtil.toString("00")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else {
            location_code.param = StringNum; 
        } 

        StorageLocation = CommonFunctionUtil.newWithInitiation(new Storage_locationEntity(), _bean723 -> {
    _bean723.warehouse_codetwo_id = variable1.param.warehouse_levelTwo.id; 
    _bean723.location_code = location_code.param; 
    _bean723.location_name = new StringBuilder().append(CommonFunctionUtil.toString(warehouse_nameWrapper.param)).append(CommonFunctionUtil.toString(location_code.param)).toString(); 
} ); 
        storage_locationEntityService.create(StorageLocation);
        return ;
    } 


}
