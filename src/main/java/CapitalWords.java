import java.util.HashMap;
import java.util.Map;
import java.util.*;


public class CapitalWords {
    public static void main(String[] args) {
        System.out.println(capitalWords("trees are beautiful"));
    }

    public static String capitalWords(String str)
    {
        if (str == null)
            return "";
        String[] words = str.split(" ");
        for (int i = 0 ; i < words.length ; i++)
        {
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase() ;
        }
        return String.join(" ",words).trim();
    }
}
