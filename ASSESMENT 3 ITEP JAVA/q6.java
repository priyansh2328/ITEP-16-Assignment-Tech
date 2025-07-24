/*
6. Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1*/
  
  
import java.util.Scanner;

class q6
{


    public static void main(String args[]){


   
Scanner sc =new Scanner(System.in);



System.out.println("Enter a number  : ");
int  number1 = sc.nextInt();

int absolutevalue ;
if(number1<0)
{
    absolutevalue = -number1;
}
else 
{
absolutevalue = number1;
}
System.out.println("absolute value  : " +absolutevalue);


    }}