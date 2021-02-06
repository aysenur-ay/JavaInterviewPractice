package Practice.Repl;
import java.util.Scanner;

public class Week_Days {
    public static void main(String[] args) {
        // DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int day = scan.nextInt();

        //WRITE YOUR CODE HERE
        String name = " ";

        switch (day){
            case 1: name = "Monday"; break;
            case 2: name = "Tuesday"; break;
            case 3: name = "Wednesday"; break;
            case 4: name = "Thursday"; break;
            case 5: name = "Friday";break;
            case 6: name = "Saturday"; break;
            case 7: name = "Sunday"; break;
            default: name = "Invalid number!";
        }
        System.out.println (name);

    }

}
/*
Display message: "Enter number:"
1
Display message: "Monday"
 */
