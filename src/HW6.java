import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class HW6 {
    public static void main(String[] args) {

        //Task 1
        int[] numbers = {1, 3, 4, 1, 5, 5};
        double mid = 0;
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        mid = sum / numbers.length;

        System.out.println("Среднее значение: " + mid);

        //Task 2

        int[] array = {1, 3, 4, 1, 5, 5};

        for (int i = 0; i < array.length - 1; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[j] == array[i])
                    System.out.println("Дубликат: " + array[i]);

        //Task 3.1

        int[] mold = {1, 3, -6, 23, 14, 2};
        int x = 23;
        boolean found = false;
        for (int molds : mold) {
            if (molds == x) {
                found = true;
            }
        }
        if (found) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        //Task 3.2

        int[] mold2 = {1, 3, -6, 23, 14, 2};
        int y = 0;
        found = false;
        for (int molds : mold) {
            if (molds == y) {
                found = true;
            }
        }
        if (found) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        //Task 4

        int[] mold3 = {1, 3, -6, 23, 14, 2};
        int x3 = 23;

        int index = 0;

        for (int i = 0; i < mold3.length; i++) {
            if (mold3[i] == x3) {
                index = i;
            }
        }

        if (index != 0) {
            System.out.println("Индекс элемента " + x + ": " + index);
        } else {
            System.out.println(x3 + " не найден в массиве.");
        }

        //Task 4.2

        int[] mold4 = {1, 3, -6, 23, 14, 2};
        int x4 = 5;

        int index1 = 0;

        for (int i = 0; i < mold4.length; i++) {
            if (mold3[i] == x4) {
                index1 = i;
            }
        }

        if (index1 != 0) {
            System.out.println("Индекс элемента" + x4 + ": " + index1);
        } else {
            System.out.println("Элемент " + x4 + " не найден в массиве.");
        }

        //Task 5.1

        int[] numbers1 = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        int n = 3;
        int m = 8;
        for (int i = n; i <= m; i++) {
            System.out.println(numbers1[i] + " ");
        }
        System.out.println("--------------------------");
        //Task 5.2

        int[] numbers2 = {1, 3, -6, 23, 14, 2};
        int n1 = 1;
        int m1 = 3;
        for (int i = n1; i <= m1; i++) {
            System.out.println(numbers2[i] + " ");

        }

        //Task 6
        System.out.println("--------------------------");

        int[] arrays = {1, 3, -6, 23, 14, 2};

        int max = arrays[0];
        int min = arrays[0];

        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] > max) {
                max = arrays[i];
            } else if (arrays[i] < min) {
                min = arrays[i];
            }
        }

        System.out.println("Наибольший элемент: " + max);
        System.out.println("Наименьший элемент: " + min);

        System.out.println("--------------------------");

        //Task 7
        int[] arrays2 = {1, 3, -6, 23, 14, 2};

        int min1 = arrays2[0];
        int min2 = arrays2[0];

        for (int i = 0; i < arrays2.length; i++) {
            if (arrays2[i] < min1) {
                min2 = min1;
                min1 = arrays2[i];
            } else if (arrays2[i] < min2 && arrays2[i] != min1) {
                min2 = arrays2[i];
            }
        }
        System.out.println("Наименьший элемент: " + min1);
        System.out.println("Второй наименьший элемент: " + min2);

        System.out.println("--------------------------");

        //Task 8

        int[] array3 = {1, 2, 3, 0, 4, 6};

        String[] strArray = new String[array3.length];
        for (int i = 0; i < array3.length; i++) {
            strArray[i] = String.valueOf(array3[i]);
        }

        for (int i = 0; i < strArray.length - 1; i++) {
            for (int j = i + 1; j < strArray.length; j++) {
                String order1 = strArray[i] + strArray[j];
                String order2 = strArray[j] + strArray[i];
                if (order2.compareTo(order1) > 0) {
                    String temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (String str : strArray) {
            result.append(str);
        }

        System.out.println("Наибольшее число: " + result);

    }
}


