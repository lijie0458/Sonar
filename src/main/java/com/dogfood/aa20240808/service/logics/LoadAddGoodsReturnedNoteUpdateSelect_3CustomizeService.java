package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_10F2061EB738BC3413E904F245F8BF2E; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import java.util.Map; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_509F24060C1187880735EB6970D1B3E4; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import java.math.BigDecimal; 
import com.dogfood.aa20240808.repository.LoadAddGoodsReturnedNoteUpdateSelect_3CustomizeServiceMapper; 

/**
 * 退货单点击新增弹框选择的数据逻辑
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
public class LoadAddGoodsReturnedNoteUpdateSelect_3CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadAddGoodsReturnedNoteUpdateSelect_3CustomizeServiceMapper loadAddGoodsReturnedNoteUpdateSelect_3CustomizeServiceMapper;

    @Autowired
    private LoadReturnByBePutInStorageDetailIdCustomizeService loadReturnByBePutInStorageDetailIdCustomizeService;

    public AnonymousStructure_10F2061EB738BC3413E904F245F8BF2E loadAddGoodsReturnedNoteUpdateSelect_3(Long page, Long size, String BeputlnStorageId, List<Long> BePulnStorageDetailsIdList) {
        AnonymousStructure_10F2061EB738BC3413E904F245F8BF2E variable1 = new AnonymousStructure_10F2061EB738BC3413E904F245F8BF2E();
        List<AnonymousStructure_509F24060C1187880735EB6970D1B3E4> variable3 = new ArrayList<>();
        Map<Long, Long> Map = new HashMap<>();
        Boolean isAdd = false;
        List<Long> List = new ArrayList<>();
        AnonymousStructure_10F2061EB738BC3413E904F245F8BF2E result = new AnonymousStructure_10F2061EB738BC3413E904F245F8BF2E();
        variable1 = CommonFunctionUtil.createListPage(loadAddGoodsReturnedNoteUpdateSelect_3CustomizeServiceMapper.getAnonymousStructure_96B800EA1E75C8827BC9F842B609AA02(BeputlnStorageId, BePulnStorageDetailsIdList, page, size), loadAddGoodsReturnedNoteUpdateSelect_3CustomizeServiceMapper.countAnonymousStructure_96B800EA1E75C8827BC9F842B609AA02(BeputlnStorageId, BePulnStorageDetailsIdList, page, size).intValue(), AnonymousStructure_10F2061EB738BC3413E904F245F8BF2E.class); 
        if ((CommonFunctionUtil.equals(variable1.total, 0L))) {
        } else {
            variable3 = loadReturnByBePutInStorageDetailIdCustomizeService.loadReturnByBePutInStorageDetailId(CommonFunctionUtil.listTransform(variable1.list, (item3) -> item3.bePutInStorageDetails.id)); 
        } 

        if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(variable3), 0L))) {
            result = CommonFunctionUtil.createListPage(loadAddGoodsReturnedNoteUpdateSelect_3CustomizeServiceMapper.getAnonymousStructure_96B800EA1E75C8827BC9F842B609AA021(BeputlnStorageId, BePulnStorageDetailsIdList, page, size), loadAddGoodsReturnedNoteUpdateSelect_3CustomizeServiceMapper.countAnonymousStructure_96B800EA1E75C8827BC9F842B609AA021(BeputlnStorageId, BePulnStorageDetailsIdList, page, size).intValue(), AnonymousStructure_10F2061EB738BC3413E904F245F8BF2E.class); 
        } else {
            Map = CommonFunctionUtil.listToMap(variable1.list, (item1) -> item1.bePutInStorageDetails.id, (item1) -> item1.bePutInStorageDetails.bePutInStorageQuantity); 
            for (Long index1 = 0L; index1 < variable3.size(); index1++) {
                AnonymousStructure_509F24060C1187880735EB6970D1B3E4 item4 = variable3.get(index1.intValue());
                isAdd = true; 
                if ((CommonFunctionUtil.equals(item4.total, BigDecimal.valueOf(CommonFunctionUtil.mapGet(Map, item4.bePutInStorageDetailsId))))) {
                } else {
                    isAdd = false; 
                } 

                if (isAdd) {
                } else {
                    CommonFunctionUtil.add(List, item4.bePutInStorageDetailsId);
                } 

            } 

            result = CommonFunctionUtil.createListPage(loadAddGoodsReturnedNoteUpdateSelect_3CustomizeServiceMapper.getAnonymousStructure_96B800EA1E75C8827BC9F842B609AA022(BeputlnStorageId, page, size, List), loadAddGoodsReturnedNoteUpdateSelect_3CustomizeServiceMapper.countAnonymousStructure_96B800EA1E75C8827BC9F842B609AA022(BeputlnStorageId, page, size, List).intValue(), AnonymousStructure_10F2061EB738BC3413E904F245F8BF2E.class); 
        } 

        return result;
    } 

}
