package HW7;
public class Task3 {

    public static void main(String[] args) {
        String inputString = "DarTech123";
        int vowelCount = countVowels(inputString);

        System.out.println("Количество гласных букв: " + vowelCount);
    }

    public static int countVowels(String input) {
        int count = 0;
        String lowercaseInput = input.toLowerCase();
        for (int i = 0; i < lowercaseInput.length(); i++) {
            char currentChar = lowercaseInput.charAt(i);

            if (isVowel(currentChar)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
