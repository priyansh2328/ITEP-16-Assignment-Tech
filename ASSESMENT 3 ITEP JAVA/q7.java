/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/


import java.util.Scanner;

class q7
{


    public static void main(String args[]){


   
Scanner sc =new Scanner(System.in);


System.out.println("Enter a number of class held  : ");
double  held = sc.nextInt();


System.out.println("Enter a  number of class attended  : ");
double  attended = sc.nextInt();

double totalpercentage = (attended/held)*100;

System.out.println("total percentage : " +totalpercentage);

if(totalpercentage>75)
{
    System.out.println("candidate eligible for exam");
}
    else 
        {
          System.out.println("candidate  not eligible for exam");
        }
}
    }
