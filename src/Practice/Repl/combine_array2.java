package Practice.Repl;
import java.util.ArrayList;

public class combine_array2 {
    public static String combineRs(String[] r1,String[] r2)
    {

        ArrayList <String> word = new ArrayList<>();

        for (String each : r1){
            word.add(each);
        }

        for (String  each1 : r2){
            word.add(each1);
        }
        String result = "";
        for (String element : word){
            result += element;
        }

        return result;
    }

}

/*

combine two String arrays into one arraylist and return it as a string.

for example:

combineRs(["f","o","o"],[" b","a","r"])
returns "foo bar"


combineRs(["1","2","3"],[" 4"])
returns "1234"
 */
