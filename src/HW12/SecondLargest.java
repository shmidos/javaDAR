package HW12;
public class SecondLargest {

    public static void main(String[] args) {
        int[] array = {10, 5, 8, 20, 15};
        int secondLargest = findSecondLargest(array);

        System.out.println("Второе по величине число в массиве: " + secondLargest);
    }
    public static int findSecondLargest(int[] array) {

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
