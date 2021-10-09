public class Ternar{
public static void main(String args[]){
int a=54;
int b=45;
int max=(a>b)?a:b;
System.out.println(max);
String min =(a>b)?"a is big": "b is small";
String min1 =(a>=b)?"a is big": "b is small";
String min2=(a<=b)?"a is big": "b is small";
String min3 =(a<b)?"a is big": "b is small";
String min4 =(a!=b)?"a is big": "b is small";
String min5=(a==b)?"a is big": "b is small";
System.out.println(min);
System.out.println(min1);
System.out.println(min2);
System.out.println(min3);
System.out.println(min4);
System.out.println(min5);
}
}cj