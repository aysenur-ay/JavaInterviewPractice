package Practice.Repl;

import java.util.ArrayList;

public class Times2_2 {
    public static void main(String[] args)
    {

    }


    //create your method below

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> arrl){

        ArrayList<Integer> arrl2 = new ArrayList<>();

        for( Integer each : arrl){
            arrl2.add(each);
            arrl2.add(each);

        }

        return arrl2;
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
