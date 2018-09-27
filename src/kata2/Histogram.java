
package kata2;
import java.util.HashMap;
import java.util.Map;

public class Histogram {
    
    private final int[] data;

    public Histogram(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }
    
    public Map getHistogram(){
        Map<Integer ,Integer> histogram = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            int e = data[i];
            histogram.put(e, histogram.containsKey(e)?histogram.get(e) + 1 : 1);
                     
        }
        return histogram;
        
    }
    
    
}
