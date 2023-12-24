package HW10;

import java.util.HashSet;
import java.util.Set;

public class CheckHashSetIsEmpty {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        if (hashSet.isEmpty()) {
            System.out.println("HashSet пуст.");
        } else {
            System.out.println("HashSet не пуст. Размер: " + hashSet.size());
        }

        hashSet.add("Элемент");

        if (hashSet.isEmpty()) {
            System.out.println("HashSet пуст.");
        } else {
            System.out.println("HashSet не пуст. Размер: " + hashSet.size());
        }
    }
}

