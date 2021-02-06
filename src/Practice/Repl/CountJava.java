package Practice.Repl;
import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        int count = 0;

        while(word.contains("java")){
            word = word.replaceFirst("java","");
            count++;
        }
        System.out.println(count);

    }
}
/*
Return the number of times that the string "java" appears anywhere in the given string word.

Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3
 */
