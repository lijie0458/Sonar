package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LCAPJudgeDeptIdRepeatedCustomizeServiceMapper; 

@Service
public class LCAPJudgeDeptIdRepeatedCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LCAPJudgeDeptIdRepeatedCustomizeServiceMapper lCAPJudgeDeptIdRepeatedCustomizeServiceMapper;
    public Boolean lCAPJudgeDeptIdRepeated(String deptId) {
        List<String> searchList = new ArrayList<>();
        List<String> deptIdList = new ArrayList<>();
        Boolean result = false;
        searchList = lCAPJudgeDeptIdRepeatedCustomizeServiceMapper.getString(); 
        if ((CommonFunctionUtil.length(searchList).compareTo(0L) > 0)) {
            for (Long index = 0L; index < searchList.size(); index++) {
                String item = searchList.get(index.intValue());
                CommonFunctionUtil.add(deptIdList, CommonFunctionUtil.toLower(CommonFunctionUtil.clone(item)));
            } 

            if (CommonFunctionUtil.contains(deptIdList, CommonFunctionUtil.toLower(deptId))) {
                result = true; 
            } else {
                result = false; 
            } 

        } else {
            result = false; 
        } 

        return result;
    } 


}
