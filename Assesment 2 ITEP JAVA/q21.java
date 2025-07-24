import java.util.Scanner;
  
  class q21 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
    
System.out.println("length of brick  :");
 int  lengthbrick = sc.nextInt();
    
    
System.out.println("breadth of brick  :");
 int  breadthbrick  = sc.nextInt();
   
      
System.out.println("height of brick  :");
 int  heightbrick = sc.nextInt();
    
    
System.out.println("length of wall :");
 int  lengthwall  = sc.nextInt();


    
System.out.println("breadth of wall :");
 int  breadthwall  = sc.nextInt();
 
      
System.out.println("height of wall :");
 int  heightwall  = sc.nextInt();
 
   int volumebrick= lengthbrick*breadthbrick*heightbrick;
int volumewall=lengthwall*breadthwall*heightwall;


 int totalbricks = volumewall/volumebrick;
System.out.println("total bricks :"+totalbricks);
   
   
    }}