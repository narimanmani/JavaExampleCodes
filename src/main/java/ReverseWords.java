import java.util.*;

public class ReverseWords {


    // Reverse words in a given string - two different  methods
    public static void main(String[] args) {

        String reversedStr = reverse2(" A green apple");
        System.out.println(reversedStr);

    }
    public static String reverse(String sentense)
    {
        if (sentense == null)
            return "";
        String[] words = sentense.split(" ");
        StringBuilder reverse = new StringBuilder();
        for ( int i = words.length - 1; i>=0 ; i--)
            reverse.append(words[i]+" ");

        return reverse.toString();

    }

    public static String reverse2(String setense)
    {
        if (setense == null)
            return "";
        String[] words = setense.split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ",words);

    }
}
