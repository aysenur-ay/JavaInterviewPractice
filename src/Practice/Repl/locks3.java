package Practice.Repl;

public class locks3 {
    public static void main (String [] args){

    }
    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        if (a && b){
            System.out.println("true");
        }else if(c){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        return a&&b || c;
    }//end threeLocks

}

/*

This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

https://en.wikipedia.org/wiki/Truth_table

 */
