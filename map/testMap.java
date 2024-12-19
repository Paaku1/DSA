package Map;
import java.util.*;
public class testMap {
    public static void main(String[] args) {
        Map<Integer,Integer> x = new HashMap<>();
        x.put(1,1);
        x.put(2,2);
        x.put(2,3);
        System.out.println(x);
        System.out.println(x.get(1));
        System.out.println(x.containsKey(3));
    }
    
}
