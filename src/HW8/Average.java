package HW8;

public class Average {
      public static void calculateAndPrintAverage(int num1, int num2, int num3) {
        int average = (num1 + num2 + num3) / 3;
        System.out.println("Среднее значение: " + average);
    }

    public static void main(String[] args) {
        calculateAndPrintAverage(10, 20, 30);
    }
}

