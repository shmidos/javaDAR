package HW10;
import java.util.HashMap;
import java.util.Map;

public class CheckHashMapContainsValue {
    public static void main(String[] args) {
        Map<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("Ключ1", 10);
        myHashMap.put("Ключ2", 20);
        myHashMap.put("Ключ3", 30);

        int targetValue = 20;

        boolean containsValue = myHashMap.containsValue(targetValue);
        if (containsValue) {
            System.out.println("HashMap содержит запись с значением " + targetValue);
        } else {
            System.out.println("HashMap НЕ содержит записи с значением " + targetValue);
        }
    }
}
