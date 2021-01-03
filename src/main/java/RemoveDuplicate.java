import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class RemoveDuplicate {

    // Remove duplicates from a given string

    public static void main(String[] args) {

        System.out.println(removeDupl("a beautiful tree"));

    }
    public static String removeDupl(String str) {
        if (str == null)
            return "";
        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet();

        for (var ch : str.toCharArray()) {
            if (!(seen.contains(ch))) {
                seen.add(ch);
                output.append(ch);
            }
        }

        return output.toString();
    }
}
