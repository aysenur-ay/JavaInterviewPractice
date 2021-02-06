package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmed {
    public static void main(String[] args) {
        String[] names = {"Umar", "Muhtar","Ahmed"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        list.removeIf(p-> p.equalsIgnoreCase("ahmed"));
        System.out.println(list);
    }
}
