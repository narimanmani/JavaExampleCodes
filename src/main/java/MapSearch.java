import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static java.util.Map.entry;

public class MapSearch {

    public static void main(String [] args)
    {
        List<Map<String, String>> input = new ArrayList<>();
        List<Map<String, String>> output = new ArrayList<>();

        Map<String, String> first = Map.ofEntries(
                entry("city", "Chicago"),
                entry("state", "Illinois"),
                entry("landmark", "Sears Tower")
        );
        Map<String, String> second = Map.ofEntries(
                entry("city", "Springfield"),
                entry("state", "Illinois")
        );
        Map<String, String> third = Map.ofEntries(
                entry("city", "New York City"),
                entry("state", "New York"),
                entry("landmark", "Empire State Building")
        );
        Map<String, String> fourth = Map.ofEntries(
                entry("city", "Paris"),
                entry("state", "Eiffel Tower")
        );

        input.add(first);
        input.add(second);
        input.add(third);
        input.add(fourth);

        List<String> fields = new ArrayList<>();
        List<String> values =new  ArrayList<>();

        fields.add("city");
        fields.add("state");

        values.add("Chicago");
        values.add("New York");



        output = search(input , fields , values);

        for (int i = 0 ; i < output.size() ; i++)
            System.out.println(output.get(i).toString());

    }

    public static  List search(List<Map<String, String>> input, List field, List value)
    {

        // sanity check for size
        List<Map<String, String>> output = new ArrayList<>();
        for ( int j = 0 ; j < field.size() ; j++)
        {
            for(int i= 0; i < input.size() ; i++ ) {
                Map<String, String> tempMap = new HashMap<>();
                tempMap = input.get(i);
                if (tempMap.containsKey(field.get(j)) && tempMap.get(field.get(j)).contains(value.get(j).toString())) {
                    output.add(tempMap);

                }
            }
        }

        return output;


    }



}
