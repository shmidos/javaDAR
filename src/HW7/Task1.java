package HW7;
public class Task1 {

    public static void main(String[] args) {
        int number1 = 25;
        int number2 = 37;
        int number3 = 29;

        int minimumNumber = findMinimum(number1, number2, number3);

        System.out.println("Наименьшее число: " + minimumNumber);
    }

    public static int findMinimum(int a, int b, int c) {
        int min = a;

        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        return min;
    }
}
