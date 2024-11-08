package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_59171EEBD007C582328CDFD57C58FB34; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_877151A5C34A2E69733DE529C9499F12; 
import com.dogfood.aa20240808.repository.LoadProductionPageDetailsUpdateSelect1CustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F59E0BB3343234CE3AF6447EE8462582; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 生产退料查询所有分类，退货单使用
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
public class LoadProductionPageDetailsUpdateSelect1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadProductionPageDetailsUpdateSelect1CustomizeServiceMapper loadProductionPageDetailsUpdateSelect1CustomizeServiceMapper;

    public List<AnonymousStructure_59171EEBD007C582328CDFD57C58FB34> loadProductionPageDetailsUpdateSelect1(Long page, Long size, List<String> ListMaterialDetailsCode, String orderNumber) {
        List<AnonymousStructure_F59E0BB3343234CE3AF6447EE8462582> TotalList = new ArrayList<>();
        List<AnonymousStructure_59171EEBD007C582328CDFD57C58FB34> result = new ArrayList<>();
        TotalList = loadProductionPageDetailsUpdateSelect1CustomizeServiceMapper.getSql1(orderNumber); 
        for (Long index1 = 0L; index1 < TotalList.size(); index1++) {
            AnonymousStructure_F59E0BB3343234CE3AF6447EE8462582 item1 = TotalList.get(index1.intValue());
            if ((CommonFunctionUtil.equals(item1.quantity, item1.total))) {
                CommonFunctionUtil.add(ListMaterialDetailsCode, CommonFunctionUtil.clone(item1.materialCode));
            } else {
            } 

        } 

        result = CommonFunctionUtil.createListPage(loadProductionPageDetailsUpdateSelect1CustomizeServiceMapper.getAnonymousStructure_59171EEBD007C582328CDFD57C58FB34(orderNumber, ListMaterialDetailsCode, page, size), loadProductionPageDetailsUpdateSelect1CustomizeServiceMapper.countAnonymousStructure_59171EEBD007C582328CDFD57C58FB34(orderNumber, ListMaterialDetailsCode, page, size).intValue(), AnonymousStructure_877151A5C34A2E69733DE529C9499F12.class).list; 
        return result;
    } 

}
