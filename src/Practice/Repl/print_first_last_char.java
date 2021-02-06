package Practice.Repl;
import java.util.Arrays;
import java.util.Scanner;

public class print_first_last_char {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below

        for (int i = 0; i < words.length;i++){
            words [i] = words[i].substring(0,1) + words[i].substring(words[i].length()-1);
        }
        System.out.println(Arrays.toString(words));

    }
}

/*

Given a String array words, iterate through each word and print first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]

 */