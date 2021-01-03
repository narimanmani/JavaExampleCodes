import java.util.HashMap;
import java.util.Map;

public class FiraNonRepeatingChar {

    // Given a string, find its first non-repeating character
    public static void main(String[] args) {

        char ch = findFirstChar("a green apple");
        System.out.println(ch);

    }
    public static char  findFirstChar(String str)
    {

        Map<Character,Integer> map = new HashMap<>();
        for (var ch: str.toCharArray())
        {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }
        for (var ch: str.toCharArray())
            if(map.get(ch)==1)
                return ch;

        return Character.MIN_VALUE;
    }

}
