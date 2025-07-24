import java.util.Scanner;
  
  class q44 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
    
System.out.println("a :");
 int a = sc.nextInt();
    
    
System.out.println("d :");
   int d = sc.nextInt();
    
       
System.out.println("N:");
 int n = sc.nextInt();
    

 int NTH  = (a + (n-1)*d);
 System.out.println("nth term of A.P = "+NTH);

    }}