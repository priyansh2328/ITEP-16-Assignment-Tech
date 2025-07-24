import java.util.Scanner;

class q6 {
    public static void main (String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.println("side1: ");
    int side1 = sc.nextInt();

    System.out.println("side2:");
    int side2 = sc.nextInt();

    System.out.println("Perimeter:");
    int perimeter = sc.nextInt();


int side3 = ((perimeter)-(side1 + side2));
System.out.println("side3 = " +side3);
double s = ((side1 + side2 + side3 )/2);
double areaoftriangle = (double)Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
   System.out.println("area of triangle :"+areaoftriangle);
   


    }
}