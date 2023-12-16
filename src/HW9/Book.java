package HW9;
public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public class Description {
        public void display() {
            System.out.println("Описание книги: " + title);
        }
    }

    public static void main(String[] args) {
        Book book = new Book("Java: Полное руководство (шестое издание). Роберта Шилдта");
        Description description = book.new Description();
        description.display();
    }
}
