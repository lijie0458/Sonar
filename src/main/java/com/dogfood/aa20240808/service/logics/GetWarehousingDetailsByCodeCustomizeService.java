package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.repository.GetWarehousingDetailsByCodeCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.OutsourceInStorageDetailsStrutureStructure; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.Storage_locationEntity; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import java.util.Map; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class GetWarehousingDetailsByCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private GetWarehousingDetailsByCodeCustomizeServiceMapper getWarehousingDetailsByCodeCustomizeServiceMapper;
    public List<OutsourceInStorageDetailsStrutureStructure> getWarehousingDetailsByCode(String Code) {
        LambdaParamWrapper<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B55C7AE154A0D6F65C15E745BB30A382> variable1 = new LambdaParamWrapper<>(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B55C7AE154A0D6F65C15E745BB30A382());
        List<Long> variable2 = new ArrayList<>();
        LambdaParamWrapper<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606> variable3 = new LambdaParamWrapper<>(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606());
        Map<Long, List<Storage_locationEntity>> variable4 = new HashMap<>();
        List<Storage_locationEntity> variable5 = new ArrayList<>();
        List<OutsourceInStorageDetailsStrutureStructure> result = new ArrayList<>();
        variable1.param = CommonFunctionUtil.createListPage(getWarehousingDetailsByCodeCustomizeServiceMapper.getAnonymousStructure_77A91D1F4D3302BA86978D8B97972F3D(Code), getWarehousingDetailsByCodeCustomizeServiceMapper.countAnonymousStructure_77A91D1F4D3302BA86978D8B97972F3D(Code).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B55C7AE154A0D6F65C15E745BB30A382.class); 
        if ((variable1.param.total.compareTo(0L) > 0)) {
            variable2 = CommonFunctionUtil.listTransform(variable1.param.list, (item) -> item.warehouse_levelTwo.id); 
            variable3.param = CommonFunctionUtil.createListPage(getWarehousingDetailsByCodeCustomizeServiceMapper.getAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(variable2), getWarehousingDetailsByCodeCustomizeServiceMapper.countAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(variable2).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606.class); 
            if ((variable3.param.total.compareTo(0L) > 0)) {
                variable5 = CommonFunctionUtil.listTransform(variable3.param.list, (item) -> item.storage_location); 
                for (Long index = 0L; index < variable2.size(); index++) {
                    Long item = variable2.get(index.intValue());
                    CommonFunctionUtil.mapPut(variable4, item, CommonFunctionUtil.listFilter(variable5, (item1) -> (CommonFunctionUtil.equals(item, item1.warehouse_codetwo_id))));
                } 

            } else {
            } 

            result = CommonFunctionUtil.listTransform(variable1.param.list, (item) -> CommonFunctionUtil.newWithInitiation(new OutsourceInStorageDetailsStrutureStructure(), _bean0 -> {
    _bean0.outsourceInStorageDetails = item.outsourceInStorageDetails; 
    _bean0.materialDetails = item.materialDetails; 
    _bean0.measuringUnit = item.measuringUnit; 
    _bean0.inventory = item.inventory; 
    _bean0.storagelocationList = CommonFunctionUtil.mapGet(variable4, item.warehouse_levelTwo.id); 
    _bean0.warehouse = item.warehouse_levelTwo; 
} )); 
        } else {
        } 

        return result;
    } 


}
