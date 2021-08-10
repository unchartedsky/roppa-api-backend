package roppa.apibackend.investing.schedule.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class ExampleJob extends QuartzJobBean {

    private String trigger;

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        if (trigger.equalsIgnoreCase("true") == false) {
            return;
        }

    }
}
