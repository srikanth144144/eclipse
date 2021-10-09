public class Ang
{
public static void main(String args[])
{
int num= 121;
int org=num, rem;
int result=0;
while(org!=0)
{
rem=org%10;
result=result*10+rem;
org=org/10;
}
if(result==num)
{
System.out.println("palendrum number");
}else{
System.out.println("not palendrum  number");
}
}
}
