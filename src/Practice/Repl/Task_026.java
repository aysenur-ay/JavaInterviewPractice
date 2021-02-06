package Practice.Repl;
import java.util.Scanner;

public class Task_026 {

    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        //your code here

        boolean positive = num > 0;
        boolean negative = num < 0;
        boolean zero = num == 0;

        if (positive) {
            System.out.println ("positive");
        }

        if (negative) {
            System.out.println ("negative");
        }

        if (zero) {
            System.out.println ("zero");
        }



    }
}
/*
in this assignment you are given an int num.
you need to check if num is positive negative or equals to zero.
use 3 if statements to do this .
output if num is positive negative or zero

for example:
num  = 1

print:
"positive"

num = -6

print:
"negative"

num = 0

print:
"zero"

 */
