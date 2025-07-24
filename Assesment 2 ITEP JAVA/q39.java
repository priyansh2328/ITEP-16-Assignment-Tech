import java.util.Scanner;
  
  class q39 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
    
System.out.println("radius  :");
 int radius  = sc.nextInt();
    
    
System.out.println("height:");
 int height = sc.nextInt();

 float surfacearea=2*3.14f*radius*(height+radius);
        System.out.println("surface area :" +surfacearea);

    }}