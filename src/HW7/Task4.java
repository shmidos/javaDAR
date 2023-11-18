package HW7;
public class Task4 {

    public static void main(String[] args) {
        String inputString = "Java is good to learn Object Oriented programming.";
        int wordCount = countWords(inputString);

        System.out.println("Количество слов в строке: " + wordCount);
    }

    public static int countWords(String input) {
        String[] words = input.split("\\s+");

        return words.length;
    }
}
