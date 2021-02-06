package Practice.Repl;
import java.util.Scanner;

public class Task_035 {

    public static void main(String[] args) {
        //WRITE YOUR CODE HERE

        Scanner input = new Scanner(System.in);
        int card = 100;
        double price = 0;

        String list = input.nextLine();
        if (price<=100){
            if (list.equals("Hat") && price < 100){
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (card - 25) + "$" );
            }else if(list.equals("Pants") && price < 100){
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (card - 50) + "$" );

            }else if(list.equals("Smartphone") && price < 100){
                System.out.println("Sorry, not enough funds on your gift card!");
            }else if(list.equals("Laptop") && price < 100){
                System.out.println("Sorry, not enough funds on your gift card!");

            }else if(list.equals("Charger") && price < 100){
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (card - 15) + "$" );

            }else if(list.equals("Headphones") && price < 100){
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (card - 30) + "$" );
            }else if(list.equals("Socks") && price < 100){
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (card - 5) + "$" );
            }else if(list.equals("Blanket") && price < 100){
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (card - 60) + "$" );
            }else if(list.equals("Pillow") && price < 100){
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: "+ (card - 40) + "$" );
            }else if(list.equals("USB cable") && price < 100){
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (card - 10) + "$" );
            } else{
                System.out.println("Invalid item!");
            }

        }else{
            System.out.println("Sorry, not enough funds on your gift card!");
        }

    }

}

/*
Let's say I've got a 100$ gift card and you want to buy something in your online store .
Write a program that will help me to buy something and display leftover balance after purchase.
 If item is not in the list, display message: "Invalid item!".
 If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
Hint
Use if/ else if / else
CODE EXAMPLE:
Example #1
input: Hat
output: Thank you for your purchase!
output: Your current balance is: 75$

Example #2
input: Pants
output: Thank you for your purchase!
output: Your current balance is: 50$

Example #3
input: Laptop
output: Sorry, not enough funds on your gift card!

Example #4
input: Cupcake
output: Invalid item!
List of items


 */
