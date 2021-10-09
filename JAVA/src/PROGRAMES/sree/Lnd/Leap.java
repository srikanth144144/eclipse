public class Leap{
public static void main(String args[]){
int a=1600;
if (a%4==0){
        if(a%100==0){
              if (a%400==0){
                     System.out.println("leap year");
             }else{
                System.out.println("not leap year");
        }
        }else{ 
      System.out.println("leap year");
  }
        }else {
System.out.println(" not leap year");
}
}
}

