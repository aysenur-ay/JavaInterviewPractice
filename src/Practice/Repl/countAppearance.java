package Practice.Repl;
import java.util.Scanner;

public class countAppearance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] arr1 = new String[size];
        String t1 = scan.next();
        for(int i=0; i < size; i++){
            arr1[i] = scan.next();
        }
        count_appearance(arr1,t1);
    }



    public static int count_appearance(String[] arr, String t) {
        int count =0 ;

        for (int i = 0; i <= arr.length-1; i++){
            if (t.equals(arr[i])){
                count++;
            }
        }


        return count;
    } //end  count_appearance

}

/*
Create a method that gets an array of strings and a string, the method returns an int.

It counts how many times a string appears in the array and returns the count.

for example (pseudo code):

some_array = ["a","foo","bar","foo","bla"]

some_string = "foo"

count_appearance(some_array ,some_string )

will return 2 because some_array  has 2 appearances of "foo" string.

 */
