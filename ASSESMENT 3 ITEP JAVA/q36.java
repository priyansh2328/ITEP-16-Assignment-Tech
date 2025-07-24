import java.util.Scanner;

 class q36 {
    public static void main(String  args[]) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter angle A: ");
        int angle1 = sc.nextInt();

        System.out.print("Enter angle B: ");
        int angle2 = sc.nextInt();

        System.out.print("Enter angle C: ");
        int angle3 = sc.nextInt();

        
        if (angle1 + angle2 + angle3 == 180)  // hint given sum of all angles  =  180 
        {
            System.out.println("The triangle is valid.");
        } else
         {
            System.out.println("The triangle is NOT valid.");
        }

    }
}