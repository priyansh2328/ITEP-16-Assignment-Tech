import java.util.Scanner;
  
  class q24 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
    
System.out.println("wall length :");
 int  walllength = sc.nextInt();
    
 
    
System.out.println("wall breadth  :");
 int  wallbreadth = sc.nextInt();
       
System.out.println("wall thickness:");
 int  wallthickness = sc.nextInt();
    

        
    
System.out.println("brick length :");
 int  bricklength = sc.nextInt();
    
 
    
System.out.println("brick breadth  :");
 int  brickbreadth = sc.nextInt();
       
System.out.println("brick thickness:");
 int  brickthickness = sc.nextInt();
    
double wallvolume = walllength*wallbreadth*wallthickness;

double brickvolume= bricklength*brickbreadth*brickthickness;

double numberofbricks = wallvolume/brickvolume;
double costperthousand = 900;
double totalcost = (numberofbricks/1000.0)*costperthousand;

System.out.println("number of bricks required :" + numberofbricks);
System.out.println("total cost to build  the wall :$"+totalcost);



    }}