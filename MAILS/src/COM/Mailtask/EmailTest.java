package COM.Mailtask;
		import java.text.ParseException;
		import java.util.Properties;
		import javax.mail.Session;
		import javax.mail.Transport;
		import javax.mail.internet.AddressException;
		import javax.mail.internet.InternetAddress;
		import javax.mail.internet.MimeMessage;
		import javax.mail.Authenticator;
		import javax.mail.Message;
		import javax.mail.MessagingException;
		import javax.mail.PasswordAuthentication;
		


		public class EmailTest {
		public static void main(String[] args) throws MessagingException, ParseException, InterruptedException {

		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.port", "587");
		prop.put("mail.smtp.starttls.enable", "true");


		String acc= "addalasrikanth789@gmail.com";
		String pw = "9573450332";
		Session ses = Session.getInstance(prop, new Authenticator() {
		public PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(acc,pw);
		}
		});          
		Message     msg = new MimeMessage(ses);
		try
		{
		msg.setFrom(new InternetAddress(acc));
		}
		catch (AddressException e)
		{

		e.printStackTrace();
		}
		catch (MessagingException e) 
		{
		e.printStackTrace();
		}

		try
		{
		msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse("addalasrikanth789@gmail.com "));
		} 
		catch (AddressException e)
		{

		e.printStackTrace();
		} 
		catch (MessagingException e)
		{

		e.printStackTrace();
		}

		try 
		{
		msg.setSubject("Test Mail From JAVA app using smtp server");
		} catch (MessagingException e) 
		{

		e.printStackTrace();
		}
		msg.setText("hii friend......");

		Transport.send(msg);
		System.out.println("Sent Email Successfully");
		}
		}

