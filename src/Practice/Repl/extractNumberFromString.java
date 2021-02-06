package Practice.Repl;

public class extractNumberFromString {
    public static String extractNum(String s) {


        String isDig = "";

        for(char each : s.toCharArray()){

            if(Character.isDigit(each)){
                isDig += ""+each;
            }
        }

        System.out.println(isDig);

        return isDig;
    }

}

/*
extractNum

description:
a method that cleans any non number string from a string it gets
and returns the clean string
input:
-s (string)- a string the method gets
return: string: a string of numbers only

example use:

extractNum("aa2aa3") ==> 23

extractNum("aa2") ==> 2

extractNum("aa10aa") ==> 10

extractNum("aa!!%$#.10aa") ==> 10


hint:
you can use:
 Character.isDigit(ch)
 or conditions

 */
