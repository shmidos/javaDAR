package HW8;

public class Rectangle {
    private int length;
    private int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int returnArea() {
        return length * width;
    }
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 9);
        System.out.println("Площадь прямоугольника 1: " + rectangle1.returnArea());

        Rectangle rectangle2 = new Rectangle(10, 14);
        System.out.println("Площадь прямоугольника 2: " + rectangle2.returnArea());
    }
}
