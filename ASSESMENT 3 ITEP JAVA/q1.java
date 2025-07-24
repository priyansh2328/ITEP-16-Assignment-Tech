//1. Take values of length and breadth of a rectangle from user and check if it is square or not.


import java.util.Scanner;
  class q1{


    public static void main (String args[])
    {
    
Scanner sc =new Scanner(System.in);

System.out.println("Enter a length: ");
int length = sc.nextInt();


System.out.println("Enter a Breadth: ");
int breadth = sc.nextInt();


if (length==breadth)
System.out.println("it is square  of no");
else
System.out.println("it is not sqaure");





    }
  }








