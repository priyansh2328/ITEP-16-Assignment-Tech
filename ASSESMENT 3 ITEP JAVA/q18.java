// WAP to calculate the percentage of students



import java.util.Scanner;

 class q18 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("enter a marks obtained : ");
        float marksobtained = sc.nextFloat();


        System.out.print("enter a total marks : ");
        float  totalmarks = sc.nextFloat();

     float   percentage = (marksobtained/totalmarks)*100;
      

      System.out.println("percentage of student is : " +percentage + "% ");




    }}
