package HW12;
public class PrintOddNumbers {
    public static void main(String[] args) {
        printOddNumbers();
    }
    private static void printOddNumbers() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}
