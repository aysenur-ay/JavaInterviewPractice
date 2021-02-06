package Practice.Repl;
import java.util.Scanner;

public class ReverseSentence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below


        String [] split = sentence.split(" ");
        for (int i = split.length-1; i >= 0; i--){

            System.out.println(split[i]);
        }
    }
}
/*
Given a String variable sentence, write code to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java
 */
