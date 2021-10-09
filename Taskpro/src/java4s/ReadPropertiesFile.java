package java4s;

import java.io.FileInputStream;
import java.util.Properties;
import javaConstants.Constants;

public class ReadPropertiesFile
{
	public  static void readConfig() throws Exception
	{
		try
		{

		    Properties pro = new Properties();
		    String path = System.getProperty("user.dir")+"/java4s_Props.properties";
		    pro.load(new FileInputStream(path));	   

		    Constants.delay = pro.getProperty("delay");
		    Constants.timetoquery = pro.getProperty("timetoquery");
		    Constants.setFrom = pro.getProperty("setFrom");
		    Constants.setPassword = pro.getProperty("setPassword");
		    Constants.emailTO = pro.getProperty("emailTO");	  		   

		}
		catch(Exception e)
		{
            throw new Exception(e);
		}

	}

}