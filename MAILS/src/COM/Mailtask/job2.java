package COM.Mailtask;
		import java.util.Date;
		import org.quartz.Job;
		import org.quartz.JobExecutionContext;
		import org.quartz.JobExecutionException;
		public class job2 implements Job{ 
			public void execute(JobExecutionContext context) throws JobExecutionException {
				System.out.println("Job2 --->>> Time is " + new Date());
				SendMail.sendEmail("addalasrikanth789@gmail.com","Email Testing Subject2", "Email Testing Body2");
				} 
		        }
