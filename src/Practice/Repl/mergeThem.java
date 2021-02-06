package Practice.Repl;

public class mergeThem {
    public static String mergeStrings(String one, String two) {

        String word ="", longerStr = "";
        int shorter = 0;

        if(one.length()>two.length()){
            longerStr = one;
            shorter = two.length();

        }else {
            longerStr = two;
            shorter = one.length();
        }

        for(int i = 0; i < shorter; i++){
            word += "" + one.charAt(i)+ two.charAt(i);
        }

        word += longerStr.substring(shorter);
        return word;
    }

}
/*
When gears merge and work together, one teeth from each one goes in order.
Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.   Please note one and two can be of different lengths. Please look at below examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
 */
