import java.util.Scanner;

 class q38 {
    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number between  1 to 7 only : ");
        int number = sc.nextInt();
        
        if(number==1){
            System.out.println("Monday");

        }
        else 
        if (number==2){
        System.out.println("tuesday");
        }
        else 
        if(number==3){
        System.out.println("wednesday");
     }
     else 
     if (number==4){
        System.out.println("thusrday ");

     }
     else 
     if (number==5)
     {
        System.out.println("friday");

     }
     else 
     if (number==6)
     {

        System.out.println(" saturday");

     }
     else 
     if(number==7)
     {
        
        System.out.println(" sunday");
     }
     else 
     {
        
        System.out.println(" invalid no");
     }
     }}