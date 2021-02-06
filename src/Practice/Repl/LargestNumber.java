package Practice.Repl;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows


        //TODO write your code below
        int max = 0;

        for (int [] each : arr){
            for (int each1 : each){

                if (each1 > max){
                    max = each1;
                }
            }
        }

        System.out.println(max);



    }//end main

}

/*
Given a 2d array of ints, find the biggest number(int) in the array and print it.
 */
