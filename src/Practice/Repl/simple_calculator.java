package Practice.Repl;
import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {

        plus();
    }

    public static void plus(){

        //your code here

        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter first number: ");
        int n1 = scan.nextInt();
        //System.out.println("Enter second number: ");
        int n2 = scan.nextInt();
        System.out.println("result: " + (n1 + n2));
    }


}

/*
create a static method called "plus", its return is void and it gets no arguments.

It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
 */
