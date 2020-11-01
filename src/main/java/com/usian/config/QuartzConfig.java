package com.usian.config;

import com.usian.scheduled.MyJob;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;

@Configuration
public class QuartzConfig {
    //1.job-任务
    @Bean
    public JobDetailFactoryBean getJobDetailFactoryBean(){
        JobDetailFactoryBean factory = new JobDetailFactoryBean();
        factory.setJobClass(MyJob.class);
        return factory;
    }


    //2.trigger-触发
    public CronTriggerFactoryBean getCronTriggerFactoryBean(JobDetailFactoryBean job){
        CronTriggerFactoryBean factory = new CronTriggerFactoryBean();
        factory.setJobDetail(job.getObject());


    }


}
