/*

28. Write a C program to input electricity unit charges and calculate total electricity bill according to
 the given condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit 
For unit above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill. 
*/



import java.util.Scanner;
class q43 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double units, amount = 0, surcharge, totalamount;

        System.out.print("Enter total units consumed: ");
        units = sc.nextDouble();

        if (units <= 50)
         {
            amount = units * 0.50;
        } 
        else 
        if (units <= 150)
          {
            amount = (50 * 0.50) + (units - 50) * 0.75;
        } 
        else 
        if (units <= 250)
         {
            amount = (50 * 0.50) + (100 * 0.75) + (units - 150) * 1.20;
        } 
        else
         {
            amount = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + (units - 250) * 1.50;
        }

        surcharge = amount * 0.20;
        totalamount = amount + surcharge;

        System.out.println("Electricity Bill = Rs. " + totalamount);
    }
}