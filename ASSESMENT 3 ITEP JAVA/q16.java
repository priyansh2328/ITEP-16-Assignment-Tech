//WAP to calculate area of circle 

import java.util.Scanner;

 class q16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        double radius = sc.nextDouble();

        
        double area = 3.14 * radius * radius;  

        
        System.out.println("Area of the circle: " + area);

    }}
