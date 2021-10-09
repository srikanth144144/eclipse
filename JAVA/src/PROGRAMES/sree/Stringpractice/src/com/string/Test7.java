package com.string;
public class Test7 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(" hai srikanth");
		System.out.println(sb.delete(1, 3));
		System.out.println(sb.deleteCharAt(2));
		
		StringBuffer se = new StringBuffer(" SRIKANTH");
		System.out.println(se.reverse());
		
		StringBuffer sg = new StringBuffer("bodasu");
		System.out.println(sg.append("srikanth"));
		
		StringBuffer sj = new StringBuffer("hai srikanth");
		System.out.println(sj.insert(4, "sree  "));
	    System.out.println(sj.replace(3, 12, "sree"));
	}

}
