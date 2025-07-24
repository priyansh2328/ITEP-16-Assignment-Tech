/* 

*/ 




import java.util.Scanner;
class q35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a chracter (A to Z or a to z): ");
        char chracter  = sc.next().charAt(0);

          if ((chracter >= 'A' && chracter <= 'Z') || (chracter >= 'a' && chracter <= 'z')) 
          {
            System.out.println(chracter + " is an alphabet");
        } 
        else
         {
            System.out.println(chracter + " is NOT belngs to an  alphabet");
        }

    }}
