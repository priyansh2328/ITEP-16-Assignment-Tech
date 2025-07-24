import java.util.Scanner;
  
  class q23 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
    
System.out.println("length of cartoon   :");
 int  lengthcartoon = sc.nextInt();
    
    
System.out.println("breadth of carton  :");
 int  breadthcartoon = sc.nextInt();

 
System.out.println("height of cartoon   :");
 int  heightcartoon = sc.nextInt();


System.out.println("cubicalside :");
 int  cubicalside= sc.nextInt();



 int boxfitlength = lengthcartoon/cubicalside;
 int boxfitbreadth = breadthcartoon/cubicalside;
 int boxfitheight = heightcartoon/cubicalside;


 int totalcubebox = boxfitlength*boxfitbreadth*boxfitheight;
 System.out.println("total cube box size :"+totalcubebox);


    }}