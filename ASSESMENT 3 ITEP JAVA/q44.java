/*
29. Write a program to input choice from user. If user enter ‘+’ as choice then calculate addition of 2 number. 
If Choice ‘>’ then check which number is greaterst. If choice is ‘==’ then check both number is equal or not.*/


import java.util.Scanner;

       class q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            
        System.out.println("Enter choice(+,==,>) : ");//we used three operators in this 
        String choice  = sc.next();
     
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();

            // we can use switch caase for this

            switch(choice)
            {
                case "+":
                    System.out.println("after adding both number "+ (num1+num2));
                    break ;
                    case ">":
                    if(num1>num2)
                    System.out.println("greater"+ num1);
                    else
                    System.out.println("greatest"+num2);
                    break ;
                    case "==":
                    if(num1==num2)
                    System.out.println("value is equal");
                    else
                    System.out.println("value is  not  equal");
            }
           
    }}
