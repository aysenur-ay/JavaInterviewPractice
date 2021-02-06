package Practice.Repl;
import java.util.Scanner;

public class Emai {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if(email.contains("_")){
            String name = email.substring(0, email.indexOf("_"));
            String last = email.substring ( email.indexOf("_")+1, email.indexOf("@"));
            email = email.replace(last, name);
            System.out.println(email.replaceFirst(name, last));
        } else{
            System.out.println(email);
        }

    }
}
/*
In this task, you need to swap first name with last name in the email. If email doesn't contains underscore - do not anything.

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com
 */