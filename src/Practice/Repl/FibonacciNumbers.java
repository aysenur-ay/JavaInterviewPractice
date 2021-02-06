package Practice.Repl;
import java.util.Scanner;

public class FibonacciNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE

        int[] fib = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};


        System.out.println(fib[num]);

    }
}

/*
 Complete a method fib() that will compute Fibonacci numbers
Complete a method fib() that will compute Fibonacci numbers
In Fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……... The first two numbers of the Fibonacci series are 0 and 1.
You are given a number num, print n-th Fibonacci Number.
Input  : 2
Output : 1
(Explanation : because number 2 in the sequence of 0, 1 --> 1)

Input  : 8
Output : 21
(Explanation : because number 8 in the sequence of
  0, 1, 1, 2, 3, 5, 8, 13, 21 --> 21)



Input  : 2
Output : 1
(Explanation : because number 2 in the sequence of 0, 1 --> 1)

Input  : 8
Output : 21
(Explanation : because number 8 in the sequence of
  0, 1, 1, 2, 3, 5, 8, 13, 21 --> 21)

 */
