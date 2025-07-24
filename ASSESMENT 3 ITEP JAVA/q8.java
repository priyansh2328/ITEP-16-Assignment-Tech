// Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical
//  cause or not ( 'Y' or 'N' ) and print accordingly.



import java.util.Scanner;

class q8
{


    public static void main(String args[]){


   
Scanner sc =new Scanner(System.in);



System.out.println("you have medical issue   : Enter the 'Y' or 'N' ");
String medical = sc.next();


 if (medical.equalsIgnoreCase("Y"))
{
    System.out.println("you are  not allow to sit in exam ");

}
else{
    System.out.println("you are   allow to sit in exam ");
}



    }}
