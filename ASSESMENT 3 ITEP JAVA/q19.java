
//WAP to exchange value to two variable with third variable and without third variable


import java.util.Scanner;

 class q19 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("enter a value A : ");
        int A = sc.nextInt();


        System.out.print("enter a value of B : ");
        int  B = sc.nextInt();


System.out.println("before swapping "+A);

System.out.println("before swapping "+B);

           A = A-B; //swapping without third varible 
         B = A+B;
         A = B-A;

          System.out.println( " after Swapping without third variable ");
        System.out.println("A :" +A );
        System.out.println("B :" +B );


        int C = A;
        A=B;
        B=C;
        System.out.println( " after swapping Swapping with third variable ");
         System.out.println("A: " + A);
        System.out.println("B: " + B);

    }}