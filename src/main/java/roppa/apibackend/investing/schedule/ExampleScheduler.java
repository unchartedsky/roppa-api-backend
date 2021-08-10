package roppa.apibackend.investing.schedule;

import org.quartz.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import roppa.apibackend.investing.schedule.job.ExampleJob;

import java.text.ParseException;
import java.util.TimeZone;

@Component
public class ExampleScheduler {

    @Value("${schedule.investing.example:false}")
    private String triggerParam;

    @Bean
    public JobDetail exampleJobDetail() {
        return JobBuilder.newJob(ExampleJob.class)
                .withIdentity("ExampleJob")
                .usingJobData("trigger", triggerParam)
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger exampleJobTrigger() throws ParseException {
        CronExpression scheduledTime = new CronExpression("0 50 23 * * ? *");
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(scheduledTime)
                .inTimeZone(TimeZone.getTimeZone("Asia/Seoul"));

        return TriggerBuilder.newTrigger()
                .forJob(exampleJobDetail())
                .withIdentity("exampleTrigger")
                .withSchedule(scheduleBuilder)
                .build();
    }
}
