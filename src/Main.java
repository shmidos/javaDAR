public class Main {
    public static void main(String[] args) {

        // 4.1
        System.out.println("4.1 Напишите программу для умножения 10 на 5 и вывода результата в консоль.");
        int a = 10;
        int b = 5;
        System.out.println(a + "*" + b + "=" + (a * b));

        // 4.2
        System.out.println("4.2 Напишите программу для деления 20 на 2.5 и вывода результата в консоль.");
        double x = 2.5;
        double y = 20;
        System.out.println(y + "/" + x + "=" + (y / x));

        // 4.3
        System.out.println("4.3 Длина и ширина прямоугольника равны 15 и 9 соответственно. Напишите программу для " +
                "вычисления площади и периметра прямоугольника.");
        int l = 15;
        int w = 9;
        int s = l * w;
        System.out.println("Результат: " + l + "*" + w + "=" + s);

        // 4.4
        System.out.println("4.4 Используйте правильный оператор, чтобы увеличить значение переменной x на 1 с помощью " +
                "префиксной и постфиксной форм. Выведите на экран результат.");
        x = 10;
        System.out.println(x++);

        // 4.5
        System.out.println("4.5 Используйте оператор присваивания сложения, чтобы добавить значение 5 к переменной x.");
        int e = 10;
        System.out.println("e+=5: " + (e += 5));

        // 4.6
        System.out.println("4.6 Напишите программу для проверки равенства двух чисел 25 и 43");
        int v = 25;
        int n = 43;
        System.out.println(v + "==" + n + ": " + (v == b));

        //4.7
        System.out.println("4.7 Даны две переменные a и b, значения которых равны 10 и 5 соответственно. " +
                "Напишите программу для сложения, вычитания, умножения, деления, деления по модулю двух переменных");
        a = 10;
        b = 5;
        System.out.println("Сложение (a + b): " + (a + b));
        System.out.println("Вычитание (a - b): " + (a - b));
        System.out.println("Умножение (a * b): " + (a * b));
        System.out.println("Деление (a / b): " + (a / b));
        System.out.println("Деление по модулю (a % b):" + (a % b));

        //4.8
        System.out.println("Напишите программу для преобразования градусов Фаренгейта в градусы Цельсия.");
        double fah = 68;
        double cel = (fah - 32) * 5 / 9;
        System.out.println("(" + fah + "F -32) * 5 / 9 = " + cel);

        //4.9
        System.out.println("Напишите программу, которая прибавляет 10 к числу 451, а затем делит его на 3. " +
                "Теперь к модулю результата прибавляется 5, а затем полученное значение умножается на 5. " +
                "Выведите на экран окончательный результат.");
        int s1 = (451 + 10) / 3;
        int s2 = (s1 + 5) * 5;
        System.out.println("Результат: " + s2);

        //4.10
        System.out.println("Даны две переменные a и b, значения которых равны 65 и 80 соответственно. " +
                "Напишите программу, чтобы проверить, верны ли оба условия 'a < 50' и 'a < b'.");
        a = 65;
        b = 80;
        boolean a1 = (a < 50) && (a < b);
        System.out.println(a1);
        //123
    }
}