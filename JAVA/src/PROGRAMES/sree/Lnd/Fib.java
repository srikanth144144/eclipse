public class Fib
{
public static void main (String args[])
{
int x=0;
int  y=1;
int i=1;
while (i<=5)
{
System.out.println(x);
int fib=x+y;
x=y;
y=fib;
i++;
}
}
}