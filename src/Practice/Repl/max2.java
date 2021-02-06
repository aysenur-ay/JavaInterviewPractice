package Practice.Repl;

public class max2 {
    public static void main (String [] args){

    }

    public static int max(int x,int  max)
    {
        int result = 0;

        if(x>max){
            result = max;
        }else{
            result = x;
        }

        return result;
    }

}
/*
max function gets two ints, x and max.
x is the test case, max is what we test against.

if  x is bigger then max return max
in any other case return x.
 */