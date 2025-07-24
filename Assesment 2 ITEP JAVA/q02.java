import java.util.Scanner;
class q02{


    public static void main (String args[]){
     Scanner sc = new Scanner (System.in);
System.out.println("area of rectangle:");
int area = sc.nextInt();

System.out.println("breadth of rectangle :");
int breadth = sc.nextInt();


int length = (area/breadth);
System.out.println("length of rectangle:"+length);
int perimeter = 2*(length+ breadth);
System.out.println("perimeter of rectangle:" +perimeter);

   }
}