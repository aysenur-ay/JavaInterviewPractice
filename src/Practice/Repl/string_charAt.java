package Practice.Repl;
import java.util.Scanner;

public class string_charAt {public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String txt = s.next();
    //your code here

    if(txt.length()>5){
        System.out.print(txt.charAt(2)+"");
        System.out.print(txt.charAt(4)+"");
        System.out.print(txt.charAt(5)+"");
    }
}}
/*
using charAt method output the 3rd letter of txt string then the 5th letter then the 6th letter.

use print not println.

 */
