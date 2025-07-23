class q4{

public static void main (String args[])
{
int  length_plot =300;
int breadth_plot = 150;

 int cost_plot=6;

 int area_plot;
 area_plot = (length_plot*breadth_plot);
 System.out.println("area of plot="+area_plot);
int per_square_meter;
per_square_meter=(area_plot/100);
System.out.println( "per hundred square meter="+per_square_meter);
 int total_cost;
total_cost = (per_square_meter*cost_plot);
System.out.println("total cost="+total_cost);
}
}