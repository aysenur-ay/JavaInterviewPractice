package Practice.Repl;
import java.util.Scanner;

public class Print_half_twice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        System.out.println(word.substring(0, word.length() / 2) + word.substring(0, word.length()/2));

    }
}
/*
Write a program that will print out first half of the word twice.

Example:

input: java
output: jaja
 */
