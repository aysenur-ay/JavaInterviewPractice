package Practice.Repl;
import java.util.Scanner;

public class Vehicle_recall {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE

        Scanner input = new Scanner(System.in);

        int vehicleYear = input.nextInt();

        System.out.println("Enter vehicle's year:");
        switch (vehicleYear){
            case 1995:
            case 1996:
            case 1997:
            case 1998:
            case 2001:
            case 2002:
            case 2004:
            case 2005:
            case 2006:
            case 2015:
            case 2016:
            case 2017: System.out.println("Your vehicle needs to be recalled!"); break;
            default: System.out.println("Your vehicle is fine, enjoy!");

        }

    }
}
/*
SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017.

In this assignment you will write a program that will find vehicle for recall.
-Create a scanner object
-Create int variable named vehicleYear

-Display prompt: "Enter vehicle's year:"
input: 1996

 if the value of modelYear does fall within the four recall ranges, display output:
"Your vehicle needs to be recalled!"

Otherwise, display message:
"Your vehicle is fine, enjoy!"
 */
