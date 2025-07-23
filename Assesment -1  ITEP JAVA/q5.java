class q5 {


public static void  main (String args[]){

int cost_to_fencing_in_park = 1600;
int length = 20;
int cost_of_fencing_per_meter = 25;
int cost_of_per_meter_perimeter;
cost_of_per_meter_perimeter = (cost_to_fencing_in_park/cost_of_fencing_per_meter);
System.out.println("cost of per meter perimeter:"+cost_of_per_meter_perimeter);

int breadth;
breadth = ((cost_of_per_meter_perimeter/2)-length);
System.out.println("breadth:"+breadth);
int area;
area=(length *breadth);
System.out.println("area:"+area);

}
}