package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.LoadBePutInStorageListSelect_1ReceivingNotificationsCustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadBePutInStorageListSelect_1ReceivingNotificationsCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadBePutInStorageListSelect_1ReceivingNotificationsCustomizeServiceMapper loadBePutInStorageListSelect_1ReceivingNotificationsCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073> loadBePutInStorageListSelect_1ReceivingNotifications(Long page, Long size) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(loadBePutInStorageListSelect_1ReceivingNotificationsCustomizeServiceMapper.getAnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073(page, size), loadBePutInStorageListSelect_1ReceivingNotificationsCustomizeServiceMapper.countAnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073(page, size).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_15236DED8CD807484AC741CD838A113B.class).list; 
        return result;
    } 


}
