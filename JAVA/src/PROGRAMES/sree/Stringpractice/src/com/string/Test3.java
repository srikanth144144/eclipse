package com.string;
public class Test3 {
	 int id ;
	 String name;
	public Test3(int id, String name) {
		this.id = id;
		this.name = name;	
	}
	@Override
	public String toString() {
		return "Test3 [id=" + id + ", name=" + name + "]";
	}
	public static void main(String args[]) {		
		Test3 t = new Test3(105,"srikanth");
		System.out.println(t);
		System.out.println(t.toString());	
		
	String s= new String("sreekanth");
	System.out.println(s);
	System.out.println(s.toString());
	
	StringBuffer sb = new StringBuffer("shobha");
		System.out.println(sb);
		System.out.println(sb.toString());
	}
}
