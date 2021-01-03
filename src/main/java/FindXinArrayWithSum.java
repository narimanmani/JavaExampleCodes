import java.util.*;

public class FindXinArrayWithSum {
  //  Given an array A[] and a number x, check for pair in A[] with sum as x
    public static void main(String args[]) {
        int[] myArray = new int[] {
                1,
                2,
                3,
                4,
                5};
        findSum(myArray, 3);
        findSum(myArray, 5);
    }

    public static void findSum(int[] inputs, int n)
    {
        Set<Integer> hash = new HashSet<Integer>();
        for (int i = 0; (i < inputs.length); i++) {
            int candidate = (n - inputs[i]);
            if (hash.contains(candidate)) {
                System.out.println(Integer.toString(inputs[i]));
                System.out.println(Integer.toString(candidate));
            }

            hash.add(inputs[i]);
        }
        return;
    }
}
