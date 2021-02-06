package Practice.Repl;
import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
        int  count = 0;



        if (email.contains("@")){
            String [] email1 = email.split("@");
            if(email1.length > 2) {
                System.out.println("invalid email");
            }else{
                String emailId = email1[0];
                System.out.println("Email id: "+ emailId);
                String domain = email1[1];
                System.out.println("Email domain: "+ domain);
            }
        }else if(!email.contains("@")){
            System.out.println("invalid email");
        }
    }
}
/*
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:
email -> info@cybertekschool.com
Print:
Email id: info
Email domain: cybertekschool.com


If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com
print:
invalid email

email -> my@fancy@email.com
print:
invalid email
 */
