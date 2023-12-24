package HW12;
import java.util.Scanner;

public class ReplaceCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        String resultString = replaceCharacters(inputString);

        System.out.println("Результат замены: " + resultString);

        scanner.close();
    }

    private static String replaceCharacters(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == 'a') {
                result.append('b');
            } else {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}

