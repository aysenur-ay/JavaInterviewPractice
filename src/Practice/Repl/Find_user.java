package Practice.Repl;
import java.util.Scanner;

public class Find_user {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println ("Enter full name:");

        String fullName = scan.nextLine();

        switch(fullName){

            case "Max Payne":
            case "Max payne":
            case "alan wake":
            case "Alan Wake":  System.out.println("User found!"); break;

            default: System.out.println("User not found!");
        }



    }
}
/*
Assume that you have only 2 users: Max Payne and Alan Wake.  First, ask user to enter full name. Display message: "Enter full name:". Then take input from user. If name is equals to either "Max Payne" or "Alan Wake",  display message: "User found!". Otherwise,  display message: "User not found!". Please make your search case insensitive!

Example:
Display message: Enter full name:
input: Max Payne
Display message: User found!
 */
