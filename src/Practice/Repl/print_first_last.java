package Practice.Repl;
import java.util.Scanner;

public class print_first_last {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print firt and last char of each items in one line

        //TODO: Write your code below

        for(int i =0; i < words.length; i++){
            System.out.println(words[i].substring(0,1) + words[i].substring(words[i].length()-1));
        }

    }
}
/*
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne

 */
