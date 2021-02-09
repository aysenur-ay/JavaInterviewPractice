package Practice;

public class FindUnique {


    public static void main(String[] args) {
        System.out.println(unique("AAAAABBBBCDEEEEEF"));
    }

    public static String unique (String word){//A A A A A B B B B C D E E E E E F    CDF
        String uniqueString = "";

        String [] arr = word.split("");

        for(int i = 0; i < arr.length; i++){ // 'A' A A A A B B B B C D E E E E E F
            int count = 0;

            for (int j = 0; j < arr.length; j++) {// A A A A A B B B B C D E E E E E F

                if(arr[i].equals(arr[j])){
                    count++;
                }
            }

            if(count==1){
                uniqueString += arr[i];
            }


        }




        return uniqueString;
    }
}
