package Practice.Repl;
import java.util.Scanner;

public class SplitPersonInfo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info)
    {

        //your code here

        //   info = "person name: jon last name: doe age: 30";
        String [] split = info.split(",");
        System.out.println("person name: "+split[0]+" "+ "last name: "+split[1]+" "
                + "age: " +split[2]);

    }//end person


}

/*
The method person get a string with this format : "name,last name,age"
for example:

person("jon,doe,30");

the output is:

person name: jon last name: doe age: 30

hint: use the split method to split the string to a string array where there is a "," char

 */
