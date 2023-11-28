package HW9;
public class Student8_2 {
    private String name;
    private int id;
    private int yearOfStudy;

    public Student8_2(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 2020;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void increaseYearOfStudy() {
        yearOfStudy++;
    }

    public static void main(String[] args) {
        Student8_2 student1 = new Student8_2("Иванов", 1488);

        System.out.println("Имя студента: " + student1.getName());
        System.out.println("ID студента: " + student1.getId());
        System.out.println("Год обучения: " + student1.getYearOfStudy());

        student1.increaseYearOfStudy();
        System.out.println("Новый год обучения: " + student1.getYearOfStudy());
    }
}
