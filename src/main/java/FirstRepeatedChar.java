import java.util.*;

public class FirstRepeatedChar {

    // Find the first repeated character in a string
    public static void main(String[] args) {

        char ch = firstRepeated("a green apple");
        System.out.println(ch);

    }
    public static char firstRepeated(String str)
    {

        Set<Character> set = new HashSet<>();

        for (var ch : str.toCharArray())
        {
            if (set.contains(ch))
                return ch;

            set.add(ch);
        }



        return Character.MIN_VALUE;
    }
}
