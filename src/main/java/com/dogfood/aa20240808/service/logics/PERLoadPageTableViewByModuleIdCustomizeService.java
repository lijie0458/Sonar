package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.PERLoadPageTableViewByModuleIdCustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class PERLoadPageTableViewByModuleIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private PERLoadPageTableViewByModuleIdCustomizeServiceMapper pERLoadPageTableViewByModuleIdCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DA5E0BE32CB03F09D1E3DB37B65BA82E> pERLoadPageTableViewByModuleId(Long moduleId) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DA5E0BE32CB03F09D1E3DB37B65BA82E> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(pERLoadPageTableViewByModuleIdCustomizeServiceMapper.getAnonymousStructure_DA5E0BE32CB03F09D1E3DB37B65BA82E(moduleId), pERLoadPageTableViewByModuleIdCustomizeServiceMapper.countAnonymousStructure_DA5E0BE32CB03F09D1E3DB37B65BA82E(moduleId).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_7762A7CA7CDEBBDAF8F5AF018CB9AFB3.class).list; 
        return result;
    } 


}
