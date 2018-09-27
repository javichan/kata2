package kata2;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        final Integer[] data = {1,2,3,4,5,6,7,8,9,1,2,3,7,8,9};
        Histogram histo= new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        
        
        histogr.keySet().stream().forEach((key) -> {
            System.out.println(key + "==>" + histogr.get(key));
        });


    }   
}
