import java.util.Scanner;
  
  class q35 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
    
System.out.println("radius  :");
 double radiusofsurface = sc.nextDouble();
    
    
System.out.println("height of surface :");
 double  heightofsurface = sc.nextDouble();
   
 
        double curvedSurfaceArea = 2 * 3.14 * radiusofsurface * heightofsurface;
        double circularArea = 2 * 3.14 * radiusofsurface * radiusofsurface;
System.out.println("curved surface area: "+curvedSurfaceArea);
System.out.println("circular area:"+circularArea);
        double totalSurfaceArea = curvedSurfaceArea + circularArea;

        System.out.println("Surface area of the cylinder = " + totalSurfaceArea + " cm square");  
   
   
   
   
   
    }}