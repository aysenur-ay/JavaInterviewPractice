package Practice.Repl;

public class addElements {
    public static void main (String [] args){

    }


    public static int[] addElements(int[] ints1, int[] ints2) {

        int [] a = new int [ints1.length];

        for ( int i = 0; i < ints1.length; i++){
            a[i] = ints1[i];
        }

        for(int x = 0; x < ints2.length; x++){
            a[x] += ints2[x];
        }

        return a;
    }

}
/*
Method addElements accepts 2 int arrays and adds each element value of two arrays and returns a new array. You can assume that each array has 5 elements

addElements([10, 40, 50, 3, 1], [11, 0, 500, 44, 1101]);
--------
return array after adding values in the arrays:
             [21, 40, 550, 47, 1102]


 */
