package Practice.Repl;
import java.util.Scanner;

public class Cats_and_Dogs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        String wordOf3 = "";


        for (int i = 0; i <= word.length() - 3; i++){
            wordOf3 = word.substring(i, (i +3));
            //    System.out.println(wordOf3);


            if(wordOf3.equals("cat")){
                countOfCats++;
            }else if(wordOf3.equals("dog")){
                countOfDogs++;
            }
        }

        if(countOfDogs==countOfCats){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.
Example:
input: catdog
output: true

Example:
input: catcat
output: false

Example:
input: cat-cheetah-dog-cat
output: false
 */