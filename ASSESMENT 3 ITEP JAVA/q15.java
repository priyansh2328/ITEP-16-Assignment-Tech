/*
15. Write a java program to accept the cost price of a bike
    and display the road tax to be paid according to the 
    following criteria.
    Cost Price(In Rs)		Tax
     > 100000			 15%
     >50000 and <=100000	 10%
     <=50000			 5%			  
*/

import java.util.Scanner;

 class q15 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the cost price of the bike: ");
        double costPrice = sc.nextDouble();
        double tax;

        
        if (costPrice > 100000) {
           tax = costPrice * 0.15;  //0.15 = we divide 15/100 =0.15 directly 
        }
         else 
         if (costPrice > 50000 && costPrice <= 100000)
          {
            tax = costPrice * 0.10;
        } 
        else 
        {
          tax = costPrice * 0.05; //0.05 = we divide 5/100 
        }

    
        System.out.println("Road Taxes to pay :  in Rs. " + tax);

        
    }
}
