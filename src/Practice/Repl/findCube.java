package Practice.Repl;
import java.util.Scanner;

public class findCube {
    //your code here
    public static void cube(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
        System.out.println(num*num*num);
    }



    //end cube

    public static void main(String[] args) {

        cube();

    }

}
/*
create a method called cube. Write all required code inside this method in order  to asks the user for a number and then prints the cubed value of that number:

Example:

input: 5
output: 125

hint: cube of a number n = n*n*n
 */
