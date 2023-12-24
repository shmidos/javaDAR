package HW12;
import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");

        int num3 = scanner.nextInt();
        int maxNumber = findLargestNumber(num1, num2, num3);
        System.out.println("Наибольшее число: " + maxNumber);
        scanner.close();
    }
    private static int findLargestNumber(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }
}
