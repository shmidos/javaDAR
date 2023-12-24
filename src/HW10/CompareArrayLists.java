package HW10;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayLists {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("Один");
        list1.add("Два");
        list1.add("Три");
        list2.add("Четыре");
        list2.add("Пять");
        list2.add("Шесть");
        boolean result = compareArrayLists(list1, list2);
        if (result) {
            System.out.println("Списки идентичны.");
        } else {
            System.out.println("Списки различны.");
        }
    }

    private static boolean compareArrayLists(List<String> list1, List<String> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
