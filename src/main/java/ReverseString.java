public class ReverseString {
    // Reverse a string in Java
    public static void main(String[] args) {

        String reversedStr = reverse("abscdefghij");
        System.out.println(reversedStr);

    }
    public static String reverse(String str)
    {
        if (str == null)
            return "";

        StringBuilder reverse = new StringBuilder();
        for ( int i = str.length() - 1; i>=0 ; i--)
            reverse.append(str.charAt(i));

        return reverse.toString();

    }
}
