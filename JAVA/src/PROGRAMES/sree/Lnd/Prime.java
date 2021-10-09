public class Prime{
public static void main(String args[]){
int num=1;
int count=0;
int i=1;
while(i<=num){
if(num%i==0)
{
count++;
}
i++;
}
if(count==2)
{
System.out.println("prime number:"+num);
}
else System.out.println("not prime");

}
}
