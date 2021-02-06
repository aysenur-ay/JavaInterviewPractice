package Practice.Repl;
import java.util.Scanner;

public class PrintUniqueNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE

        for (int j = 0; j < nums.length; j++) {

            int element = nums[j];
            int frequency = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == element) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                System.out.println(element);
            }

        }
    }
}

/*
Complete a void method printUniqueNumbers() that will print all unique numbers from an array of ints.
Every single unique int should be printed from the new line.

Example:
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output:
2
9
34
 */
