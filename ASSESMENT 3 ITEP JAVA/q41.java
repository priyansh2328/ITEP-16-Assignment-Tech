/* 

26. Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.        
  Calculate percentage and grade according to following: 
	Percentage >= 90% : Grade A 
	Percentage >= 80% : Grade B 
	Percentage >= 70% : Grade C 
	Percentage >= 60% : Grade D 
	Percentage >= 40% : Grade E 
	Percentage < 40% : Grade F */

    
import java.util.Scanner;

    class q41 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


              System.out.print("Enter marks in Physics: ");
              int physics = sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks in Biology: ");
        int biology = sc.nextInt();

        System.out.print("Enter marks in Mathematics: ");
        int math = sc.nextInt();

        System.out.print("Enter marks in Computer: ");
        int computer = sc.nextInt();

       int  totalmarks = physics+chemistry+biology+math+computer;
          double percentage = (totalmarks / 500.0) * 100;



        
        System.out.println("Total Marks: " + totalmarks + "/500");
        System.out.println("Percentage: " + percentage + "%");

  if (percentage>=90)
  {
    System.out.println("Grade A");
  }
  else
  if(percentage>=80)
  {
     System.out.println("Grade B");


  }

else 
if(percentage >=70)
{
     System.out.println("Grade C");
}

else
if(percentage >=60)
{
     System.out.println("Grade d");
}

else 
if(percentage>=40 )
{
     System.out.println("Grade E");
}
else 
{
     System.out.println("Grade f");
}
    }}