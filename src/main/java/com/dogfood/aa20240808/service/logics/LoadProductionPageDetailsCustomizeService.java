package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3EB9CA1571074F966FC0C5CC8F563CDA; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadProductionPageDetailsCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B6CF2A8509D4D6604B7DE5CA7BE93725; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F59E0BB3343234CE3AF6447EE8462582; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 生产退料
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
public class LoadProductionPageDetailsCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadProductionPageDetailsCustomizeServiceMapper loadProductionPageDetailsCustomizeServiceMapper;

    public AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A loadProductionPageDetails(Long id, DistinctionEnumEnum DistinctionEnum) {
        AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A listSalesOrder = new AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A();
        List<AnonymousStructure_F59E0BB3343234CE3AF6447EE8462582> TotalList = new ArrayList<>();
        List<String> ListOrderNumber = new ArrayList<>();
        Boolean isAdd = true;
        List<String> TrueListOrderNumber = new ArrayList<>();
        List<AnonymousStructure_3EB9CA1571074F966FC0C5CC8F563CDA> oldvalue = new ArrayList<>();
        AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A result = new AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A();
        listSalesOrder = CommonFunctionUtil.createListPage(loadProductionPageDetailsCustomizeServiceMapper.getAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E6(DistinctionEnum, id), loadProductionPageDetailsCustomizeServiceMapper.countAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E6(DistinctionEnum, id).intValue(), AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A.class); 
        ListOrderNumber = CommonFunctionUtil.listTransform(listSalesOrder.list, (item) -> item.productionMaterialRequisition.documentNumber); 
        for (Long index = 0L; index < ListOrderNumber.size(); index++) {
            String item = ListOrderNumber.get(index.intValue());
            isAdd = true; 
            oldvalue = CommonFunctionUtil.createListPage(loadProductionPageDetailsCustomizeServiceMapper.getAnonymousStructure_3EB9CA1571074F966FC0C5CC8F563CDA(item), loadProductionPageDetailsCustomizeServiceMapper.countAnonymousStructure_3EB9CA1571074F966FC0C5CC8F563CDA(item).intValue(), AnonymousStructure_B6CF2A8509D4D6604B7DE5CA7BE93725.class).list; 
            TotalList = loadProductionPageDetailsCustomizeServiceMapper.getSql1(item); 
            if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(TotalList), CommonFunctionUtil.length(oldvalue)))) {
                for (Long index1 = 0L; index1 < TotalList.size(); index1++) {
                    AnonymousStructure_F59E0BB3343234CE3AF6447EE8462582 item1 = TotalList.get(index1.intValue());
                    LCAP_LOGGER.info(CommonFunctionUtil.toString(new StringBuilder().append(CommonFunctionUtil.toString(item1)).toString()));
                    if ((CommonFunctionUtil.equals(item1.quantity, item1.total))) {
                    } else {
                        isAdd = false; 
                    } 

                } 

            } else {
                LCAP_LOGGER.info(CommonFunctionUtil.toString(new StringBuilder().append(CommonFunctionUtil.toString(oldvalue)).append(CommonFunctionUtil.toString(TotalList)).toString()));
                isAdd = false; 
            } 

            if (isAdd) {
            } else {
                CommonFunctionUtil.add(TrueListOrderNumber, CommonFunctionUtil.clone(item));
            } 

        } 

        LCAP_LOGGER.info(CommonFunctionUtil.toString(new StringBuilder().append(CommonFunctionUtil.toString(TrueListOrderNumber)).toString()));
        if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(TrueListOrderNumber), 0L))) {
        } else {
            result = CommonFunctionUtil.createListPage(loadProductionPageDetailsCustomizeServiceMapper.getAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E61(DistinctionEnum, TrueListOrderNumber), loadProductionPageDetailsCustomizeServiceMapper.countAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E61(DistinctionEnum, TrueListOrderNumber).intValue(), AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A.class); 
        } 

        return result;
    } 

}
