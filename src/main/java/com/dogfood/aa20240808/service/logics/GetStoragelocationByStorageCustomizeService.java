package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.repository.GetStoragelocationByStorageCustomizeServiceMapper; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.Storage_locationEntity; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class GetStoragelocationByStorageCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private GetStoragelocationByStorageCustomizeServiceMapper getStoragelocationByStorageCustomizeServiceMapper;
    public List<Storage_locationEntity> getStoragelocationByStorage(Long storageId) {
        LambdaParamWrapper<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606> variable1 = new LambdaParamWrapper<>(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606());
        List<Storage_locationEntity> result = new ArrayList<>();
        variable1.param = CommonFunctionUtil.createListPage(getStoragelocationByStorageCustomizeServiceMapper.getAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(storageId), getStoragelocationByStorageCustomizeServiceMapper.countAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(storageId).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606.class); 
        if ((variable1.param.total.compareTo(0L) > 0)) {
            result = CommonFunctionUtil.listTransform(variable1.param.list, (item) -> item.storage_location); 
        } else {
        } 

        return result;
    } 


}
