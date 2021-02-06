package Practice.Repl;
import java.util.Scanner;

public class First_Two_Characters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here

        System.out.print(txt.substring(0,2));
    }
}
/*
using substring method output the first two letters of txt string
for examole:
String txt = "foo"
the first two letters are "fo"


use print not println.
 */
