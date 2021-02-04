package Practice;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reversed("inara"));

    }

    public static String reversed(String arr){

        String result = "";

        for(int i = arr.length()-1; i >= 0; i--){
            result += arr.charAt(i);
        }


        return result;
    }
}
