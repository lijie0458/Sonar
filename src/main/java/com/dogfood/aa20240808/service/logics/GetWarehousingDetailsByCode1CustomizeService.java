package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.GetWarehousingDetailsByCode1CustomizeServiceMapper; 
import java.util.HashMap; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606; 
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
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_17A69820EFC40EEFE36B908E394A60C7; 

/**
 * 根据其他入库单号拿到入库详情
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
public class GetWarehousingDetailsByCode1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private GetWarehousingDetailsByCode1CustomizeServiceMapper getWarehousingDetailsByCode1CustomizeServiceMapper;

    public List<OtherInStorageDetailsStrutureStructure> getWarehousingDetailsByCode1(String Code) {
        AnonymousStructure_17A69820EFC40EEFE36B908E394A60C7 variable1 = new AnonymousStructure_17A69820EFC40EEFE36B908E394A60C7();
        List<Long> variable2 = new ArrayList<>();
        AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606 variable3 = new AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606();
        LambdaParamWrapper<Map<Long, List<Storage_locationEntity>>> variable4 = new LambdaParamWrapper<>(new HashMap<>());
        List<Storage_locationEntity> variable5 = new ArrayList<>();
        List<OtherInStorageDetailsStrutureStructure> result = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(getWarehousingDetailsByCode1CustomizeServiceMapper.getAnonymousStructure_CA8F7694D8827E13359AFAFE050C3CB8(Code), getWarehousingDetailsByCode1CustomizeServiceMapper.countAnonymousStructure_CA8F7694D8827E13359AFAFE050C3CB8(Code).intValue(), AnonymousStructure_17A69820EFC40EEFE36B908E394A60C7.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            variable2 = CommonFunctionUtil.listTransform(variable1.list, (item) -> item.warehouse_levelTwo.id); 
            variable3 = CommonFunctionUtil.createListPage(getWarehousingDetailsByCode1CustomizeServiceMapper.getAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(variable2), getWarehousingDetailsByCode1CustomizeServiceMapper.countAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(variable2).intValue(), AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606.class); 
            if ((variable3.total.compareTo(0L) > 0)) {
                variable5 = CommonFunctionUtil.listTransform(variable3.list, (item) -> item.storage_location); 
                for (Long index = 0L; index < variable2.size(); index++) {
                    Long item = variable2.get(index.intValue());
                    CommonFunctionUtil.mapPut(variable4.param, item, CommonFunctionUtil.listFilter(variable5, (item1) -> (CommonFunctionUtil.equals(item, item1.warehouse_codetwo_id))));
                } 

            } else {
            } 

            result = CommonFunctionUtil.listTransform(variable1.list, (item) -> CommonFunctionUtil.newWithInitiation(new OtherInStorageDetailsStrutureStructure(), _bean1 -> {
    _bean1.inventory = item.inventory; 
    _bean1.materialDetails = item.materialDetails; 
    _bean1.measuringUnit = item.measuringUnit; 
    _bean1.otherInStorageDetails = item.otherInStorageDetails; 
    _bean1.warehouse = item.warehouse_levelTwo; 
    _bean1.storagelocationList = CommonFunctionUtil.mapGet(variable4.param, item.warehouse_levelTwo.id); 
} )); 
        } else {
        } 

        return result;
    } 

}
