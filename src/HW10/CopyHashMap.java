package HW10;
import java.util.HashMap;
import java.util.Map;

public class CopyHashMap {
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("Ключ1", 1);
        originalMap.put("Ключ2", 2);
        originalMap.put("Ключ3", 3);

        Map<String, Integer> copiedMap = new HashMap<>();

        copiedMap.putAll(originalMap);

        System.out.println("Исходная HashMap:");
        System.out.println(originalMap);

        System.out.println("Скопированная HashMap:");
        System.out.println(copiedMap);
    }
}
