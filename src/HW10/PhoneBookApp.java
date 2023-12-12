package HW10;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookApp {

    private static Map<String, String> phoneBook = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    searchByName();
                    break;
                case 5:
                    exitApp();
                    break;
                default:
                    System.out.println("Неверный выбор. Введи число от 1 до 5.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("1. Добавить контакт");
        System.out.println("2. Просмотреть контакты");
        System.out.println("3. Обновить контакт");
        System.out.println("4. Поиск по имени");
        System.out.println("5. Выйти");
        System.out.print("Выбери действие (1-5): ");
    }

    private static int getUserChoice() {
        return scanner.nextInt();
    }

    private static void addContact() {
        System.out.print("Имя контакта: ");
        String name = scanner.next();

        System.out.print("Номер телефона: ");
        String phoneNumber = scanner.next();

        phoneBook.put(name, phoneNumber);
        System.out.println("Контакт добавлен!");
    }

    private static void viewContacts() {
        System.out.println("Список контактов:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Имя: " + entry.getKey() + ", Номер: " + entry.getValue());
        }
    }

    private static void updateContact() {
        System.out.print("Введите имя для обновления: ");
        String name = scanner.next();

        if (phoneBook.containsKey(name)) {
            System.out.print("Новый номер телефона: ");
            String newPhoneNumber = scanner.next();

            phoneBook.put(name, newPhoneNumber);
            System.out.println("Контакт обновлен!");
        } else {
            System.out.println("Контакт не найден.");
        }
    }

    private static void searchByName() {
        System.out.print("Введите имя для поиска: ");
        String searchName = scanner.next();

        if (phoneBook.containsKey(searchName)) {
            System.out.println("Найден контакт: " + searchName + " - " + phoneBook.get(searchName));
        } else {
            System.out.println("Контакт не найден.");
        }
    }

    private static void exitApp() {
        System.out.println("Выход из приложения. До свидания!");
        System.exit(0);
    }
}
