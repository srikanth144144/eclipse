package COM.Mailtask;
		import org.quartz.CronScheduleBuilder;
		import org.quartz.JobBuilder;
		import org.quartz.JobDetail;
		import org.quartz.Scheduler;
		import org.quartz.Trigger;
		import org.quartz.TriggerBuilder;
		import org.quartz.impl.StdSchedulerFactory;
		public class Sched extends Thread{
			public static void schdr() {
				try {
					JobDetail job1 = JobBuilder.newJob(Details.class)
							.withIdentity("job1", "group1").build();

					Trigger trigger1 = TriggerBuilder.newTrigger()
							.withIdentity("cronTrigger1", "group1")
							.withSchedule(CronScheduleBuilder.cronSchedule("0 55 17 ? * * * "))
							.build();
					
					Scheduler scheduler1 = new StdSchedulerFactory().getScheduler();
					scheduler1.start();
					scheduler1.scheduleJob(job1, trigger1);

					Thread.sleep(100000);
					scheduler1.shutdown();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	
