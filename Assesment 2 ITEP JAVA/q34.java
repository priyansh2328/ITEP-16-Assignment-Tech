import java.util.Scanner;
  
  class q34 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
    
System.out.println("b1 :");
 int  b1  = sc.nextInt();

    
System.out.println("b2 :");
 int  b2  = sc.nextInt();
    
       
System.out.println("height :");
 int  height  = sc.nextInt();
    
      
System.out.println("walkwaywidth :");
 int  walkwaywidth  = sc.nextInt();
    
         
System.out.println("walkawaylength :");
 int  walkawaylength  = sc.nextInt();
    
     double trapezoidArea = 0.5 * (b1 + b2) * height; //0.5 mean multiply with 1/2
System.out.println("trapezoid area: "+trapezoidArea);


  int walkwayArea = walkwaywidth * walkawaylength;
System.out.println("walkwayarea: "+walkwayArea);

 double totalArea = trapezoidArea + walkwayArea;


        System.out.println("Total area after adding the walkway = " + totalArea + " m square");






    }}