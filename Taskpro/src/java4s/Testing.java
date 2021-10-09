package java4s;

import java.util.TimerTask;
import javaConstants.Constants;

public class Testing extends TimerTask
{

	public void run()
	{

                GMailServer sender = new GMailServer(Constants.setFrom, Constants.setPassword);

	            try {
	            	String subject = "java scheduler";
	            	String message = "How are you sir, Hope you doing great. We have sucessfully completed our task.";
			    sender.sendMail(subject,message,Constants.setFrom,Constants.emailTO);
			}
                   catch (Exception e) {
			     e.printStackTrace();
			}  

				System.out.println("Email Sent Succesfully...");

	        }
}