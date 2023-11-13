package HW7;

public class Task6 {

    public static void main(String[] args) {
        String inputString = "AIEEE";
        boolean allVowels = areAllVowels(inputString);

        if (allVowels) {
            System.out.println("Все символы в строке являются гласными.");
        } else {
            System.out.println("Не все символы в строке являются гласными.");
        }
    }

    public static boolean areAllVowels(String input) {
        String lowercaseInput = input.toLowerCase();
        for (int i = 0; i < lowercaseInput.length(); i++) {
            char currentChar = lowercaseInput.charAt(i);

            if (!isVowel(currentChar)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
