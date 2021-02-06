package Practice.Repl;

import java.util.ArrayList;

public class repeatAll {
    public static void main(String[] args)
    {

    }
    //create your method below
    public static void repeatAL(ArrayList<Boolean> bool){

        System.out.println(bool.addAll(bool));

    }

}

/*
Create a static method that:
is called repeatAL
returns nothing
takes in a single parameter - an ArrayList of Booleans

This method should modify its ArrayList parameter by repeating its ArrayList values.

For example, if the parameter is
(true, false, false)
The modified ArrayList should be
(true, false, false, true, false, false)
 */
