package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.repository.LoadAddPurchaseRequestorUpdateSelectCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadAddPurchaseRequestorUpdateSelectCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadAddPurchaseRequestorUpdateSelectCustomizeServiceMapper loadAddPurchaseRequestorUpdateSelectCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DA2B9A95B590E6E3C6876A301B6487BC> loadAddPurchaseRequestorUpdateSelect(Long page, Long size, List<String> ListMaterialDetailsCode) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DA2B9A95B590E6E3C6876A301B6487BC> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(loadAddPurchaseRequestorUpdateSelectCustomizeServiceMapper.getAnonymousStructure_DA2B9A95B590E6E3C6876A301B6487BC(ListMaterialDetailsCode, page, size), loadAddPurchaseRequestorUpdateSelectCustomizeServiceMapper.countAnonymousStructure_DA2B9A95B590E6E3C6876A301B6487BC(ListMaterialDetailsCode, page, size).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F0A6AD1F847998046703F6AA6DBF4445.class).list; 
        return result;
    } 


}
