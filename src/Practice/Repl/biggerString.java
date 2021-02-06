package Practice.Repl;

public class biggerString {
    public static void main (String [] args){
        biggerS("orange", "apple");
    }
    public static String biggerS(String a ,String b)
    {

        String big = "";

        int l1 = a.length();
        int l2 = b.length();

        if(l1> l2){
            big = a;
        } else if(l2 > l1){
            big = b;
        }else {
        }
        System.out.println(big);

        return big;

    }

}

/*
the method gets two strings and return the longest one

biggerS("apple","orange") ==> "orange"
 */