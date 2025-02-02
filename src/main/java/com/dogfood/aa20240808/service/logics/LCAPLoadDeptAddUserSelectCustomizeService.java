package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.LCAPLoadDeptAddUserSelectCustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LCAPLoadDeptAddUserSelectCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LCAPLoadDeptAddUserSelectCustomizeServiceMapper lCAPLoadDeptAddUserSelectCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C477D5E68C0A882A877BCEEA4EA2DE1E lCAPLoadDeptAddUserSelect(Long page, Long size, String deptId, String search) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9C0F38CE0B1F4B46D348B17C9BB990AA> searchList = new ArrayList<>();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C477D5E68C0A882A877BCEEA4EA2DE1E result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C477D5E68C0A882A877BCEEA4EA2DE1E();
        searchList = lCAPLoadDeptAddUserSelectCustomizeServiceMapper.getAnonymousStructure_9C0F38CE0B1F4B46D348B17C9BB990AA(search, deptId); 
        if (CommonFunctionUtil.hasValue(searchList)) {
            result = CommonFunctionUtil.paginateList(CommonFunctionUtil.listDistinctBy(searchList, CommonFunctionUtil.newWithInitiation(new ArrayList<>(), _list267 -> {
    _list267.add((item) -> item.lCAPUser.id);
} )), page, size, com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C477D5E68C0A882A877BCEEA4EA2DE1E.class); 
        } else {
        } 

        return result;
    } 


}
