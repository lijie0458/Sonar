package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LoadOutsourcedProcessingIntoStorageDetailSelect_24CustomizeServiceMapper; 

@Service
public class LoadOutsourcedProcessingIntoStorageDetailSelect_24CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadOutsourcedProcessingIntoStorageDetailSelect_24CustomizeServiceMapper loadOutsourcedProcessingIntoStorageDetailSelect_24CustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DA2B9A95B590E6E3C6876A301B6487BC> loadOutsourcedProcessingIntoStorageDetailSelect_24(Long page, Long size) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DA2B9A95B590E6E3C6876A301B6487BC> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(loadOutsourcedProcessingIntoStorageDetailSelect_24CustomizeServiceMapper.getAnonymousStructure_DA2B9A95B590E6E3C6876A301B6487BC(page, size), loadOutsourcedProcessingIntoStorageDetailSelect_24CustomizeServiceMapper.countAnonymousStructure_DA2B9A95B590E6E3C6876A301B6487BC(page, size).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F0A6AD1F847998046703F6AA6DBF4445.class).list; 
        return result;
    } 


}
