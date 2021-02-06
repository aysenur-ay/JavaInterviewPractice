package Practice.Repl;
import java.util.Scanner;

public class Print_first_and_last_letters {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        System.out.print(word.substring(0,1 ));
        System.out.print(word.substring(word.length()-1 ));
    }
}
/*
Write a program that will print out first and last letters together.

adobe
ae
 */
