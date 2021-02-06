package Practice.Repl;

public class Loop_div_3 {

    public static void main(String[] args) {

        for(int i = 1; i <= 20; i++){
            while(i % 3 == 0){
                System.out.print(i +" ");
                i++;
            }

        }

    }
}
/*
Write for and while loops so that they print those numbers between 1 and 20 and divisible by 3.
Expected Output:  3 6 9 12 15 18
 */
