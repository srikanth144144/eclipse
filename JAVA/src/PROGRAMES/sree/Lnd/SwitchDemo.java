public class SwitchDemo{
public static void main(String args[]){
int a =10;
int b=20;
int number = 1;
switch(number){
case 1:
System.out.println(a+b);
break;
case 2:
System.out.println(a-b);
break;
case 3 :
System.out.println(a*b);
break;
case 4: System.out.println(a/b);
break;
case 5: System.out.println(a%b);
break;
default:
System.out.println(0);

}
}
}