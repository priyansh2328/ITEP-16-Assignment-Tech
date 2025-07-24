//even or  odd

import java.util.Scanner;
class q23{
    public static void main(String args[]){

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a value: ");
       int n =  sc.nextInt();
       
       if(n%2 == 0)
         System.out.println("given value is even ");
       else
         System.out.println("given value is odd");  
    }
}