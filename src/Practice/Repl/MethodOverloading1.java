package Practice.Repl;

public class MethodOverloading1 {
    //WRITE YOUR CODE HERE
    public  static void main (String [] args){

    }


    public static int findMax(int [] arr1){
        int max = arr1[0];
        //int count = 0;

        for (int each : arr1) {
            if (each > max) {
                max=each;
            }

        }
        //  System.out.println(max);

        return (max);
    }

    public static double findMax(double [] arr2){
        double max1 = arr2[0];
        //double count = 0;

        for (double each : arr2) {
            if (each > max1) {
                max1=each;
            }

        }
        // System.out.println(max1);

        return (max1);
    }


}

/*

In this task, you need to write 2 methods findMax() that will find a maximum number in the array.
First method should work with array of integers (int[]) and return int,
and second method should work with an array of doubles (double[]) and return double as a result.
Methods must have the same name and different parameters.
Fo more information:  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

Comment: Methods should be non static and with a return type.
 */
