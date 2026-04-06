package ConceptBuilding;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Double>
                map = new HashMap<>();
        map.put("electricity", 2.0);
        map.put("Petrol", 3.0);
        map.put("Wastage", 4.0);
        System.out.println(map);
        for (Map.Entry<String, Double> m : map.entrySet()) {
            System.out.println("key: " + m.getKey() + " value: " + m.getValue());

        }
    }

}