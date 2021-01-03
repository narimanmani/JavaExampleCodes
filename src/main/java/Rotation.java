public class Rotation {

    public static void main(String[] args) {
        System.out.println(Boolean.toString(areRotation("ABCD","DABC")));

    }
    public static boolean areRotation(String str1, String str2)
    {
        if (str1.length() != str2.length())
            return false;

        return (str1+str1).contains(str2);
    }
}
