//Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).



import java.util.Scanner;

class q9
{


    public static void main(String args[]){


   
Scanner sc =new Scanner(System.in);


        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0); 




        if (Character.isUpperCase(character))
         {
            System.out.println(" it is a uppercase letter");

        }
        
         else if (Character.isLowerCase(character))
            {
            System.out.println(" it is a lower case letter ");
            } 
    
    
    
    }}