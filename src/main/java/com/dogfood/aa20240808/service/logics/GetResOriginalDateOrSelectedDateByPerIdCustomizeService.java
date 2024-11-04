package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.GetResOriginalDateOrSelectedDateByPerIdCustomizeServiceMapper; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.entities.LCAPResource; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class GetResOriginalDateOrSelectedDateByPerIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private GetResOriginalDateOrSelectedDateByPerIdCustomizeServiceMapper getResOriginalDateOrSelectedDateByPerIdCustomizeServiceMapper;
    public List<LCAPResource> getResOriginalDateOrSelectedDateByPerId(Long perId, Boolean OriginalOrSelected) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A0B03992F694D9DC0DBA09379A608DAA> variable1 = new ArrayList<>();
        LambdaParamWrapper<List<Long>> variable2 = new LambdaParamWrapper<>(new ArrayList<>());
        List<LCAPResource> variable3 = new ArrayList<>();
        List<LCAPResource> result = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(getResOriginalDateOrSelectedDateByPerIdCustomizeServiceMapper.getAnonymousStructure_A0B03992F694D9DC0DBA09379A608DAA(perId), getResOriginalDateOrSelectedDateByPerIdCustomizeServiceMapper.countAnonymousStructure_A0B03992F694D9DC0DBA09379A608DAA(perId).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5925C7E01BC8350E8A9E00D46E64B452.class).list; 
        if ((CommonFunctionUtil.length(variable1).compareTo(0L) > 0)) {
            variable2.param = CommonFunctionUtil.listTransform(variable1, (item) -> item.lCAPResource.id); 
        } else {
        } 

        if (OriginalOrSelected) {
            variable3 = CommonFunctionUtil.listTransform(CommonFunctionUtil.createListPage(getResOriginalDateOrSelectedDateByPerIdCustomizeServiceMapper.getAnonymousStructure_EA050579F163467B7D2FD3E8C15362AF(variable2.param), getResOriginalDateOrSelectedDateByPerIdCustomizeServiceMapper.countAnonymousStructure_EA050579F163467B7D2FD3E8C15362AF(variable2.param).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D8CB63E646D19A8E127BF2A118560F92.class).list, (item) -> item.lCAPResource); 
        } else {
            variable3 = CommonFunctionUtil.listTransform(CommonFunctionUtil.createListPage(getResOriginalDateOrSelectedDateByPerIdCustomizeServiceMapper.getAnonymousStructure_EA050579F163467B7D2FD3E8C15362AF1(variable2.param), getResOriginalDateOrSelectedDateByPerIdCustomizeServiceMapper.countAnonymousStructure_EA050579F163467B7D2FD3E8C15362AF1(variable2.param).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D8CB63E646D19A8E127BF2A118560F92.class).list, (item) -> item.lCAPResource); 
        } 

        result = variable3; 
        return result;
    } 


}
