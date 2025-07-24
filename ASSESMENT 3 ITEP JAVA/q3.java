/*
3.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.
*/

import java.util.Scanner;

class q3
{


    public static void main(String args[]){


   
Scanner sc =new Scanner(System.in);


System.out.println("Enter your salary  : ");
int salary  = sc.nextInt();



System.out.println("year of service  : ");
int service  = sc.nextInt();




if ( service > 5){
    double bonus = (5*salary)/100;

double totalsalary = (bonus+salary);

System.out.println("salary with bonus : " +totalsalary);
}
else{
     System.out.println("salary: " +salary);
}


    }}