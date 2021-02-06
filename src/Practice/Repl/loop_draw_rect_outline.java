package Practice.Repl;
import java.util.Scanner;

public class loop_draw_rect_outline {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int x =0; x <= 2; x++){
            System.out.println("xxxx");

            for (int i =1; i <= n; i++){
                System.out.println("x x");
            }
        }




    }
}
/*
you get a number, write a code that draws a rectangle outline the size of that number.
each rectangle row is 3 x: xxx
inner rect row is "x  x"

for example:

n = 2

xxx
x  x
x  x
xxx


n=3

xxx
x  x
x  x
x  x
xxx

 */
