package Practice.Repl;
import java.util.Scanner;

public class FindMidNumber {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE

        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        System.out.println("Enter first number:");
        System.out.println("Enter second number:");
        System.out.println("Enter third number:");

        if(n1 > n2 && n1 < n3 || n1 < n2 && n1 > n3){
            System.out.println("Medium value is: " + n1);
        }else if(n2 > n1 && n2 < n3 || n2< n1 &&n2 > n3){
            System.out.println("Medium value is: " + n2);
        }else if(n3 > n1 && n3 < n2 || n3 < n1 && n3 > n2){
            System.out.println("Medium value is: " + n3);
        }else{

        }
    }
}
/*
Write a program that will return mid number out of three numbers.  No need to do any calculations.

Steps to write a program:
Create an object of Scanner class.
Declare int 3 variables: num1, num2, num3.

Example 1:
Display prompt: "Enter first number:"
14
Display prompt: "Enter second number:"
52
Display prompt: "Enter third number:"
25
Display prompt: "Medium value is: 25"

Example 2:
Display prompt: "Enter first number:"
140
Display prompt: "Enter second number:"
34
Display prompt: "Enter third number:"
1
Display prompt: "Medium value is: 34"
 */
