package Practice.Repl;

public class AppearsTwice {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     *target - string that you need to check.
     * sentence - string where you need to lookup for target.
     *
     */
    public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:
        boolean twice = false;

        String [] split = sentence.split(" ");

        int count = 0;

        for (String each : split){

            if(each.equals(target)){
                count++;

            }
        }

        if (count == 2){
            twice = true;
        }

        return twice;
    }

}
/*

Write a a method appearsTwice() that returns true if value of variable target appears only twice in the string sentence,
 otherwise return false.

Examples:
Main.appearsTwice("java", "java is fun!")
      - returns false, because java appears only once.

Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.")
      - returns true, because laptop appears twice.
 */
