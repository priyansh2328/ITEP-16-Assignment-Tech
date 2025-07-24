import java.util.Scanner;
  
  class q15 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("length :");
 double length = sc.nextInt();


System.out.println("breadth :");
 double breadth = sc.nextInt();
double area1 = length * breadth;
        System.out.println("Area of Shelly: " + area1);

        int side1 = 21; // for Racheal
        int area2 = side1 * side1;
        System.out.println("Area of Racheal: " + area2);

        if (area2 > area1) {
            System.out.println("Racheal's garden is bigger by " + (area2 - area1)+ " metre square" );
        } else if (area1 > area2) {
            System.out.println("Shelly's garden is bigger by " + (area1 - area2) );
        } else {
            System.out.println("Both gardens are of equal area.");
        }


    }}