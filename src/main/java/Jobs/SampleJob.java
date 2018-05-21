package Jobs;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class SampleJob extends QuartzJobBean {

    private MyService myService;

    private String name;

    public void setMyService(MyService myService){

    }

    public void setName(String name) {

    }

    @Override
    protected void executeInternal(JobExecutionContext context)
        throws JobExecutionException{

    }
}
