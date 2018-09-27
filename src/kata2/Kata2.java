package kata2;
import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        final int[] data = {1,2,3,4,5,6,7,8,9,1,2,3,7,8,9};
        Map<Integer ,Integer> histogram = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            int e = data[i];
            histogram.put(e, histogram.containsKey(e)?histogram.get(e) + 1 : 1);
                     
        }
        
        histogram.keySet().stream().forEach((key) -> {
            System.out.println(key + "==>" + histogram.get(key));
        });


    }   
}
