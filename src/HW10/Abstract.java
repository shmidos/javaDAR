package HW10;
public abstract class Abstract {
    abstract void abstractMethod();

    void concreteMethod() {
        System.out.println("Это метод в абстрактном классе..");
    }
    void useAbstractMethod() {
        abstractMethod();
        System.out.println("Использован абстрактный метод.");
    }

    public static void main(String[] args) {
        Concrete concrete = new Concrete();
        concrete.useAbstractMethod();
        concrete.concreteMethod();
    }
}
class Concrete extends Abstract {
    void abstractMethod() {
        System.out.println("Реализация в классе Concrete.");
    }
}
