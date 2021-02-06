package Practice.Repl;
import java.util.Scanner;

public class Print_last_character {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        System.out.println(word.substring(word.length()-1));

    }
}
/*
Write a program that will print out last letter of the word (string).
 */