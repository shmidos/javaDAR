package HW8;

public class Student {
    String name;
    String surname;
    String address;
    int id;
    public Student(String name, String surname, String address, int id) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.id = id;
    }

    public String toString() {
        return "Студент: " + name + " " + surname + " Адрес: " + address + " ID: " + id;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Алиса", "Смит", "Коктем-2", 24);
        Student student2 = new Student("Азамат", "Мусагалиев", "Коктем-1", 25);
        Student student3 = new Student("Кристина", "Орбакайте", "Коктем-3", 26);

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}

