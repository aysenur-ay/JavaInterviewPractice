package Practice.Repl;

import java.util.ArrayList;

public class timesTwo {
    public static void main(String[] args)
    {

    }
    //create your method below
    public static void timesTwo (ArrayList<Integer> nums){

        for (int i =0; i < nums.size(); i++){
            int each = nums.get(i);
            nums.set(i, each*2);
        }


        System.out.print(nums);

    }

}
/*
Create a method that:
is called timesTwo
returns nothing
takes in a single parameter - an ArrayList of Integers called nums

This method should take the ArrayList parameter and multiply every value by two.
 */