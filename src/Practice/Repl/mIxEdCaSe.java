package Practice.Repl;
import java.util.Scanner;

public class mIxEdCaSe {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below
        String word = "";

        for(int i = 0; i < s.length(); i++){
            if(i % 2 != 0){
                word += s.substring(i, i+1).toUpperCase();
            }else{
                word += s.substring(i, i+1).toLowerCase();
            }
        }
        System.out.println(word);
    }

}
/*

Given the following inputs:
String s;

Write a for loop that will print out the string in alternating cases, with the first letter being lowercase.

Keep in mind the following String methods:
str.toUpperCase(); //make it uppercase
str.toLowerCase(); //make it lowercase

DO NOT USE .charAt()!  .charAt returns a character, and you need a string in order to make it upper/lowercase.  To get a letter at a single position, use the following:
str.substring(x,x+1); //gives character as string at position x

Sample input/outputs:
In: powerful
pOwErFuL

In: COMEDIC
cOmEdIc

In: acroBATics
aCrObAtIcS

HINT: You will need to use an IF statement inside your for loop!
 */
