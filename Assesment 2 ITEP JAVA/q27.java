import java.util.Scanner;
  
  class q27 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
    
System.out.println("length of floor  :");
 int  lengthfloor = sc.nextInt();
    
    
System.out.println("breadth of brick  :");
 int  breadthfloor  = sc.nextInt();
    
    int areaoffloor=lengthfloor*breadthfloor;
       
System.out.println("rate  :");
 int  rate  = sc.nextInt();

 int cost= areaoffloor*rate;
System.out.println( "cost:"+cost);

    }}