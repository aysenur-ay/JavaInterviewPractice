package Practice.Repl;
import java.util.Scanner;

public class RepeatSeparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String word2 = "";

        for (int i = 1; i <= count-1; i++){
            word2 += (word+separator);
        }


        System.out.print(word2+word);

    }
}
/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
Example:
input: Word
input: X
input: 3
output: WordXWordXWord

Example:
input: This
input: And
input: 2
output: ThisAndThis

Example:
input: This
input: And
input: 1
output: This
 */
