/*.A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
INPUT : 1234        OUTPUT : 4321
INPUT : 5982        OUTPUT : 2895 */


import java.util.Scanner;

class q12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter  4 digit number: ");
        int num = sc.nextInt();

        int reversed = 0;
         if(num<1000 ||num >9999)
          {
           
        System.out.println("invalid enter value between 1000 to 9999");
         }
        else {
        while (num != 0) {
            int digit = num % 10;        //  we can get a last digit of we enter  G
            reversed = reversed * 10 + digit; 
            num = num / 10;              // num we divide by 10 so it help to remove last digit  
        }

        System.out.println("after number is reversed: " + reversed);
        }
    
    }
}





