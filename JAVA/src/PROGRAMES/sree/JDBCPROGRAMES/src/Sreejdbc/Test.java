package Sreejdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
	public static void main(String[] args) {
		Demo1121 obj = new Demo1121("ASH");
			Thread s = new Thread(obj);
			s.setName("ashfaaq");
			s.start();
	}
}
class Demo1121 implements Runnable {
	String name;
	public Demo1121(String name) {
		this.name = name;
	
	}
	@Override
	public void run() {
	
		System.out.println(name);
		Thread e =Thread.currentThread();
		System.out.println(e.getName());
		System.out.println("I am in run method");
	}	
}