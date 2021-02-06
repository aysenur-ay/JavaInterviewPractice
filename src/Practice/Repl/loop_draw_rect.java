package Practice.Repl;
import java.util.Scanner;

public class loop_draw_rect {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int k = 1; k <= n; k++){
            for ( int i = 1; i <= 3; i++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
/*
you get a number, write a code that draws a filled rectangle the size of that number.
each rectangle row is 3 x: xxx

for example:

n = 2

xxx
xxx


n=3
xxx
xxx
xxx
 */
