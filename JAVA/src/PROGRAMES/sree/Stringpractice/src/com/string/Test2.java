package com.string;
public class Test2 {
	public static void main(String[] args) {
		//String:overriding equales() : perfome contant comparsion 
		String s1 = "srikanth";
		String s2 = "srikanth";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		String str = new String("sree");
		String st1 = new String("sree");
		System.out.println(str.equals(st1));
		System.out.println(str==st1);
	
		// StringBuffer: no class: it uses object cls equales(): REf-comp
		StringBuffer sb1 = new 	StringBuffer("shobha");
		StringBuffer sb2 = new 	StringBuffer("shobha");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb2);
        
	}
}
