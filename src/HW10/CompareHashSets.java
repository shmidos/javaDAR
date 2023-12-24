package HW10;
import java.util.HashSet;
import java.util.Set;

public class CompareHashSets {
    public static void main(String[] args) {
           Set<String> set1 = new HashSet<>();
        set1.add("Москва");
        set1.add("Санкт-Петербург");
        set1.add("Новосибирск");
        set1.add("Екатеринбург");

        Set<String> set2 = new HashSet<>();
        set2.add("Москва");
        set2.add("Казань");
        set2.add("Новосибирск");
        set2.add("Сочи");

        Set<String> commonCities = new HashSet<>(set1);

        commonCities.retainAll(set2);

        System.out.println("Города, присутствующие в обоих множествах:");
        for (String city : commonCities) {
            System.out.println(city);
        }
    }
}
