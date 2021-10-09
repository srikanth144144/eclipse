public class Count
{
public static void main(String args[])
{
char cha1[] = {'a','b','c','d','a','e','a'};
char ch = 'a';
int count = 0;
 for (int i=0; i<cha1.length;i++){

if(ch==cha1[i]){
count++;
}
}
System.out.println(ch +"   "+count);
}
}