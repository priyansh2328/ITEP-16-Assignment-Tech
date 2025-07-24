import java.util.Scanner;
  
  class q45 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
   
    
System.out.println("a :");
 int a = sc.nextInt();
    
    
System.out.println("d :");
   int d = sc.nextInt();
    
       
System.out.println("N:");
 int n = sc.nextInt();

 
        int sum = (n*(2*a+(n-1)*d))/2;  //formula  used

        System.out.println("Sum of 28 terms = " + sum);
    }
}