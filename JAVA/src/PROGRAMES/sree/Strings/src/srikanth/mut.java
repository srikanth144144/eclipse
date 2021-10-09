package srikanth;

import java.io.*;
public class mut{
public static void main(String args[])throws IOException{

BufferedReader s =new BufferedReader(new InputStreamReader(System.in));

System.out.println("please enter num one");
String numone = s.readLine();
int n1 = Integer.parseInt(numone);


System.out.println("please enter num two");
String numtwo = s.readLine();
int n2 = Integer.parseInt(numtwo);

System.out.println("sum of numone and numtwo : " +(n1/n2));



}



}