import java.util.Scanner;
  
  class q12 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("hypotenuse :");
 double hypotenuse = sc.nextDouble();


System.out.println("side1 :");
 double side1  = sc.nextDouble();


double side2 = (hypotenuse*hypotenuse - side1*side1);
System.out.println("second side:"+side2);

double area = (side1*side2)/2;
System.out.println("area of right triangle:"+area);
    }}
