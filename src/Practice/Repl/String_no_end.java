package Practice.Repl;
import java.util.Scanner;

public class String_no_end {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here

        System.out.println(txt.substring(0, txt.length() - 1));
    }
}
/*
In this exercise you get a string called txt .

output txt without its last letter.

for example:

txt = "foo"

output will be:
fo

 */
