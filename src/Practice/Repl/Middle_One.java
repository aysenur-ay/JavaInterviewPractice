package Practice.Repl;
import java.util.Scanner;

public class Middle_One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        int  wordL = word.length() / 2;


        if (word.length() % 2 != 0){
            if (word.length() >= 3){
                System.out.println(word.charAt(wordL));
            } else {
                System.out.println(word+word+word);
            }
        }else{

            if(word.length() >= 4){
                System.out.print(word.charAt(wordL - 1) +""+ word.charAt(wordL));
            }else {
                System.out.println(word+word);
            }

        }


    }
}
/*
You have a word, do the following:

1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
 */
