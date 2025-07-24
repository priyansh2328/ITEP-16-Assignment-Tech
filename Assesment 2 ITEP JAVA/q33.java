 import java.util.Scanner;
  
  class q33 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
    
System.out.println("path way wide 1 :");
 int  pathwaywide1 = sc.nextInt();
    
    
System.out.println("pathway wide 2  :");
 int  pathwaywide2  = sc.nextInt();
  
  
     
System.out.println("gardenlength  :");
 int  gardenlength  = sc.nextInt();
    

 
System.out.println("garden breadth   :");
 int  gardenbreadth   = sc.nextInt();
    
    
int totalarea= gardenlength*gardenbreadth;
System.out.println("totalarea: "+totalarea);

int patharea1= gardenlength*pathwaywide1;
System.out.println("patharea1: "+patharea1);

int patharea2= gardenbreadth*pathwaywide2;
System.out.println("patharea2: "+patharea2);

int overlaparea=pathwaywide1*pathwaywide2;
System.out.println("overlaparea:" +overlaparea);

int totalpatharea=patharea1+patharea2-overlaparea;
System.out.println("total path area :" +totalpatharea);

int usablesarea= totalarea-totalpatharea;

System.out.println("usablle area: "+usablesarea);
  
    }}