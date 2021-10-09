package com.string;

import java.util.StringTokenizer;

public class Test8 {
	public static void main(String[] args) {
		 StringTokenizer st = new StringTokenizer("hai sir how are you");
	 while(st.hasMoreElements()) {
			 String s = (String)st.nextElement();
			 System.out.println(s);
	 }
		 System.out.println("======================");
			 StringTokenizer st1 = new StringTokenizer("hai sir how are you");
			 while(st1.hasMoreTokens()) {
				 String gh = st1.nextToken();
				 System.out.println(gh);
			 }
		 }
	}

