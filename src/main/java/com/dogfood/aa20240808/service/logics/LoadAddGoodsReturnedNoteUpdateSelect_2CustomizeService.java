package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadAddGoodsReturnedNoteUpdateSelect_2CustomizeServiceMapper; 
import java.util.HashMap; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1E23DBE8403ACA8567D474034F6EAA1D; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import java.util.Map; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_611269E21EE6FE18529B487D4B579CBA; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_509F24060C1187880735EB6970D1B3E4; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0BD7E5F7F4FE0AF7AF9130D7DA795E6A; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_44DDCA8E610FBE93A315D2A8A0839035; 
import com.dogfood.aa20240808.config.Constants; 
import java.math.BigDecimal; 

/**
 * 退货单选择订单逻辑
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
public class LoadAddGoodsReturnedNoteUpdateSelect_2CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadAddGoodsReturnedNoteUpdateSelect_2CustomizeServiceMapper loadAddGoodsReturnedNoteUpdateSelect_2CustomizeServiceMapper;

    @Autowired
    private LoadGoodsReturnedNoteByBePutInStorageCustomizeService loadGoodsReturnedNoteByBePutInStorageCustomizeService;

    @Autowired
    private LoadBePutInStorageDetailByIdCustomizeService loadBePutInStorageDetailByIdCustomizeService;

    @Autowired
    private LoadReturnByBePutInStorageDetailIdCustomizeService loadReturnByBePutInStorageDetailIdCustomizeService;

    public List<AnonymousStructure_611269E21EE6FE18529B487D4B579CBA> loadAddGoodsReturnedNoteUpdateSelect_2(Long page, Long size) {
        AnonymousStructure_44DDCA8E610FBE93A315D2A8A0839035 variable1 = new AnonymousStructure_44DDCA8E610FBE93A315D2A8A0839035();
        AnonymousStructure_1E23DBE8403ACA8567D474034F6EAA1D count = new AnonymousStructure_1E23DBE8403ACA8567D474034F6EAA1D();
        Boolean isAdd = true;
        List<String> List = new ArrayList<>();
        AnonymousStructure_0BD7E5F7F4FE0AF7AF9130D7DA795E6A variable2 = new AnonymousStructure_0BD7E5F7F4FE0AF7AF9130D7DA795E6A();
        List<AnonymousStructure_509F24060C1187880735EB6970D1B3E4> variable3 = new ArrayList<>();
        Map<Long, Long> Map = new HashMap<>();
        List<AnonymousStructure_611269E21EE6FE18529B487D4B579CBA> result = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(loadAddGoodsReturnedNoteUpdateSelect_2CustomizeServiceMapper.getAnonymousStructure_611269E21EE6FE18529B487D4B579CBA(page, size), loadAddGoodsReturnedNoteUpdateSelect_2CustomizeServiceMapper.countAnonymousStructure_611269E21EE6FE18529B487D4B579CBA(page, size).intValue(), AnonymousStructure_44DDCA8E610FBE93A315D2A8A0839035.class); 
        for (Long index = 0L; index < variable1.list.size(); index++) {
            AnonymousStructure_611269E21EE6FE18529B487D4B579CBA item = variable1.list.get(index.intValue());
            isAdd = true; 
            count = loadGoodsReturnedNoteByBePutInStorageCustomizeService.loadGoodsReturnedNoteByBePutInStorage(item.bePutInStorage.bePutInStorageId); 
            if ((count.total.compareTo(0L) > 0)) {
                variable2 = loadBePutInStorageDetailByIdCustomizeService.loadBePutInStorageDetailById(item.bePutInStorage.bePutInStorageId); 
                variable3 = loadReturnByBePutInStorageDetailIdCustomizeService.loadReturnByBePutInStorageDetailId(CommonFunctionUtil.listTransform(variable2.list, (item3) -> item3.bePutInStorageDetails.id)); 
                Map = CommonFunctionUtil.listToMap(variable2.list, (item1) -> item1.bePutInStorageDetails.id, (item1) -> item1.bePutInStorageDetails.bePutInStorageQuantity); 
                for (Long index1 = 0L; index1 < variable3.size(); index1++) {
                    AnonymousStructure_509F24060C1187880735EB6970D1B3E4 item4 = variable3.get(index1.intValue());
                    if ((CommonFunctionUtil.equals(item4.total, BigDecimal.valueOf(CommonFunctionUtil.mapGet(Map, item4.bePutInStorageDetailsId))))) {
                    } else {
                        isAdd = false; 
                    } 

                } 

            } else {
                isAdd = false; 
            } 

            if (isAdd) {
            } else {
                CommonFunctionUtil.add(List, CommonFunctionUtil.clone(item.bePutInStorage.bePutInStorageId));
            } 

        } 

        if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(List), 0L))) {
        } else {
            result = CommonFunctionUtil.createListPage(loadAddGoodsReturnedNoteUpdateSelect_2CustomizeServiceMapper.getAnonymousStructure_611269E21EE6FE18529B487D4B579CBA1(page, size, List), loadAddGoodsReturnedNoteUpdateSelect_2CustomizeServiceMapper.countAnonymousStructure_611269E21EE6FE18529B487D4B579CBA1(page, size, List).intValue(), AnonymousStructure_44DDCA8E610FBE93A315D2A8A0839035.class).list; 
        } 

        return result;
    } 

}
