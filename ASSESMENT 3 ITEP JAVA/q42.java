/* 
27. Write a Java program to input basic salary of an employee and calculate its Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% 
Basic Salary <= 20000 : HRA = 25%, DA = 90% 
Basic Salary > 20000 : HRA = 30%, DA = 95% 
 */


import java.util.Scanner;

 class q42 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double hra, da, grossSalary;      // houserent allowence hra , (da) daily allounces
                                         
        if (basicSalary <= 10000)
         {
            hra = (basicSalary * 0.20); //we change it in  decimal value  0.20= 20/100
            da  = (basicSalary * 0.80); 
        } else 
        if (basicSalary <= 20000)
         {
            hra = basicSalary * 0.25; 
            da  = basicSalary * 0.90; 
        } 
        else
         {
            hra = basicSalary * 0.30;
            da  = basicSalary * 0.95; 
        }

        
        grossSalary = basicSalary + hra + da;

        
        System.out.println("Basic Salary: in rs " + basicSalary);
        System.out.println("HRA: in rs " + hra);
        System.out.println("DA: in rs" + da);
        System.out.println("Gross Salary: in rs " + grossSalary);


    }
}
