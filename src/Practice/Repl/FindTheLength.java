package Practice.Repl;
import java.util.Scanner;

public class FindTheLength {
    public static void main(String[] args) {
        //WRITER YOU CODE HERE

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text = scan.nextLine();
        int length = text.length();
        System.out.println("Length is: "+ length);
    }
}
/*
Example:
Display message: "Please enter the text:"
input: java
Display message: "Length is: 4"
 */
