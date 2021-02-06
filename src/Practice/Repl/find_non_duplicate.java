package Practice.Repl;
import java.util.Scanner;

public class find_non_duplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below


        for (int j = 0; j < nums.length; j++){

            int element = nums [j];
            int frequency = 0;

            for (int i =0; i < nums.length; i++){

                if(nums[i] == element){
                    frequency++;

                }


            }

            if (frequency == 1){
                System.out.println(element);



            }
        }

    }
}
/*

Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
         2

 */
