package Com.collections;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class DemoDate {
	public static void main(String[] args) {
		//				Date d = new Date();
		//				System.out.println(d);
		//				SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
		//			System.out.println(sd.format(d));
		//				
		//			Calendar c = Calendar.getInstance();
		//			System.out.println(c.get(Calendar.DATE));
		//			int m =c.get(Calendar.MONTH)
		//				System.out.println(++m);			
		//yyyy/dd/mm
		//dd/mm/yy 
		Calendar calendar = Calendar.getInstance(); 

		// Demonstrate Calendar's get()method 
		System.out.println("Current Calendar's Year: " + calendar.get(Calendar.YEAR)); 
		System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DAY_OF_MONTH)); 
		System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DATE)); 
		System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DAY_OF_WEEK)); 
		System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE)); 
		System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND)); 
	} 
} 



