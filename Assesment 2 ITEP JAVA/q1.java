import java.util.Scanner;

class q1 {
    public static void main (String args[]){
Scanner sc = new Scanner(System.in);
System.out.println( "perimeter of rectangle :");
int perimeter = sc.nextInt();


System.out.println("length of the rectangle:");
int length = sc.nextInt();
  


  float breadth = (perimeter-2*length)/2.0f;

  System.out.println("breadth of rectangle is:"+breadth);

  float area = (length * breadth);

  System.out.println("area of rectangle  is:" +area);

  




    }
}