/*
 Program to perform arithmetic operation using switch case
 */
import java.util.Scanner;
class q28{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  arithmetic operation : ");
        char operation=sc.next().charAt(0);

        System.out.print("Enter a= ");
        int a=sc.nextInt();


        System.out.print("Enter b= ");
        int b=sc.nextInt();

        switch(operation)
        {
                 case '+':
                System.out.println("a+b=  "+(a+b));
                break;
                

                 case '-':
                System.out.println("a-b = " +(a-b));
                break;


            case '*':
                System.out.println("a*b= " +(a*b));
                break;

            case '/':
                System.out.println("a/b= "+(a/b));
                break;

            case '%':
                System.out.println("a%b=  "+(a%b));
                break;

            default:
                System.out.print("Enter correct operation");
        }
    }
}