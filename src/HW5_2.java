public class HW5_2 {
    public static void main(String[] args) {

        //Task 1
        int number = 12345;

        int reversedNumber = 0;

        do {
            int reverse = number % 10;
            reversedNumber = reversedNumber * 10 + reverse;
            number /= 10;
        } while (number != 0);

        System.out.println("Число в обратном порядке: " + reversedNumber);

        //Task 2
        int number1 = 1;

        boolean isPrime = true;
        for (int i = 2; i <= number1 / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number1 + " - простое число");
        } else {
            System.out.println(number1 + " - не простое число");
        }

        //Task 3

        //3.1
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //3.2
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //3.3
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }

            System.out.println();
        }

        // Task 4
        int a = 5;
        int b = 20;

        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }

        System.out.println("Сумма натуральных чисел от " + a + " до " + b + ": " + sum);

        // Task 5

        int salary = 500000;
        int bonus = 0;
        char employeeClass = 'A';

        switch (employeeClass) {
            case 'A':
                bonus = (int) (0.5 * salary);
                break;
            case 'B':
                bonus = (int) (0.25 * salary);
                break;
            case 'C':
                bonus = 0;
                break;

        }

        int totalSalary = salary + bonus;
        System.out.println("Зарплата с премией: " + totalSalary);

        // Task 6


    }
}
