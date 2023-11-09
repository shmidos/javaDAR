public class HW_6_additional_tasks {
    public static void main(String[] args) {
        // 1. Напишите программу, которая ищет заданный элемент в двумерном массиве и выводит его координаты (строка и столбец).
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int targetElement = 5;

        int rows = array.length;
        int cols = array[0].length;

        boolean found = false;
        int targetRow = -1;
        int targetCol = -1;

        // Поиск элемента в массиве
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] == targetElement) {
                    found = true;
                    targetRow = i;
                    targetCol = j;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("Координаты: Строка " + targetRow + ", Столбец " + targetCol);

        }
        // 2. Напишите программу, которая находит среднее значение в каждой строке двумерного массива и выводит его.
        int[][] array1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        int rows1 = array.length;
        int cols1 = array[0].length;

        for (int i = 0; i < rows1; i++) {
            int sum = 0;

            for (int j = 0; j < cols1; j++) {
                sum += array1[i][j];
            }

            double average = (double) sum / cols1;

            System.out.println("Среднее значение в строке " + i + ": " + average);
        }


        // 3. Напишите программу, которая транспонирует заданную матрицу (меняет строки на столбцы и наоборот).
        int[][] array3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int rows3 = array3.length;
        int cols3 = array3[0].length;

        int[][] transposedMatrix = new int[cols3][rows3];

        for (int i = 0; i < rows3; i++) {
            for (int j = 0; j < cols3; j++) {
                transposedMatrix[j][i] = array3[i][j];
            }
        }

        System.out.println("Транспонированная матрица:");
        for (int i = 0; i < cols3; i++) {
            for (int j = 0; j < rows3; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }

        //4. Напишите программу, которая находит максимальный и минимальный элементы в двумерном массиве.
        int[][] array4 = {{3, 7, 2}, {8, 1, 5}, {4, 6, 9}};

        int rows4 = array4.length;
        int cols4 = array4[0].length;

        int minElement = array4[0][0];
        int maxElement = array4[0][0];

        for (int i = 0; i < rows4; i++) {
            for (int j = 0; j < cols4; j++) {
                if (array4[i][j] < minElement) {
                    minElement = array4[i][j];
                }

                if (array4[i][j] > maxElement) {
                    maxElement = array4[i][j];
                }
            }
        }

        System.out.println("Минимальный элемент: " + minElement);
        System.out.println("Максимальный элемент: " + maxElement);

        // 5.Напишите программу, которая сортирует строки в двумерном массиве в порядке возрастания.
        int[][] array5 = {{5, 2, 8, 1}, {7, 4, 6, 3}, {9, 12, 11, 10}};

        int rows5 = array5.length;
        int cols5 = array5[0].length;

        for (int i = 0; i < rows5; i++) {
            for (int j = 0; j < cols5 - 1; j++) {
                for (int k = 0; k < cols5 - j - 1; k++) {
                    if (array5[i][k] > array5[i][k + 1]) {
                        int temp = array5[i][k];
                        array5[i][k] = array5[i][k + 1];
                        array5[i][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Отсортированный массив:");
        for (int i = 0; i < rows5; i++) {
            for (int j = 0; j < cols5; j++) {
                System.out.print(array5[i][j] + " ");
            }
            System.out.println();
        }

        //6 Напишите программу, которая проверяет, является ли заданная матрица симметричной (относительно главной диагонали).
        int[][] array6 = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };

        int rows6 = array6.length;
        int cols6 = array6[0].length;

        boolean isSymmetric = true;

        for (int i = 0; i < rows6; i++) {
            for (int j = 0; j < cols6; j++) {
                if (array6[i][j] != array6[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }

        if (isSymmetric) {
            System.out.println("Матрица симметрична относительно главной диагонали.");
        } else {
            System.out.println("Матрица не симметрична относительно главной диагонали.");
        }

        //7 Напишите программу, которая поворачивает матрицу на 90 градусов по часовой стрелке.
        int[][] array7 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int rows7 = array7.length;
        int cols7 = array7[0].length;

        int[][] rotatedMatrix = new int[cols7][rows7];

        for (int i = 0; i < rows7; i++) {
            for (int j = 0; j < cols7; j++) {
                rotatedMatrix[j][rows7 - 1 - i] = array7[i][j];
            }
        }

        System.out.println("Матрица, повернутая на 90 градусов по часовой стрелке:");
        for (int i = 0; i < cols7; i++) {
            for (int j = 0; j < rows7; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


