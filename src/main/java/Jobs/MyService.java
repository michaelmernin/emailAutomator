package Jobs;

import org.quartz.JobDetail;
import org.quartz.Trigger;

import static java.util.concurrent.TimeUnit.MINUTES;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;
import static org.quartz.TriggerKey.triggerKey;

public class MyService {

//    JobDetail job = newJob(MyJob.class)
//            .withIdentity("myJob")
//            .build();
//
//    Trigger trigger = newTrigger()
//            .withIdentity(triggerKey("myTrigger", "myTriggerGroup"))
//            .withSchedule(simpleSchedule()
//                    .withIntervalInHours(1)
//                    .repeatForever())
//            .startAt(futureDate(10, MINUTES))
//            .build();
//
//         scheduler.scheduleJob(job, trigger);
}
