package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.time.LocalDate; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.GetScheduleByDateCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.entities.ScheduleEntity; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4D700BC87867E1CE58E76EB7B9E2A9F1; 

/**
 * 根据日期拿到日程信息-ljl
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
public class GetScheduleByDateCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private GetScheduleByDateCustomizeServiceMapper getScheduleByDateCustomizeServiceMapper;

    public List<ScheduleEntity> getScheduleByDate(LocalDate createDate) {
        List<ScheduleEntity> result = new ArrayList<>();
        if (CommonFunctionUtil.hasValue(createDate)) {
        } else {
            createDate = CommonFunctionUtil.currDate(); 
        } 

        result = CommonFunctionUtil.listTransform(CommonFunctionUtil.createListPage(getScheduleByDateCustomizeServiceMapper.getAnonymousStructure_3F352B7D9C6EC2FC4504021A3B87F456(createDate), getScheduleByDateCustomizeServiceMapper.countAnonymousStructure_3F352B7D9C6EC2FC4504021A3B87F456(createDate).intValue(), AnonymousStructure_4D700BC87867E1CE58E76EB7B9E2A9F1.class).list, (item) -> item.schedule); 
        return result;
    } 

}
