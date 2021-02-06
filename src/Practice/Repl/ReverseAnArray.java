package Practice.Repl;

public class ReverseAnArray {
    /**
     * Reverses the order of the elements in the specified array
     * @param arr
     * @return array of strings
     */
    public static String[] reverse(String[] arr) {
        //write your codes here

        String[] reverse = new String [arr.length];

        for (int i = arr.length-1, x=0; i >= 0 ; i--, x++){

            reverse[x] = arr[i];
        }


        return reverse;
    }

}
/*
Write the definition of a method reverse, whose parameter is an array of Strings.
 The method reverses the elements of the array. The method returns an array of strings in the reversed order.
Example:
input: ["apple", "pear"]
output: ["pear", "apple"]
 */