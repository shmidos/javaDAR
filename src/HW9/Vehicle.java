package HW9;
public class Vehicle {
    private int speed;
    public Vehicle() {
        this.speed = 0;
    }
    public int getSpeed() {
        return speed;
    }
    public class Engine implements Runnable {
        @Override
        public void run() {
            speed += 60;
            System.out.println("Скорость увеличена. Новая скорость: " + speed);
        }
    }
    public void startEngine() {
        Engine engine = new Engine();
        Thread engineThread = new Thread(engine);
        engineThread.start();
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println("Начальная скорость: " + vehicle.getSpeed());
        vehicle.startEngine();
    }
}
