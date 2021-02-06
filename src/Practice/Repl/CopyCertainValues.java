package Practice.Repl;

import java.util.Arrays;

public class CopyCertainValues {
    public static void main(String[] args) {
        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two","three","four"};
        System.out.println(Arrays.toString(getWithE(numbers)));

    }



    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------


        int count =0;

        for(int i =0; i< arr.length; i++){
            if(arr[i].contains("e")){
                count++;
            }
        }


        String [] fewValues = new String [count];
        int x = 0;

        for(int i =0; i< arr.length; i++){

            if(arr[i].contains("e")){
                fewValues[x] = arr[i];
                x++;
            }
        }




        //YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }

}
/*
Given a String array arr with the following elements
["zero", "one", "two","three","four"]

Create another array fewValues and copy words that have letter "e" in them

You need to know how many element contain "e" and create array accordingly

Values in fewValues array need to be["zero", "one","three"]

Examples:
arr -> ["aa", "be", "lol", "lel", "oreo"]
fewValues -> ["be",  "lel", "oreo"]

arr -> ["e", "hey", "bye", "furey", "spoon"]
fewValues ->["e", "hey", "bye", "furey"]
 */
