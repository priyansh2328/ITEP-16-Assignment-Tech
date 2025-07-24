/* 
13. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
Test Data
Input number: 3
Expected Output :
Wednesday*/


import java.util.Scanner;

class q13
{


    public static void main(String args[]){


   
Scanner sc =new Scanner(System.in);



System.out.println("Enter a no between 1  to 7: ");
int  day = sc.nextInt();
 if       (day == 1)
         {
            System.out.println("Monday");
        }
         else 
         if (day == 2) 
         {
            System.out.println("Tuesday");
        } 
        else 
        if (day == 3) 
        {
            System.out.println("Wednesday");
        } 
        else 
        if (day == 4)
         {
            System.out.println("Thursday");
        } 
         if (day == 5)
         {
            System.out.println("Friday");
        } 
        else 
        if (day == 6)
         {
            System.out.println("Saturday");
        } 
        else 
        if (day == 7)
         {
            System.out.println("Sunday");
        } 
        else
         {
            System.out.println("Invalid number:kindly enter 1 to 7 number only.");
        }


    }}