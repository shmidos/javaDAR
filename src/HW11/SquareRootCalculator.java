package HW11;
import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
             System.out.print("Введите вещественное число: ");
            double number = scanner.nextDouble();
            if (number < 0) {
                throw new IllegalArgumentException("Введено отрицательное число. Квадратный корень не определен.");
            }
            double squareRoot = Math.sqrt(number);

            System.out.println("Квадратный корень числа " + number + " равен: " + squareRoot);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка ввода. Введите корректное вещественное число.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
                scanner.close();
        }
    }
}
