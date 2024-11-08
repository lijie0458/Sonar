package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.service.dto.filters.atomic.ColumnQueryFilter; 
import com.dogfood.aa20240808.service.entities.AppCacheEntityService; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.service.dto.filters.logic.binary.compare.LtQueryFilter; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.service.dto.filters.atomic.IdentifierQueryFilter; 
import com.dogfood.aa20240808.service.dto.filters.atomic.ColumnQueryFilter.Property; 

/**
 * iam定时任务
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
public class IAMScheduledTaskCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private AppCacheEntityService appCacheEntityService;

    public void iAMScheduledTask() {
        Long l = 0L;
        l = CommonFunctionUtil.convert(CommonFunctionUtil.currDateTime("global"), Long.class); 
        appCacheEntityService.deleteBy(new LtQueryFilter().left(new ColumnQueryFilter("", "", "expiration", "expiration", new ColumnQueryFilter.Property("", "expiration"))).right(new IdentifierQueryFilter("l", l)));
        return ;
    } 

}
