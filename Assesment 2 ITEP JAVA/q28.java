import java.util.Scanner;
  
  class q28 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
    
System.out.println("length of carpet :");
 int  lengthcarpet = sc.nextInt();
    
    

    
System.out.println("breadth of carpet :");
 int  breadthcarpet  = sc.nextInt();


    int areaofcarpet=lengthcarpet*breadthcarpet;

  
System.out.println("ratepersq :");
 int  ratepersq = sc.nextInt();

int totalprice= ratepersq*areaofcarpet;
System.out.println("total price:"+totalprice);
}
  }
