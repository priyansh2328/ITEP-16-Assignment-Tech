import java.util.Scanner;
  
  class q29 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
    
System.out.println("tile side  :");
 int  tileside = sc.nextInt();
    
    
System.out.println("length :");
 int  length  = sc.nextInt();

   
System.out.println("breadth :");
 int  breadth  = sc.nextInt();
 

int areatilesquare= tileside*tileside;
int floorarea =length*breadth;

int tilesrequired= floorarea/areatilesquare;

System.out.println("tiles  required: "+tilesrequired);


    }}