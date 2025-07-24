//  W.A.P to check whether given number is even or odd Without using % operator. 

import java.util.Scanner;

    class q33 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int n1 = num/2;
        int n2 = n1*2;
        
        
        if (n2==num) //  W.A.P to check whether given number is even or odd Without using % operator. 
        {
            System.out.println(num + " is Even.");
        } 
        else
         {
            System.out.println(num + " is Odd.");
        }

            }
}













