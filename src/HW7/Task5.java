package HW7;
public class Task5 {

    public static void main(String[] args) {
        int number = 1254212;
        int digitCount = countDigits(number, 2);

        System.out.println("Количество цифр 2 в числе: " + digitCount);
    }

    public static int countDigits(int number, int targetDigit) {
        int count = 0;
        String numberStr = Integer.toString(number);
        for (int i = 0; i < numberStr.length(); i++) {
            char currentChar = numberStr.charAt(i);

            if (Character.getNumericValue(currentChar) == targetDigit) {
                count++;
            }
        }

        return count;
    }
}
