package HW10;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class FirstLastOccurrencesLinkedList {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Элемент 1");
        linkedList.add("Элемент 2");
        linkedList.add("Элемент 3");
        linkedList.add("Элемент 1");
        linkedList.add("Элемент 4");
        String targetElement = "Элемент 1";

        int firstOccurrence = findFirstOccurrence(linkedList, targetElement);
        int lastOccurrence = findLastOccurrence(linkedList, targetElement);

        if (firstOccurrence != -1) {
            System.out.println("Первое вхождение элемента '" + targetElement + "' находится по индексу: " + firstOccurrence);
        } else {
            System.out.println("Элемент '" + targetElement + "' не найден в списке.");
        }

        if (lastOccurrence != -1) {
            System.out.println("Последнее вхождение элемента '" + targetElement + "' находится по индексу: " + lastOccurrence);
        } else {
            System.out.println("Элемент '" + targetElement + "' не найден в списке.");
        }
    }

    private static <T> int findFirstOccurrence(List<T> list, T target) {
        ListIterator<T> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(target)) {
                return iterator.previousIndex();
            }
        }
        return -1;
    }
    private static <T> int findLastOccurrence(List<T> list, T target) {
        ListIterator<T> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            if (iterator.previous().equals(target)) {
                return iterator.nextIndex();
            }
        }
        return -1;
    }
}
