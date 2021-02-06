package Practice.Repl;
import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        String vowel = "";

        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'o'){
                vowel += word.charAt(i)+"";
            }else if(word.charAt(i) == 'a'){
                vowel += word.charAt(i)+"";
            }else if(word.charAt(i) =='i'){
                vowel += word.charAt(i)+"";
            }else if(word.charAt(i) == 'u'){
                vowel += word.charAt(i)+"";
            }else if(word.charAt(i) == 'e'){
                vowel += word.charAt(i)+"";
            }else{

            }
        }
        System.out.println(vowel);
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
