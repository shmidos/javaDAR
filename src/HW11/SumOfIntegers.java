package HW11;
import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку с целыми числами: ");
        String input = scanner.nextLine();

        try {
            int sum = calculateSum(input);
            System.out.println("Сумма целых чисел в строке равна " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }
    }

    private static int calculateSum(String input) {
        Scanner tokenScanner = new Scanner(input);
        int sum = 0;

        while (tokenScanner.hasNext()) {
            if (tokenScanner.hasNextInt()) {
                sum += tokenScanner.nextInt();
            } else {
                tokenScanner.next();
            }
        }

        return sum;
    }
}
