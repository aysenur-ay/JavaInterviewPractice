package Practice.Repl;
import java.util.Scanner;

public class PrintUniqueWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE
        //  String word = "";


        for (int i =0; i <= words.length-1; i++){
            String word = words[i];
            int count = 0;

            for(int x = 0; x <= words.length-1; x++){
                if(words[x].equals(word)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(word);
            }


        }


    }
}
/*
Complete a void method printUniqueWords() that will print only unique words from an array of strings. Every single unique word should be printed from the new line.

Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python
 */
