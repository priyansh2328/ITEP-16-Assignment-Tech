import java.util.Scanner;
  
  class q43 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
    
System.out.println("slant height  :");
 double slantheight = sc.nextInt();
    
    
System.out.println("height :");
 double  height = sc.nextInt();

  
System.out.println("polishingrate :");
 int  polishingrate = sc.nextInt();

  double raduis=Math.sqrt(slantheight*slantheight-height*height);
    
     double area = (22*raduis*raduis)/7;
    System.out.println("area of base of cone :"+area +"  cm");
    double cost =area *polishingrate;
    System.out.println("cost of polishing :"+cost + " cm");


    }}