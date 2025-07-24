import java.util.Scanner;
  
  class q18 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("lengthpark :");
 int lengthpark = sc.nextInt();


System.out.println("breadthpark :");
 int breadthpark = sc.nextInt();
  
  
  
System.out.println("rounds :");
 int round = sc.nextInt();
  
 int perimeter=(2*(lengthpark+breadthpark));
System.out.println("perimeter of park:"+perimeter+ " metre");
int totaldistance = perimeter*10;
System.out.println("ron jogs total distance:"+totaldistance + " metre");

double inkm= totaldistance/1000.0;
System.out.println( "ron jogs daily:"+inkm+ " km ");
  
  
  
    }}
