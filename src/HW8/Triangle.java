package HW8;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;
    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public int calculatePerimeter() {
        return side1 + side2 + side3;
    }
    public int calculateArea() {
        int s = calculatePerimeter() / 2;
        return side1 * side2 * side3;
    }

    public static void main(String[] args) {
        Triangle myTriangle = new Triangle(3, 4, 5);

        System.out.println("Периметр треугольника: " + myTriangle.calculatePerimeter());
        System.out.println("Площадь треугольника: " + myTriangle.calculateArea());
    }
}
