



import java.util.Scanner;

 class q20 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("enter a value A : ");
        int A = sc.nextInt();


        System.out.print("enter a value of B : ");
        int  B = sc.nextInt();
//we r using  a arithmatic operator 
              A = A + B;
               B = A - B;
                 A = A - B;

                  System.out.println("A: " + A);
                  System.out.println("B: " + B);









    }}