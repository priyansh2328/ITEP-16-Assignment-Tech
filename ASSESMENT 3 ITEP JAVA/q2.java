/*
2.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.*/


import java.util.Scanner;

class q2
{


    public static void main(String args[]){


   
Scanner sc =new Scanner(System.in);

System.out.println("Enter a purchase unit quantity  : ");
int quantity  = sc.nextInt();

int cost = 100;
System.out.println("cost per quantity: "+cost);
 
 int t = (quantity*cost);
 System.out.println("total cost:"+t );

if (t>1000)
System.out.println("user is eligible for discount ");
else
System.out.println("it is not eligible for discount");
        
    }

}