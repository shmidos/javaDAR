package HW7;
public class Task2 {

    public static void main(String[] args) {
        int number1 = 25;
        int number2 = 45;
        int number3 = 65;

        double average = calculateAverage(number1, number2, number3);

        System.out.println("Среднее значение: " + average);
    }

    public static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
}
