package HW12;
import java.util.Scanner;

public class CheckPositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        checkNumber(number);

        scanner.close();
    }

    private static void checkNumber(int num) {
        if (num > 0) {
            System.out.println("Число " + num + " является положительным.");
        } else if (num < 0) {
            System.out.println("Число " + num + " является отрицательным.");
        } else {
            System.out.println("Число " + num + " равно нулю.");
        }
    }
}
