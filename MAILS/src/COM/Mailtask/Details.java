package COM.Mailtask;
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.ResultSet;
		import java.sql.SQLException;
		import java.sql.Statement;
		import java.util.Date;
		import org.quartz.Job;
		import org.quartz.JobExecutionContext;
	    import org.quartz.JobExecutionException;
		public class Details implements Job {

			@Override
			public void execute(JobExecutionContext context) throws JobExecutionException {
				try {
					DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SRIKANTH","shobha144144#");

					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("select * from mailprogram");

					while (rs.next()) {
						System.out.println("Job1 --->>> Time is " + new Date());
						SendMail.sendEmail(rs.getString(3), "Your Timings",
								"Check_in: " + rs.getString(4) + " " + "Check_out: " + rs.getString(5));
					}
				} catch (Exception e) {
		     System.out.println(e.getMessage());
		}
	}
}


