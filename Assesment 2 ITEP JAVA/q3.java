import java.util.Scanner;
 

 class q3{

    public static void main(String args[]){


Scanner sc = new Scanner(System.in);

System.out.println("length of tile: ");
int length= sc.nextInt();
  System.out.println("breadth of tile : ");
int breadth = sc.nextInt();
System.out.println("length of rectangular region: ");
int lengthregion = sc.nextInt();
System.out.println("breadth of rectangular region ");
int breadthregion = sc.nextInt();

int areatile = (length*breadth);
System.out.println("area of tile:"+areatile);
 
 int arearegion = (lengthregion*breadthregion);
 System.out.println("area of region :"+arearegion);


int total= (arearegion/areatile);
System.out.println("total :"+total);





        
    }
 }