import java.util.Scanner;
  
  class q11 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("area :");
 double area = sc.nextDouble();

System.out.println("base :");
 double base = sc.nextDouble();

System.out.println("height :");
  double height  = sc.nextDouble();


double  area1= (base*height)/2 ; //using the ratio 
 

System.out.println( "area of ratio :"+area1);


double ratio = (area/area1);
System.out.println( "on dividing area: "+ratio);


double root;
root = Math.sqrt(ratio);



System.out.println("on finding the ratio root value :"+root);


  double b2= (root*base); //base 
 double h2 = (root*height);

System.out.println("final base of triangle:"+b2);

System.out.println( "fianl height of triangle:"+h2);
    



    }}