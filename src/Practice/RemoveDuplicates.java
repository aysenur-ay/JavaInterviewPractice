package Practice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "Ayyseenuurr";
        System.out.println(removeDuplicates(str));

    }

    public static String removeDuplicates(String word){
        String duplicates = "";
        for(int i = 0; i<word.length(); i++){
            if(! duplicates.contains(""+word.charAt(i))){
                duplicates+=word.charAt(i);
            }
        }

        return duplicates;

    }
}

// The name is bakhtiar
