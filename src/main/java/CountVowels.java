public class CountVowels {

    public static void main(String[] args) {

        int vCount = countVowels("a green apple");
        System.out.println(vCount);

    }
    public static int  countVowels(String str)
    {
        if (str == null)
            return 0;
        int count = 0;
        String vowels = "aeiou";
        for (var ch : str.toLowerCase().toCharArray())
            if (vowels.indexOf(ch) != -1)
                count ++;

        return count;

    }
}
