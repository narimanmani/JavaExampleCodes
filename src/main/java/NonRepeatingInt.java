import java.util.*;

// Find the only non repeating int in a array

public class NonRepeatingInt {


  public static void main(String [] args)
  {

      Integer[] numbers = {2, 2, 1, 1,5};
      int n=findFirstNonInt(numbers);
      System.out.println(n);
  }

    public static int findFirstNonInt(Integer[] numbers)
    {
       Map<Integer, Integer> map = new HashMap<>();

       for(int i=0 ; i < numbers.length ; i++)
       {
           var count = map.containsKey(numbers[i])?map.get(numbers[i]) : 0 ;
           map.put(numbers[i],count+1);
       }
        for(int i=0 ; i < numbers.length ; i++) {
          if(map.get(numbers[i])==1)
              return numbers[i];
        }

        return 0;

    }
}
