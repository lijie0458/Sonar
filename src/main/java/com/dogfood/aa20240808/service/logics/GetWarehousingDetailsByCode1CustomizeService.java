package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.GetWarehousingDetailsByCode1CustomizeServiceMapper; 
import java.util.HashMap; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.Storage_locationEntity; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.OtherInStorageDetailsStrutureStructure; 
import java.util.Map; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class GetWarehousingDetailsByCode1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private GetWarehousingDetailsByCode1CustomizeServiceMapper getWarehousingDetailsByCode1CustomizeServiceMapper;
    public List<OtherInStorageDetailsStrutureStructure> getWarehousingDetailsByCode1(String Code) {
        LambdaParamWrapper<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_17A69820EFC40EEFE36B908E394A60C7> variable1 = new LambdaParamWrapper<>(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_17A69820EFC40EEFE36B908E394A60C7());
        List<Long> variable2 = new ArrayList<>();
        LambdaParamWrapper<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606> variable3 = new LambdaParamWrapper<>(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606());
        Map<Long, List<Storage_locationEntity>> variable4 = new HashMap<>();
        List<Storage_locationEntity> variable5 = new ArrayList<>();
        List<OtherInStorageDetailsStrutureStructure> result = new ArrayList<>();
        variable1.param = CommonFunctionUtil.createListPage(getWarehousingDetailsByCode1CustomizeServiceMapper.getAnonymousStructure_CA8F7694D8827E13359AFAFE050C3CB8(Code), getWarehousingDetailsByCode1CustomizeServiceMapper.countAnonymousStructure_CA8F7694D8827E13359AFAFE050C3CB8(Code).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_17A69820EFC40EEFE36B908E394A60C7.class); 
        if ((variable1.param.total.compareTo(0L) > 0)) {
            variable2 = CommonFunctionUtil.listTransform(variable1.param.list, (item) -> item.warehouse_levelTwo.id); 
            variable3.param = CommonFunctionUtil.createListPage(getWarehousingDetailsByCode1CustomizeServiceMapper.getAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(variable2), getWarehousingDetailsByCode1CustomizeServiceMapper.countAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(variable2).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606.class); 
            if ((variable3.param.total.compareTo(0L) > 0)) {
                variable5 = CommonFunctionUtil.listTransform(variable3.param.list, (item) -> item.storage_location); 
                for (Long index = 0L; index < variable2.size(); index++) {
                    Long item = variable2.get(index.intValue());
                    CommonFunctionUtil.mapPut(variable4, item, CommonFunctionUtil.listFilter(variable5, (item1) -> (CommonFunctionUtil.equals(item, item1.warehouse_codetwo_id))));
                } 

            } else {
            } 

            result = CommonFunctionUtil.listTransform(variable1.param.list, (item) -> CommonFunctionUtil.newWithInitiation(new OtherInStorageDetailsStrutureStructure(), _bean24 -> {
    _bean24.inventory = item.inventory; 
    _bean24.materialDetails = item.materialDetails; 
    _bean24.measuringUnit = item.measuringUnit; 
    _bean24.otherInStorageDetails = item.otherInStorageDetails; 
    _bean24.warehouse = item.warehouse_levelTwo; 
    _bean24.storagelocationList = CommonFunctionUtil.mapGet(variable4, item.warehouse_levelTwo.id); 
} )); 
        } else {
        } 

        return result;
    } 


}
