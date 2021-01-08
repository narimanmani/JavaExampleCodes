public class LongestNonRepeat {

    // longest non repeating substring

    static final int NO_OF_CHARS = 256;
    public static void main(String [] args)
    {
       String str = "bbbbb";
       int len = findSub(str);
       System.out.println(len);

    }

    public static int findSub(String str){

        int n = str.length();
        int res = 0;
        int [] lastIndex = new int[NO_OF_CHARS];
        int j = 0;
        for(int i=0 ; i < n ; i++)
        {

            j = Math.max(j, lastIndex[str.charAt((i))]+1);
            res = Math.max(res, i-j +1);
            lastIndex[str.charAt(i)] =i;

        }
    return  res;

    }

}
