package Practice.Repl;
import java.util.Scanner;

public class FindingMaxLength2 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below

        String longestWord = words[0];

        for (int n = 0; n < words.length; n++){
            String currentWord = words[n];
            if(longestWord.length() < currentWord.length()){
                longestWord = currentWord;
            }
        }

        System.out.println(longestWord);
    }

}
/*
Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */
