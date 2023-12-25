package HW12;
public class SwapVariables {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("До замены: a = " + a + ", b = " + b);

        int[] result = swapWithoutTemp(a, b);

        a = result[0];
        b = result[1];

        System.out.println("После замены: a = " + a + ", b = " + b);
    }
    private static int[] swapWithoutTemp(int a, int b) {


        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        return new int[]{a, b};
    }
}

