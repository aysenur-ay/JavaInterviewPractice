package Practice.Repl;
import java.util.Scanner;

public class Party {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String guest = " ";
        String answer = " ";
        String name =" ";
        // your code
        // ------------------------------------------

        do {
            System.out.println("Please enter guest name:");
            name = input.next();
            guest += name;
            System.out.println("Do you want to enter new guest name:");
            answer = input.next();

            if (answer.equalsIgnoreCase("yes")){
                guest += ", ";
            }


        } while(answer.equalsIgnoreCase("yes"));
        if (answer.equalsIgnoreCase("no")) {

            System.out.println("Guest's list:" + guest);

        }
    }

}
/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.

Example of the program:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no

Guest's list: Nick, Linda
 */
