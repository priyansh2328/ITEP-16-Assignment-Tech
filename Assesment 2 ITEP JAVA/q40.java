import java.util.Scanner;
  
  class q40 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
    
System.out.println("radius  :");
 double radius = sc.nextInt();
    
    
System.out.println("height of surface :");
 double  height = sc.nextInt();
   
   
        double volume = 3.14 * radius * radius * height;

        System.out.printf("Volume of the cylinder ="+ volume);
   
   
   
    }}