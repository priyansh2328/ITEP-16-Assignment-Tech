import java.util.Scanner;
  
  class q19 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("cubeside :");
 int cubeside = sc.nextInt();
 int volume_of_cube = cubeside * cubeside * cubeside;
        System.out.println("Volume of cube: " + volume_of_cube + " cubic meters");


System.out.println("cuboidlength :");
 int cuboidlength = sc.nextInt();




System.out.println("cuboidbreadth :");
 int cuboidbreadth = sc.nextInt();

 
System.out.println("cuboidheight :");
 int cuboidheight = sc.nextInt();
int volumecuboid = cuboidlength * cuboidbreadth * cuboidheight;
        System.out.println("Volume of cuboid: " + volumecuboid + " cube meters");

        if (volume_of_cube > volumecuboid) {
            System.out.println("Volume of cube is more by: " + (volume_of_cube - volumecuboid) + " cube meters");
        } else if (volumecuboid > volume_of_cube) {
            System.out.println("Volume of cuboid is more by: " + (volumecuboid - volume_of_cube) + " cube meters");
        } else {
            System.out.println("Both have equal volume.");
        }

    }}
