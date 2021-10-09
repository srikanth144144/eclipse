package Strings;
import java.lang.String;
import java.util.Scanner;
public class StringDemo{
		public static void main(String args[]){

			Scanner ed= new Scanner(System.in);
			System.out.println("please enter you are string ");
			  String sy= ed.nextLine();
			  
			 System.out.println(sy);
			  
			 char[] ch = {'s','r','e','e'};
			 System.out.println(ch);
			 System.out.println(sy.length());
			 
			 // charAt
			 System.out.println(sy.charAt(10));
			 
			 
			 // boolean 
			boolean f = sy.startsWith("s");
			boolean d = sy.endsWith("e");
			System.out.println(f);
			System.out.println(d);
			
             	  
                //String conCat
                String s1 = "wel";
                String s2 = "come";
                String p = s1.concat(s2);
                System.out.println(p);
                
             	
			
			//replace()
              String s= sy.replace('s', 'r');
              System.out.println(s);
              
              //indexOf
              int z = sy.indexOf("krmr");
              int y= sy.lastIndexOf("krmr");
              System.out.println(z);
              System.out.println(y);
              
             
             //toUpper
              String r = sy.toUpperCase();
              System.out.println(r);
              
              //toLower
              String j =sy.toLowerCase();
              System.out.println(j);
              
              //trim
              String i = sy.trim();
              System.out.println(i);
            
             
              //tocharArray();
              char[] ch1 = sy.toCharArray();
              System.out.println(ch1[13]);
              
            //getchars();
              char[] chrs = new char [20];
              sy.getChars(3, 6, chrs,0);
              System.out.println(chrs);
              
              //subString
              String x = sy.substring(5,10);
              System.out.println(x);
              
              
              //split
              
              String[] l =sy.split(" ");
              int len = sy.length();
              System.out.println(l[12]);
              
              

 			 //boolean equals();
             String s4 = "Hai";
             String s5 = "Hai";
             boolean flag =s4.equals(s5);
              if (s4.equals(s5)) {
              	System.out.println("both are equales");
              }else {
              	System.out.println("bothe are not equales");
              }     
                
              //boolean equalsIgnore();
             
              String s8 = "Hai";
              String s9 = "hai";
             
               if (s8.equalsIgnoreCase(s9)) {
               	System.out.println("both are  equales");
               }else {
               	System.out.println("bothe are  not   equales");
              
              	
		}
		}
}
