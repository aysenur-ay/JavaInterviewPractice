package Practice.Repl;

public class removeFirstChar {
    public static String removeFirst(String target) {

        target = target.substring(1);

        return target;
    }

}
/*

The method gets a string and returns a string minus the first string.

for example:

removeFirst("aaa")
returns "aa"

 */