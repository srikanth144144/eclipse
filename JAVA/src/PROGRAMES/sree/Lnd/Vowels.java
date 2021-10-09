public class Vowels
{
public static void main(String args[])
{
String st[] = {"a","a","b","c","a","e","i","o","e","d"};
String st1[] = {"a","e","i","o","u"};

for(int i=0;i<st1.length;i++){
int count=0;
for(int j=0;j<st.length;j++){

if (st1[i]==st[j]){
count++;

}
}
System.out.println(st1[i]+"  "+count);
}
}
}


