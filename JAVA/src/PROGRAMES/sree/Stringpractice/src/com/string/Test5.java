package com.string;
public class Test5 {
	public static void main(String[] args) {
		//EQUALES()
	 String str = "srikanth";
	 System.out.println(str.equals("SRIKANTH"));
	 String str1 = new String("srikanth");
	 System.out.println(str1.equals(str));
	 System.out.println(str1==str);
	 
	 //equalesIgnoreCase
	 String sr = "srikanth";
	 System.out.println(sr.equalsIgnoreCase("SRIKANTH"));
	 
	 //CompareTo()
	 String st ="Srikanth";
	 System.out.println(st.compareTo("srikanth"));
	    
	 //compareToIgnorecase
	 String s ="srikanth";
	 System.out.println(s.compareToIgnoreCase("SRIKANTH"));

	}
}
