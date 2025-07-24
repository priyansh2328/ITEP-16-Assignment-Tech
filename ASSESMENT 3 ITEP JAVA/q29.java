


//WAP to find lowest number among four different number 


import java.util.Scanner;

 class q29  {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();



        if(a<b && a<c && a<d)
        {
            System.out.println("a is smallest no ");

        }
        else 
        if (b<c && b<d)
        {
            System.out.println("b is smallest no ");

        }
        else
        if (c<d){
             System.out.println("c is smallest no ");


        }
        else 
        {
             System.out.println("d is smallest no ");
        }
    }}


