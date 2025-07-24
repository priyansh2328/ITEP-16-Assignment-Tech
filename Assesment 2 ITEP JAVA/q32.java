import java.util.Scanner;
  
  class q32 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
    
System.out.println("gardenside  :");
 int  gardenside  = sc.nextInt();
    

 
System.out.println("poolside  :");
 int  poolside   = sc.nextInt();
    
    
int gardarea = gardenside*gardenside;
int  poolarea = poolside*poolside;
int usearea = gardarea-poolarea;
System.out.println("use a garden area :"+usearea+ " metre  sq");
    }}