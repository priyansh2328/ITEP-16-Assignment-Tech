import java.util.Scanner;
 class q4 {
    public static void main (String args[] ){
      Scanner sc = new Scanner(System.in);

        System.out.println("length of plot :");
        int length = sc.nextInt();
        System.out.println("breadth ofplot :");
        int breadth = sc.nextInt();
         System.out.println("cost of plot  :");
         int costofplot = sc.nextInt();


         int areaplot = (length*breadth);
         System.out.println("area  of plot :"+areaplot);
         int persquaremetre = (areaplot/100);

         int totalcost = (persquaremetre*costofplot);
         System.out.println("total cost: "+totalcost);
        
        
            }
 }