package Practice.Repl;
import java.util.Scanner;

public class Print_the_longest_word {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WIRTE YOUR CODE HERE

        int  wordF = word1.length();
        int wordS = word2.length();

        if(wordF > wordS){
            System.out.println(word1);
        }else {
            System.out.println(word2);
        }

    }
}
/*
Write a program that will print out the longest word between two words.
 */
