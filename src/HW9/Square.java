package HW9;

public class Square {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Введите длину стороны квадрата (a): ");
        int sideLength = scanner.nextInt();

        scanner.close();

        int area = sideLength * sideLength;
        int perimeter = 4 * sideLength;
        int diagonalLength = (int) (1414 * sideLength / 1000.0);

        System.out.println("Площадь квадрата: " + area);
        System.out.println("Периметр квадрата: " + perimeter);
        System.out.println("Длина диагонали квадрата: " + diagonalLength);
    }
}
