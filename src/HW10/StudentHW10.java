package HW10;
import java.util.ArrayList;

public class StudentHW10 {
    private int grade;
    public StudentHW10(int grade) {
        this.grade = grade;
    }
    public int getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        StudentHW10 student1 = new StudentHW10(75);
        StudentHW10 student2 = new StudentHW10(88);
        StudentHW10 student3 = new StudentHW10(95);

        ArrayList<StudentHW10> studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        System.out.println("Оценки студентов:");
        for (StudentHW10 student : studentList) {
            System.out.println("Оценка студента: " + student.getGrade());
        }
    }
}
