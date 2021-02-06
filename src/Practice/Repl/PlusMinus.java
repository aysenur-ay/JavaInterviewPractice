package Practice.Repl;

public class PlusMinus {
    public static void main(String[] args) {

        System.out.println("1+1 = "+Cal.plus(1,1) );
        System.out.println("1-1 = "+Cal.minus(1,1) );

    }
}

class Cal {

    public static int num1, num2;

    public static int plus(int num1, int num2){
        return num1 + num2;
    }

    public static int minus(int num1, int num2){
        return num1 - num2;
    }


}

/*
A static method can be used without instantiating a class object.

like in the calculator class create a plus and minus. but this time make them static methods.

plus: gets two ints and returns the addition of the to numbers as an int

Calc.plus(1,1)
returns:2

Calc.plus(10,1)
returns:11

minus:  the same as plus its also static, but it returns the substructed value of the two ints it gets

Calc.minus(1,1)
returns:0

Calc.plus(10,1)
returns:9
 */
