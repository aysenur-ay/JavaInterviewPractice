package Practice.Repl;
import java.util.Scanner;

public class Task_029 {

    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner input = new Scanner(System.in);
        double version = input.nextDouble();

        //WRITE YOUR CODE HERE:
        String name = " ";
        if (version == 1.5 ) name = "Cupcake";
        else if (version == 1.6 ) name = "Donut";
        else if (version == 2.1) name = "Eclair";
        else if (version == 2.2) name = "Froyo";
        else if ( version == 2.3) name = "Gingerbread";
        else if (version == 3.1) name = "Honeycomb";
        else if (version == 4.0) name = "Ice Cream Sandwich";
        else if ( version >= 4.1 && version <= 4.31 ) name = "Jelly Bean";
        else if (version >= 4.4 && version <= 4.44) name = "KitKat";
        else if (version >= 5.0 && version <= 5.11) name = "Lollipop";
        else if (version >= 8.0 && version <= 8.1) name = "Oreo";
        else if (version==9.0) name = "Pie";
        else name = "Sorry, I don`t know this version!";
        System.out.println (name);
    }
}

/*
Android is one of the best operating systems in the world that helps the billion of users who use smart phones and tablets. Also, Android versions always had some funny names related to sweets. In this assignment, you need to write a program that will print a name of Android version, based on number. Please refer to the table beneath, in order to develop your if statement.


Create an object of Scanner class named scanner. (DONE)
Create double variable named version.
Write an if statement that will print android version name based on value of the version variable.

For example:


if version = 1.5, then print "Cupcake"
or, if version = 3.1, then print "Honeycomb"
or, if version is grater or equals to 4.1 and less or equals to 4.3.1 then print "Jelly Bean"

hint:  if(version>=4.1 && version<=4.31)

Otherwise (else), print "Sorry, I don't know this version!"


#################################################


input: 1.5
output: Cupcake

input: 9.0
output: Pie

input: 11.0
output: Sorry, I don't know this version!
 */
