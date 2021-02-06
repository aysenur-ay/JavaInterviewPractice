package Practice.Repl;
import java.util.Scanner;

public class Reverse_it {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        int length = word.length();


        if(length == 5){
            System.out.print( word.charAt(4));
            System.out.print( word.charAt(3));
            System.out.print( word.charAt(2));
            System.out.print( word.charAt(1));
            System.out.print( word.charAt(0));
        } else if(length > 5){
            System.out.println("Too long!");
        }else{
            System.out.println("Too short!");
        }


    }
}
/*
Write a program that will reverse a string. Your program should reverse a string only 5 characters long. If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the console.

Example:
input: cat
output: Too short!

Example:
input: singularity
output: Too long!

Example:
input: apple
output: elppa

 */
