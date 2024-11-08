package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B55C7AE154A0D6F65C15E745BB30A382; 
import java.util.HashMap; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606; 
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

/**
 * 根据委托加工入库单号拿到入库详情
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
public class GetWarehousingDetailsByCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private GetWarehousingDetailsByCodeCustomizeServiceMapper getWarehousingDetailsByCodeCustomizeServiceMapper;

    public List<OutsourceInStorageDetailsStrutureStructure> getWarehousingDetailsByCode(String Code) {
        AnonymousStructure_B55C7AE154A0D6F65C15E745BB30A382 variable1 = new AnonymousStructure_B55C7AE154A0D6F65C15E745BB30A382();
        List<Long> variable2 = new ArrayList<>();
        AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606 variable3 = new AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606();
        LambdaParamWrapper<Map<Long, List<Storage_locationEntity>>> variable4 = new LambdaParamWrapper<>(new HashMap<>());
        List<Storage_locationEntity> variable5 = new ArrayList<>();
        List<OutsourceInStorageDetailsStrutureStructure> result = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(getWarehousingDetailsByCodeCustomizeServiceMapper.getAnonymousStructure_77A91D1F4D3302BA86978D8B97972F3D(Code), getWarehousingDetailsByCodeCustomizeServiceMapper.countAnonymousStructure_77A91D1F4D3302BA86978D8B97972F3D(Code).intValue(), AnonymousStructure_B55C7AE154A0D6F65C15E745BB30A382.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            variable2 = CommonFunctionUtil.listTransform(variable1.list, (item) -> item.warehouse_levelTwo.id); 
            variable3 = CommonFunctionUtil.createListPage(getWarehousingDetailsByCodeCustomizeServiceMapper.getAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(variable2), getWarehousingDetailsByCodeCustomizeServiceMapper.countAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(variable2).intValue(), AnonymousStructure_0F432FDC73BF41FE20EF251CF1801606.class); 
            if ((variable3.total.compareTo(0L) > 0)) {
                variable5 = CommonFunctionUtil.listTransform(variable3.list, (item) -> item.storage_location); 
                for (Long index = 0L; index < variable2.size(); index++) {
                    Long item = variable2.get(index.intValue());
                    CommonFunctionUtil.mapPut(variable4.param, item, CommonFunctionUtil.listFilter(variable5, (item1) -> (CommonFunctionUtil.equals(item, item1.warehouse_codetwo_id))));
                } 

            } else {
            } 

            result = CommonFunctionUtil.listTransform(variable1.list, (item) -> CommonFunctionUtil.newWithInitiation(new OutsourceInStorageDetailsStrutureStructure(), _bean1 -> {
    _bean1.outsourceInStorageDetails = item.outsourceInStorageDetails; 
    _bean1.materialDetails = item.materialDetails; 
    _bean1.measuringUnit = item.measuringUnit; 
    _bean1.inventory = item.inventory; 
    _bean1.storagelocationList = CommonFunctionUtil.mapGet(variable4.param, item.warehouse_levelTwo.id); 
    _bean1.warehouse = item.warehouse_levelTwo; 
} )); 
        } else {
        } 

        return result;
    } 

}
