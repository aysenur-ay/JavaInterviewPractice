package Practice.Repl;
import java.util.Scanner;

public class Vehicle_recall2 {

    public static void main(String[] args) {
        // DO NOT CHANGE:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();

        //WRITE YOUR CODE HERE:

        switch (vehicleYear){

            case 1995 : System.out.println ("Your vehicle needs to be recalled!"); break;
            case 2001: System.out.println ("Your vehicle needs to be recalled!"); break;
            case 2004: System.out.println ("Your vehicle needs to be recalled!"); break;
            case 2015: System.out.println ("Your vehicle needs to be recalled!"); break;
            case 1996: System.out.println ("Your vehicle needs to be recalled!"); break;
            case 2002: System.out.println ("Your vehicle needs to be recalled!"); break;
            case 2005: System.out.println ("Your vehicle needs to be recalled!"); break;
            case 2006: System.out.println ("Your vehicle needs to be recalled!"); break;
            case 1998: System.out.println ("Your vehicle needs to be recalled!"); break;
            case 1997 : System.out.println ("Your vehicle needs to be recalled!"); break;
            case 2017: System.out.println ("Your vehicle needs to be recalled!"); break;
            case 2016: System.out.println ("Your vehicle needs to be recalled!"); break;
            default: System.out.println ("Your vehicle is fine, enjoy!");

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