import java.util.Scanner;

 class q25 {
    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number between  1 to 5 only : ");
        int number = sc.nextInt();
        
        if(number==1){
            System.out.println("One");

        }
        else 
        if (number==2){
        System.out.println("Two");
        }
        else 
        if(number==3){
        System.out.println("three");
     }
     else 
     if (number==4){
        System.out.println("four ");

     }
     else 
     if (number==5){
        System.out.println("five");

     }
     else 
     {

        System.out.println("enter a value between 1 to5");

     }
     }}