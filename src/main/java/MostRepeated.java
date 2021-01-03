import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MostRepeated {

    // Return maximum occurring character in an input string
    public static void main(String[] args) {

        System.out.println(mostRepeated("Trees are beautiful"));

    }
    public static char mostRepeated(String str)
    {
        if (str == null)
            return '\u0000';
        Map<Character, Integer> freq = new HashMap();
        for (var ch : str.toCharArray())
        {
            if (freq.containsKey(ch))
                freq.replace(ch, freq.get(ch) + 1);
            else
                freq.put(ch,1);
        }
        Set<Character> keys = freq.keySet();
        int max = 0;
        char mostRepeated = '\u0000';
        for (var ch: keys)
        {
            if (freq.get(ch) > max)
            {
                max = freq.get(ch);
                mostRepeated = ch;
            }
        }
        return mostRepeated;
    }
}
