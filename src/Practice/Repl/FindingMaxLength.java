package Practice.Repl;
import java.util.Scanner;

public class FindingMaxLength {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below

        int max = words[0].length();

        for (String each : words){

            if(each.length() > max){
                max = each.length();
            }
        }

        // System.out.println (max);

        for(String each : words){
            if(each.length() == max){
                System.out.println(each);
            }
        }

    }
}
/*
Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */
