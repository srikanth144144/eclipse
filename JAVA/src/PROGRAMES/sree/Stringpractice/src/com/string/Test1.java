package com.string;
public class Test1 {
	public static void main(String[] args) {
		//without using new Operater
	 String s1 ="srikanth";
	 String s2 ="Anu";
	 String s3 ="srikanth";
	 System.out.println(s1==s2);
	 System.out.println(s1==s3);
	 System.out.println(s2==s3);
	 	//by using new Operater
	 String sb1 = new String("srikanth");
	 String sb2 = new String("Anu");
	 String sb3 = new String("srikanth");
	 System.out.println(sb1==sb2);
	 System.out.println(sb1==sb3);
	 System.out.println(sb3==sb2);
	 
	 //string  immutable
	 String s ="srikanth";
	 s.concat("bodas");
	 System.out.println(s);
	 
	 String str =s.concat("bodasu");
	 System.out.println(str);
	 
	 //interview question concat() used to combine the two obj return new string..
	 String st ="srikanth";
	 st=st.concat("sree");
	 System.out.println(st);
	 
	 //String is mutable 
	 StringBuffer sb = new StringBuffer("srikanth");
	 sb.append("bodas");
	 System.out.println(sb);	 
	}
}
