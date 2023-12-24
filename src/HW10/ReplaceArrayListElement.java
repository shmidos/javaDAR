package HW10;
import java.util.ArrayList;
import java.util.List;

public class ReplaceArrayListElement {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Элемент 1");
        myList.add("Элемент 2");
        myList.add("Элемент 3");

        System.out.println("Исходный список: " + myList);

        replaceSecondElement(myList, "Новый элемент");

        System.out.println("Измененный список: " + myList);
    }

    private static void replaceSecondElement(List<String> list, String newElement) {
        if (list.size() >= 2) {
               list.set(1, newElement);
        }
    }
}
