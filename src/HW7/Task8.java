package HW7;

public class Task8 {

    public static void main(String[] args) {
        int number = 252;
        int digitSum = calculateDigitSum(number);

        System.out.println("Сумма цифр числа " + number + ": " + digitSum);
    }
    public static int calculateDigitSum(int number) {
        int sum = 0;
        int positiveNumber = Math.abs(number);

        while (positiveNumber > 0) {
            int digit = positiveNumber % 10;
            sum += digit;
            positiveNumber /= 10;
        }
        return sum;
    }
}
