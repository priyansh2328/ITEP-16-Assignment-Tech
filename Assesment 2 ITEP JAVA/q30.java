import java.util.Scanner;
  
  class q30 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
    
System.out.println("tile length  :");
 int  tilelen = sc.nextInt();
    
    
System.out.println("tile breadth  :");
 int  tilebreadth  = sc.nextInt();

    int areaonetile =tilelen*tilebreadth;

       
System.out.println("breadth bedroom  :");
 int  breadthbedroom = sc.nextInt();
    
    
System.out.println("length bedroom  :");
 int  lengthbedroom  = sc.nextInt();

int areaofbedroom = lengthbedroom*breadthbedroom;

int nooftiles= areaofbedroom/areaonetile;
System.out.println("tiles required:"+nooftiles);


    }}