package Practice.Repl;
import java.util.Scanner;

public class Happy_Valley_School_System {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();


        //WRITE YOUR CODE HERE
        String group = " ";
        if (age < 2) group = "ineligible";
        else if (age == 2) group = "toddler";
        else if (age >= 3 && age <= 5 ) group = "early childhood";
        else if (age >= 6 && age <= 7 ) group = "young reader";
        else if (age >= 8 && age <= 10) group = "elementary";
        else  if (age <= 12) group = "middle";
        else if (age <= 13) group = "impossible";
        else if (age <= 16) group = "high school";
        else if (age <= 18) group = "scholar";
        else group = "ineligible";

        System.out.println (group);

    }

}

/*
In the Happy Valley School System, children are classified by age as follows:

less than 2, ineligible
2, toddler
3-5, early childhood
6-7, young reader
8-10, elementary
11 and 12, middle
13, impossible
14-16, high school
17-18, scholar
greater than 18, ineligible

Given an int variable age, write an if statement that prints out, on a line by itself, the appropriate label from the above list based on age.

Example:
-Display prompt: Enter age:
8
-Display prompt: elementary
 */