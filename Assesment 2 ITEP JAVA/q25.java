import java.util.Scanner;
  
  class q25 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
    
System.out.println("length of brick  :");
 int  bricklength = sc.nextInt();
    
    
System.out.println("breadth of brick  :");
 int  brickbreadth  = sc.nextInt();

    
System.out.println("no of brick  :");
 int  numberofbricks = sc.nextInt();

int area1Brick = bricklength*brickbreadth;
        int totalAreaCm2 = area1Brick*numberofbricks;
        double totalAreaM2 = totalAreaCm2/10000.0;

        System.out.println("Total area of the path = " + totalAreaCm2 + " cm  square ");
        System.out.println("Total area of the path = " + totalAreaM2 + " metre sqaure");


    }}