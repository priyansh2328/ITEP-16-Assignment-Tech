/* 
.Take input of age of 3 people by user and determine oldest and youngest among them.
*/
import java.util.Scanner;

class q5
{


    public static void main(String args[]){


   
Scanner sc =new Scanner(System.in);



System.out.println("Enter a age 1  : ");
int  age1 = sc.nextInt();




System.out.println("Enter a age 2  : ");
int  age2  = sc.nextInt();



System.out.println("Enter a age 3  : ");
int  age3  = sc.nextInt();


 int oldest = age1;
        if (age2 > oldest)
         {
            oldest = age2;
        }
        if (age3 > oldest) 
        {
            oldest = age3;
        }
        
        System.out.println("Older age : " + oldest);
        int youngest = age1;
        if (age2 < youngest)
         {
            youngest = age2;
        }
        if (age3 < youngest)
         {
            youngest = age3;
        }

    
        System.out.println("Younger age: " + youngest);








    }}

