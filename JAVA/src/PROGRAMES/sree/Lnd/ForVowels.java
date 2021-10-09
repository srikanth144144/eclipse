public class ForVowels
{
public static void main(String args[])
{
char ch[] = {'a','a','b','c','a','e','i','o','e','d'};
char ch1[] = {'a','e','i','o','u'};

for(int i=0;i<ch1.length;i++){
int count=0;
for(int j=0;j<ch.length;j++){
if (ch1[i]==ch[j]){
count++;
}
}
System.out.println(ch1[i]+"  "+count);
}
}
}


