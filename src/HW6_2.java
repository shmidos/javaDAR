public class HW6_2 {
    public static void main(String[] args) {

        //Task 9.1
        int[][] array = {{10, 20, 30}, {40, 50, 60}};

        int rows = array.length;
        int cols = array[0].length;

        int[][] modifiedArray = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                modifiedArray[j][i] = array[i][j];
            }
        }

        for (int i = 0; i < modifiedArray.length; i++) {
            for (int j = 0; j < modifiedArray[i].length; j++) {
                System.out.print(modifiedArray[i][j] + " ");
            }
            System.out.println();
        }

        //Task 9.2
        int[][] array1 = {{4, 2, 1}, {2, 7, 2}};
        int rows1 = array.length;
        int cols1 = array[0].length;
        int[][] modifiedArray1 = new int[cols][rows];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                modifiedArray1[j][i] = array1[i][j];
            }
        }

        for (int i = 0; i < modifiedArray1.length; i++) {
            for (int j = 0; j < modifiedArray1[i].length; j++) {
                System.out.print(modifiedArray1[i][j] + " ");
            }
            System.out.println();
        }

        //Task 10
        int[][] array3 = {{10, 20, 30}, {40, 50, 60}};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        System.out.println("Сумма всех значений в массиве: " + sum);

        //Task 11.1

        int[][] array4 = {{10, 20, 30}, {40, 50, 60}};
        boolean isSquare = true;

        int rows4 = array4.length;
        int cols4 = array4[0].length;

        for (int i = 0; i < rows4; i++) {
            if (array4[i].length != cols4) {
                isSquare = false;
                break;
            }
        }

        if (isSquare) {
            System.out.println("массив является квадратным.");
        } else {
            System.out.println("массив не является квадратным.");
        }

        //Task 11.2

        int[][] array5 = {{10, 20}, {40, 50}};
        boolean isSquare1 = true;

        int rows5 = array5.length;
        int cols5 = array5[0].length;

        for (int i = 0; i < rows5; i++) {
            if (array5[i].length != cols5) {
                isSquare = false;
                break;
            }
        }

        if (isSquare1) {
            System.out.println("массив является квадратным.");
        } else {
            System.out.println("массив не является квадратным.");
        }

        //Task 12
        int n = 5;
        int[][] multiplicationTable = new int[n][n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                multiplicationTable[i - 1][j - 1] = i * j;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(multiplicationTable[i][j] + "\t");
            }
            System.out.println();
        }

        //Task 12
        int[][] numbers = {{10, 20, 30}, {40, 50, 60}};

        int minVal = numbers[0][0];
        int maxVal = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] < minVal) {
                    minVal = numbers[i][j];
                }
                if (numbers[i][j] > maxVal) {
                    maxVal = numbers[i][j];
                }
            }
        }

        System.out.println("Минимальное значение: " + minVal);
        System.out.println("Максимальное значение: " + maxVal);
    }
}


