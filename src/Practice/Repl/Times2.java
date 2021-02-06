package Practice.Repl;
import java.util.ArrayList;
import java.util.Arrays;

public class Times2 {
    public static void main(String[] args)
    {

    }

    //create your method below:
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> r){

        ArrayList<Integer> twice = new ArrayList<>();

        for (Integer each : r){
            twice.addAll(Arrays.asList(each, each));
        }
        return twice;
    }

}

/*

Create a method that:

is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers

This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.

For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)
 */
