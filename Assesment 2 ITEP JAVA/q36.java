import java.util.Scanner;
  
  class q36 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
    
System.out.println(" enter diameter  :");
 double d = sc.nextInt();
    
    
System.out.println(" enter height :");
 double  height = sc.nextDouble();
 
   double radius = d/2;
   System.out.println("radius"+radius);
        double curvedSurfaceArea = 2 * 3.14 * radius * height;
        System.out.println("curved surface area:  "+curvedSurfaceArea);
        double endsArea = 2 * 3.14 * radius * radius;
        System.out.println("ends area of cylinder :"+endsArea);

        double totalSurfaceArea = curvedSurfaceArea + endsArea;

        System.out.println("Surface area of the cylinder = " + totalSurfaceArea + " metre  square");
    
    }}