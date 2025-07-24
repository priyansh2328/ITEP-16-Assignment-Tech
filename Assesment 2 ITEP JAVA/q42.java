import java.util.Scanner;
  
  class q42 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
      
System.out.println("diameter  :");
 double diameter = sc.nextDouble();
    
    
System.out.println("height :");
 double  height  = sc.nextDouble();
 double radius = diameter/2;
 
        double volume = 3.14*radius*radius*height;

        System.out.println("Volume of the cylinder is: " + volume + " cm");
    }}