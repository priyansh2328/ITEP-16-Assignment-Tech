/*
19. W.A.P to check whether the traingle is equilateral, scalene, or isosceles. 
Hint: - Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length. Equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three 
sides are equal. Scalene triangle: A scalene triangle is a triangle that has three unequal sides. */


import java.util.Scanner;

 class q34 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter side A: ");
        int a = sc.nextInt();

        System.out.print("Enter side B: ");
        int b = sc.nextInt();

        System.out.print("Enter side C: ");
        int c = sc.nextInt();


      if (a==b && b==c) //it is condition for equallthree sides
      {

        System.out.println("It is an Equilateral triangle.");

        } 
        else 
        if (a == b || b == c || a == c) 
        {
            System.out.println("It is an Isosceles triangle.");
        } 
        else 
        {
            System.out.println("It is a Scalene triangle.");
        }
    }}
    









