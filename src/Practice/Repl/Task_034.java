package Practice.Repl;
import java.util.Scanner;

public class Task_034 {

    public static void main(String[] args) {
        //ENTER CODE HERE


        Scanner scan = new Scanner (System.in);
        int quarters, dimes,nickels;
        int itemPrice, change;

        System.out.println("Enter price in cents:");
        itemPrice = scan.nextInt();

        if (itemPrice < 25 || itemPrice > 100 || itemPrice % 5 != 0){
            System.out.println("Invalid price!");
        } else {

            change = 100 - itemPrice;

            quarters = change / 25;
            int remainingAfterQuarters = change % 25;

            dimes = remainingAfterQuarters / 10;
            int remainingAfterDime = remainingAfterQuarters % 10;

            nickels = remainingAfterDime / 5;
            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");

        }
   }
}
/*

Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item.

- int variable itemPrice
- int variables quarters, dimes, nickels
- Scanner object

The program accepts itemPrice, which is a price for the item you would like to purchase.

Positive behavior:

Please follow the example in the image. dots mean empty space.
-Since the item price was entered 95, change is 1 nickel

Negative behavior:

If itemPrice is less than 25 or more than 100 cents, then display an error message:
Invalid price!

If itemPrice is not divisible by 5, then also display an error message:
Invalid price!

use (itemPrice % 5 == 0) expression to find it is divisible by 5.

Do not display anything else.
 */
