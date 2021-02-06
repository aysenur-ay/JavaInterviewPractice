package Practice.Repl;
import java.util.Scanner;

public class Task_033 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        int numOfMilligrams = scan.nextInt();
        int drink = 10000/numOfMilligrams;
        System.out.println("It would take about " + drink + " drinks for a lethal overdose.");
    }
}

/*

Scientists estimate that roughly 10 grams of caffeine consumed at one time is a  lethal overdose.
 Write a program with a variable that holds the number of ms of caffeine in a drink and outputs how many drinks it takes to kill a person.
  In one gram, there is 1000 mg. Please refer to the image milligraabove as an example and use any number of variables you want.
  Dots mean space in the picture.

Formula to get drink count to cause an overdose is
10*1000 / numOfMilligrams
 */
