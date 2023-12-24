package HW10;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReplaceTwoElementsLinkedList {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Элемент 1");
        linkedList.add("Элемент 2");
        linkedList.add("Элемент 3");
        linkedList.add("Элемент 4");

        System.out.println("Исходный список: " + linkedList);
        replaceTwoElements(linkedList, "Новый элемент 1", "Новый элемент 2", 1, 3);
        System.out.println("Измененный список: " + linkedList);
    }
    private static <T> void replaceTwoElements(List<T> list, T newElement1, T newElement2, int index1, int index2) {
        ListIterator<T> iterator = list.listIterator();
        for (int i = 0; i < index1; i++) {
            iterator.next();
        }
        iterator.set(newElement1);
        for (int i = index1 + 1; i < index2; i++) {
            iterator.next();
        }
        iterator.set(newElement2);
    }
}
