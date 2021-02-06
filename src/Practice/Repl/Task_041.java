package Practice.Repl;
import java.util.Scanner;

public class Task_041 {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        //WRITE YOUR CODE HERE:
        String result = (number > 0) ? number + " is positive" : (number < 0) ? number + " is negative" : "it is zero";
        System.out.println (result);



    }

}
/*
U have an Integer number already declared and assigned value.

Using Multi-Branch if statements, check if number is positive, negative or zero. Please follow the below examples and print message accordingly:

Enter a number:
10
10 is positive

Enter a number:
-55
-55 is negative

Enter a number:
0
it is zero

 */
