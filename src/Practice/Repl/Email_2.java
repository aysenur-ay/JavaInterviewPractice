package Practice.Repl;
import java.util.Scanner;

public class Email_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String name = email.substring(0, email.indexOf("_"));
        String first = name.substring(0, 1).toUpperCase();
        String rest = name.substring(1);

        System.out.println("First name: " + first+rest );

        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String  firstIn = lastName.substring(0,1).toUpperCase();
        String restOfL = lastName.substring(1);

        System.out.println("Last name: " + firstIn + restOfL);

        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));

        System.out.println("Domain: " + domain);

        String topDomain = (email.substring(email.indexOf(".")+1));

        System.out.println ("Top-Level Domain: " + topDomain);
}
}
/*
Write a program that will print out information about user based on email. Print first and last name from the upper case.

Example:
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
 */
