import java.util.Scanner;
  
  class q8 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("altitude:");
 double altitude = sc.nextDouble();



System.out.println("area:");
 double area = sc.nextDouble();


double areaincm;
areaincm = (area*10000);
System.out.println("area in cm: "+areaincm );
//area  in cm now is 8000 cm square 
double base;
base= ((areaincm*2)/altitude);     
System.out.println("base of triangle :"+base+ "cm ");


    }}