import java.util.Scanner;
  
  class q26 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
    
System.out.println("length one  :");
 int  length1 = sc.nextInt();
    
    
System.out.println("breadth one :");
 int  breadth1 = sc.nextInt();

   
System.out.println("length two :");
 int  length2 = sc.nextInt();
    
    
    
System.out.println("breadth two :");
 int  breadth2 = sc.nextInt();

 int areaofpath=length1*breadth2;
 int  areaof1brick=(length2*breadth2);
       int numberofbricks=(areaofpath/areaof1brick);
       System.out.println("no of bricks: "+numberofbricks);
    }}