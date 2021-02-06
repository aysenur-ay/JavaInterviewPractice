package Practice.Repl;

public class RemoveDuplicates {

    public static void main(String[] args) {
        //test your code
        System.out.println( uniqueChars("wooden-spoon") ) ;
    }

    public static String uniqueChars(String str) {
        //TODO: write your below

        String word = "";



        for(int i = 0; i <= str.length()-1; i++){
            if(!word.contains(""+str.charAt(i))){
                word += str.charAt(i);
            }
        }


        return word;
    }
}

/*

uniqueChars is a method that you will code now, should be able to accept any string in the world and return unique characters from the parameter.

Examples:

uniqueChars("java") ==> "jav"

uniqueChars("mama") ==> "ma"

uniqueChars("spoon") ==> "spon"

 */