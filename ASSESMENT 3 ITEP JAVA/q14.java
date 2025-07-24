/* Write a program to accept percantage from the user and
display grade according to the following criteria
  Marks	  		Grade
  > 90       		 A
  >80 and <=90		 B
  >=60 and <=80		 C
  below 60		 D
  */
   


   
import java.util.Scanner;

class q14
{


    public static void main(String args[]){


   
Scanner sc =new Scanner(System.in);



System.out.println("Enter a percentage  : ");
float  percentage = sc.nextFloat();


 if (percentage > 90) 
 {
            System.out.println("Grade: A");
        } 
        else if (percentage > 80 && percentage <= 90) //uses a logical operators between the value
        
        {
            System.out.println("Grade: B");
        }
         else if (percentage >= 60 && percentage <= 80)
         {
            System.out.println("Grade: C");
        } 
        else
         {
            System.out.println("Grade: D");
        }











    }}