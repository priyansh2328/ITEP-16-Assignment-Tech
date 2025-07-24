import java.util.Scanner;
  
  class q41 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
    
System.out.println("diameter  :");
 int diameter = sc.nextInt();
    
    
System.out.println("height :");
 int height  = sc.nextInt();

 int radius = diameter/2;
double area;
       area = (22/7)*radius*radius*height;


        System.out.printf("Volume of the cylinder =" +area);
    
    }}