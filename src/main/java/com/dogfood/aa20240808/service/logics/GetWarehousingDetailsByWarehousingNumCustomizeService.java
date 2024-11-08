package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F52C753F59C1E12EC6E64582A0AA70F2; 
import com.dogfood.aa20240808.repository.GetWarehousingDetailsByWarehousingNumCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.entities.Storage_locationEntity; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.ProductInStorageDetailsStrutureStructure; 
import java.util.Map; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 根据产品入库单号拿到入库详情
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
public class GetWarehousingDetailsByWarehousingNumCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private GetWarehousingDetailsByWarehousingNumCustomizeServiceMapper getWarehousingDetailsByWarehousingNumCustomizeServiceMapper;

    public List<ProductInStorageDetailsStrutureStructure> getWarehousingDetailsByWarehousingNum(String warehousingNum) {
        AnonymousStructure_F52C753F59C1E12EC6E64582A0AA70F2 variable1 = new AnonymousStructure_F52C753F59C1E12EC6E64582A0AA70F2();
        List<Long> variable2 = new ArrayList<>();
        AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606 variable3 = new AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606();
        LambdaParamWrapper<Map<Long, List<Storage_locationEntity>>> variable4 = new LambdaParamWrapper<>(new HashMap<>());
        List<Storage_locationEntity> variable5 = new ArrayList<>();
        List<ProductInStorageDetailsStrutureStructure> result = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(getWarehousingDetailsByWarehousingNumCustomizeServiceMapper.getAnonymousStructure_E92E2863764D2238A46559F497F7ACA4(warehousingNum), getWarehousingDetailsByWarehousingNumCustomizeServiceMapper.countAnonymousStructure_E92E2863764D2238A46559F497F7ACA4(warehousingNum).intValue(), AnonymousStructure_F52C753F59C1E12EC6E64582A0AA70F2.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            variable2 = CommonFunctionUtil.listTransform(variable1.list, (item) -> item.warehouse_levelTwo.id); 
            variable3 = CommonFunctionUtil.createListPage(getWarehousingDetailsByWarehousingNumCustomizeServiceMapper.getAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(variable2), getWarehousingDetailsByWarehousingNumCustomizeServiceMapper.countAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(variable2).intValue(), AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606.class); 
            if ((variable3.total.compareTo(0L) > 0)) {
                variable5 = CommonFunctionUtil.listTransform(variable3.list, (item) -> item.storage_location); 
                for (Long index = 0L; index < variable2.size(); index++) {
                    Long item = variable2.get(index.intValue());
                    CommonFunctionUtil.mapPut(variable4.param, item, CommonFunctionUtil.listFilter(variable5, (item1) -> (CommonFunctionUtil.equals(item, item1.warehouse_codetwo_id))));
                } 

            } else {
            } 

            result = CommonFunctionUtil.listTransform(variable1.list, (item) -> CommonFunctionUtil.newWithInitiation(new ProductInStorageDetailsStrutureStructure(), _bean1 -> {
    _bean1.inventory = item.inventory; 
    _bean1.materialDetails = item.materialDetails; 
    _bean1.measuringUnit = item.measuringUnit; 
    _bean1.productInStorageDetails = item.productInStorageDetails; 
    _bean1.storagelocationList = CommonFunctionUtil.mapGet(variable4.param, item.warehouse_levelTwo.id); 
} )); 
        } else {
        } 

        return result;
    } 

}
