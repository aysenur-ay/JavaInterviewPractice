package Practice.Repl;

import java.util.Arrays;

public class MergeArrays {
    public static int[] mergR(int[] a,int[] b) {
        int [] c = new int [a.length + b.length];
        int x = 0;

        for (int i = 0; i < a.length; i++){
            c[x++] = a[i];
        }

        for(int n = 0; n < b.length; n++){
            c[x++] = b[n];
        }

        System.out.println(Arrays.toString(c));
        return (c);

    }//end mergR

    public static void main(String[] args)  {
        // Scanner scan = new Scanner(System.in);
        int [] z = {1, 2, 3};
        int [] y = {4, 5, 6};


        mergR(z, y);
    }

}

/*

mergR merges two arrays into one.
it gets two int arrays and returns an int array

for example:

mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]

mergR([1,2],[6,8])
returns [1,2,6,8]

hint:
create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).

loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).

do the same for the second array.
 */
