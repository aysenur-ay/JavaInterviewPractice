package Practice.Repl;
import java.util.Scanner;

public class MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        if (word.length() % 2 != 0){
            if(word.length() >= 5){
                int l = word.length() / 2;

                System.out.println((word.charAt(l - 1)) + "" + (word.charAt(l)) + "" + (word.charAt(l +1)));
            }else{
                System.out.println("invalid");
            }
        }else{
            System.out.println("invalid");
        }

    }
}
/*
You have a word, do the following:

If the word has odd number of characters
and has 5 or more characters, print the middle three
characters of the word.

Otherwise print "invalid".

fifteen ==> fte
apple ==> ppl
hey ==> invalid
java ==> invalid
whatsup ==> ats
$ ==> invalid
 */
