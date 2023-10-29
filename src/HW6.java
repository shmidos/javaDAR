import javax.sound.midi.Soundbank;

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
            System.out.println("Индекс элемента" + x +": " + index);
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
            System.out.println("Индекс элемента" + x4 +": " + index1);
        } else {
            System.out.println("Элемент "+ x4 + " не найден в массиве.");
        }

        //Task 5

        int[] numbers1 = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        int n = 3;
        int m = 8;
        for(int numbers2 : numbers1)
            for(int i = n; )

    }
}


