package com.string;
public class Test6 {
	public static void main(String[] args) {
			String sr = "  srikanth bodas  ";
			System.out.println(sr.charAt(2));
			System.out.println(sr.indexOf('a'));
			System.out.println(sr.lastIndexOf('a'));
			System.out.println(sr.length());
			System.out.println(sr.trim());
			System.out.println(sr);
			System.out.println(sr.substring(2));
			
			String str ="Srikanth hai ";
			System.out.println(str.startsWith("S"));
			System.out.println(str.startsWith("h"));
			System.out.println(str.endsWith("t"));
			System.out.println(str.endsWith("h"));
			System.out.println(str.contains("hai"));
			System.out.println(str.contains("sree"));
			
			String st = "  sreekanth   ";
			System.out.println(st.trim());
			System.out.println(st.trim().substring(3));
			System.out.println(st.trim().substring(2).length());
			
			int [] a = {20,48,74,75,54};
			System.out.println(a.length);
			
			String sd ="srikanth";
			System.out.println(sd.length());
			
			String sa = " hai srikanth how are you";
			String[] se =sa.split(" ");
			for(String ss:se) {
				System.out.println(ss);
			}
	}
}
