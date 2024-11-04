package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.PERGetAllUserCustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class PERGetAllUserCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private PERGetAllUserCustomizeServiceMapper pERGetAllUserCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_47C167E7217746A55100F50A57F637C0> pERGetAllUser() {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_47C167E7217746A55100F50A57F637C0> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(pERGetAllUserCustomizeServiceMapper.getAnonymousStructure_47C167E7217746A55100F50A57F637C0(), pERGetAllUserCustomizeServiceMapper.countAnonymousStructure_47C167E7217746A55100F50A57F637C0().intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632.class).list; 
        return result;
    } 


}
