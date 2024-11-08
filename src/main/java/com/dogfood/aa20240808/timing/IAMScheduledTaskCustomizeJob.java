package com.dogfood.aa20240808.timing; 

import org.quartz.DisallowConcurrentExecution; 
import com.dogfood.aa20240808.timing.job.CronJob; 
import org.springframework.stereotype.Component; 
import org.quartz.JobExecutionException; 
import org.quartz.JobExecutionContext; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.service.logics.IAMScheduledTaskCustomizeService; 

@Component
@DisallowConcurrentExecution
public class IAMScheduledTaskCustomizeJob extends CronJob{

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger("IAMScheduledTaskCustomizeJob.class");

    @Autowired
    private IAMScheduledTaskCustomizeService iAMScheduledTaskCustomizeService;

    public IAMScheduledTaskCustomizeJob() {
        super("0 0 18 * * ?", "aa20240808", "IAMScheduledTask");
    } 

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        try {
            iAMScheduledTaskCustomizeService.iAMScheduledTask();
        } catch (Exception e) {
            LCAP_LOGGER.info("job执行异常", e);
            throw new JobExecutionException(e.getMessage(), e.getCause()); 
        } 
    } 

    @Override
    public String getLogicName() {
        return this.logicName;
    } 

    @Override
    public String getAppName() {
        return this.appName;
    } 

}
