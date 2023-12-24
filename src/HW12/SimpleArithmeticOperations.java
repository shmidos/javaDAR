package HW12;
public class SimpleArithmeticOperations {
    public static void main(String[] args) {
        performArithmeticOperations(10, 3);
    }
    private static void performArithmeticOperations(int a, int b) {

        int sum = a + b;
        System.out.println("Сумма: " + sum);

        int multiplication = a * b;
        System.out.println("Умножение: " + multiplication);

        int subtraction = a - b;
        System.out.println("Вычитание: " + subtraction);

        double division = (double) a / b;
        System.out.println("Деление: " + division);

        int remainder = a % b;
        System.out.println("Остаток от деления: " + remainder);
    }
}
