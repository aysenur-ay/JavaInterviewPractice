package Practice.Repl;
import java.util.Scanner;

public class For_Loops_vowel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        word = word.replaceAll(" ", "");

        String newW = "";
        for (char i =0; i < word.length(); i++){
            if(word.charAt(i) == 'o' ||word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'u' ){
                newW +=word.charAt(i);
            }
        }
        System.out.println(newW);

    }

}
/*
Inputs:
String word;

Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
In: howdyho
oo

In: huehuehuehue
ueueueue

In: poopoo what idk what im doing
ooooaiaioi
 */
