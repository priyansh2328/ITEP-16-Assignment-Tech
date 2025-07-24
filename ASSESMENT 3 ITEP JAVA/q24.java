//given value is positive or nagative
import java .util.Scanner;
class q24 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a value:");
       int n =  sc.nextInt();
       
       if(n > 0)
         System.out.println("value is positive");

       else
       {
         if(n < 0)
           System.out.println("value is nagative");
         else
           System.out.println("Neither positive nor nagative");//zero = value 
       }  
    }
}