// WAP to find greater among two number 





import java.util.Scanner;

 class q21 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("enter a number   A : ");
        int A = sc.nextInt();


        System.out.print("enter a nummber  B : ");
        int  B = sc.nextInt();


    if (A > B)  
        {
            System.out.println(A+ " is greater value");
        }
         else 
         if (B> A)
          {
         System.out.println(B + " is greater value ");
          }else
           {
          System.out.println( "both value are equal");
       }


    }}