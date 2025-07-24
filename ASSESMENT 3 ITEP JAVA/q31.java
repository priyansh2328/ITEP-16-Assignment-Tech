/*
16. W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit. For given 
problem you have to take choice from user. If user enter choice ‘c’ or ‘C’ then convert Fahrenheit to Celsius. If user enter choice ‘f’
 or ‘F’ then convert Celsius to Fahrenheit. */


import java.util.Scanner;

     class q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter choice (C for Fahrenheit to Celsius, F for Celsius to Fahrenheit): ");
        char choice = sc.next().charAt(0);

        if (choice == 'c' || choice == 'C') // || this is uses for true uses of both value
        {
            
            System.out.println("Enter temperature in Fahrenheit: ");

             float f  = sc.nextFloat();
            float result = (f - 32) * 5 / 9;
            
            System.out.println(" Temperature in Celsius: " + result );
        } 
        else 
        if (choice == 'f' || choice == 'F')
         {
        
            System.out.println(" temperature in Celsius: ");
           float  c = sc.nextFloat();
            float result = (c * 9 / 5) + 32;

            System.out.println("Temperature in Fahrenheit: " + result);

        }
         else
         {
            System.out.println("Invalid! enter valid 'F''c' only.");
        }

        

    }
}





