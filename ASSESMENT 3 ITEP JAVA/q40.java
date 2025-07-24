// Write a Java program to calculate profit or loss.



import java.util.Scanner;
class q40 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a cost:");
       int cp =  sc.nextInt();


       System.out.println("Enter a selling price :");
       int  sp =  sc.nextInt();



if(sp>cp)
{
    double profit = sp-cp;

    System.out.println("profit =  :"+profit );
}
else if
(cp>sp)
{
    double loss = cp-sp;
    System.out.println("loss = "+loss);
}
else {
    System.out.println("no profit no loss");

} }
}




    