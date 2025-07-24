/* 
11. Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.
if employee is a male and age is in between 20 to 40 then he may work in anywhere
if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
And any other input of age should print "ERROR".  */
import java.util.Scanner;

class q11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter your gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.print("Enter marital status (Y/N): ");
        char marriagestatus = sc.next().charAt(0);

        if (gender == 'F' || gender == 'f') //bcz user can use lower case letter also 
         {
            System.out.println("She  work only in urban areas");
        }
         else if (gender == 'M' || gender == 'm') //bcz user can use lower case letter also 
             {
            if (age >= 20 && age <= 40)
             {
                System.out.println("He can work anywhere.");
            } 
            else if (age > 40 && age <= 60)
             {
                System.out.println("He will work only in urban areas.");
            }
             else
              {
                System.out.println("ERROR: Invalid age for male employee.");
            }
        } 
        else 
        {
            System.out.println("ERROR: Invalid gender input.");
        }

        
    }
}
