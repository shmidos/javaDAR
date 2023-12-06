package HW9;
public class Outer {
    private int number;
    public Outer(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public class Inner {
        public void incrementAndPrint() {
            number++;
            System.out.println("Новое значение number: " + number);
        }
    }
    public static void main(String[] args) {
        Outer outer = new Outer(5);
        Inner inner = outer.new Inner();
        inner.incrementAndPrint();
    }
}
