//WAP to calculate area of rectangle



import java.util.Scanner;

class q17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a length: ");
        int length  = sc.nextInt();

        
        System.out.print("Enter a breadth: ");
        int breadth  = sc.nextInt();

        int area =length*breadth;
        System.out.println("area of rctangle =" + area );

    }}