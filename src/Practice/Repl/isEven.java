package Practice.Repl;

public class isEven {

    public static void main (String [] str){

    }

    public static boolean isEven(int n)
    {

        boolean isEven1 = n % 2 == 0;

        if(isEven1){
            System.out.println("true");
        }else if(!isEven1){
            System.out.println("false");
        }

        return isEven1;
    }
}
/*
isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.

for example:

isEven(1) --> false

isEven(8) --> true
 */