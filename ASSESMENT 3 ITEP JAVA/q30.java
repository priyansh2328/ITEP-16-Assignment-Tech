

import java.util.Scanner;

class q30
{


    public static void main(String args[]){


   
Scanner sc =new Scanner(System.in);


        System.out.print("Enter a year: ");
        int  year = sc.nextInt();

        if (year % 4 == 0  || (year % 400 == 0)) 
        {
            System.out.println( "this year is a leap year "+year  );
        }
            else
             {
            System.out.println( "this is not a leap year " +year );
            }


    }}
