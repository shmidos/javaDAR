package HW7;

public class Task7 {

    public static void main(String[] args) {
        int numberOfSides = 5;
        double sideLength = 6;

        double area = calculatePentagonArea(numberOfSides, sideLength);

        System.out.println("Площадь пятиугольника: " + area);
    }
    public static double calculatePentagonArea(int sides, double sideLength) {
        if (sides == 5) {
            return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(sideLength, 2);
        } else {
            System.out.println("Пятиугольник должен иметь 5 сторон.");
            return -1;
        }
    }
}
