package Practice.Repl;
import java.util.Scanner;

public class Has_Java {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.contains("java")) {
            if (word.charAt(0) == 'j' || word.charAt(1) == 'j') {
                System.out.println("true");
            }else {
                if (word.charAt(0) != 'j' || word.charAt(1) != 'j')
                    System.out.println("false");
            }

        }else{
            System.out.println("false");
        }
    }
}
/*
Given a string word, print true if "java" appears starting at index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = .
Example:
input: javapython
output: true

Example:
input: cjavac++
output: true


Example:
input: c#javaruby
output: false
 */
