import java.util.Scanner;

class q5 {
    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
 System.out.println("cost to fencing in park :");
 int costfencingpark = sc.nextInt();

 System.out.println("length:");
 int length  = sc.nextInt();


System.out.println("cost of fencing/metre :");
int costpermetre = sc.nextInt();


int costperperimeter = (costfencingpark/costpermetre);
System.out.println("costperimeter :" +costperperimeter);


int breadth = ((costperperimeter/2)-length );
System.out.println("breadth "+breadth);

int area = (length * breadth );
System.out.println("area :"+area);



    }


}