package HW12;
public class ArraySum {

    public static void main(String[] args) {
        int[] array1 = {10, 20, 30};
        int[] array2 = {40, 50, 60};

        int[] sumArray = sumArrays(array1, array2);

        System.out.println("Сумма массива:");
        for (int value : sumArray) {
            System.out.print(value + " ");
        }
    }

    public static int[] sumArrays(int[] array1, int[] array2) {

        int length = array1.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = array1[i] + array2[i];
        }

        return result;
    }
}
