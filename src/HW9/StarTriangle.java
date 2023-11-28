package HW9;
public class StarTriangle {
    private int width;

    public StarTriangle(int width) {
        this.width = width;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                result.append("[*]");
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());
    }
}
