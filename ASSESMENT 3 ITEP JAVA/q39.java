//
// Write a Java program to count total number of notes in given amount. 
import java.util.Scanner;
 class q39 {
    public static void main(String args[]) {   

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 4 digit no :");
        int note = sc.nextInt();

        int notes500,notes200,notes100,notes50,notes20,notes10,notes5,notes2,notes1;
          notes500=notes200=notes100=notes50=notes20=notes10=notes5=notes2=notes1=0;
int amount;
amount = note;
       
if(amount>=1000 && amount <= 9999 ){

       notes500 = amount/500;
         amount = amount%500;
 


 notes200 = amount/200;
         amount = amount%200;
 
 

 notes100 = amount/100;
         amount = amount%100;
 
 

 notes50 = amount/50;
         amount = amount%50;
 
 
 notes20 = amount/20;
         amount = amount%20;
 
 
        
         notes10 = amount/10;
         amount = amount%10;

        notes5 = amount/5;
         amount = amount%5;
 
 
        
        
                notes2 = amount/2;
             amount = amount%2;

 
         notes1 = amount/1;
         amount = amount%1;

         System.out.println("500 notes:"+notes500);

System.out.println("200 notes:"+notes200);

System.out.println("100 notes:"+notes100);

System.out.println("50 notes:"+notes50);

System.out.println("20 notes:"+notes20);

System.out.println("10 notes:"+notes10);

System.out.println("5 notes:"+notes5);

System.out.println("2 notes:"+notes2);

System.out.println("1 notes:"+notes1);

}
else {
    System.out.println("invalid no ......");
}


 
}}
