public class HW5
{ public static void main(String[] args) {
/* 5.1 Напишите программу, чтобы проверить значения длины и ширины прямоугольника
        и определить, является ли он квадратным или нет*/
    int length = 15;
    int width = 10;

    if (length == width) {
        System.out.println("Прямоугольник является квадратным.");
    } else {
        System.out.println("Прямоугольник не является квадратным.");
    }

        /*5.2 Магазин предоставит скидку в 10%, если стоимость купленного товара будет больше 5000.
        Если стоимость товара ниже 5000, то стоимость остается без изменений. Вычислите и выведите итоговую
        стоимость покупки для пользователя.*/

    double cost = 5555;
    if (cost > 5000) {
        double discount = cost * 0.10;
        cost -= discount;
        System.out.println("Скидка в размере 10% предоставлена.");
    } else {
        System.out.println("Скидка не предоставлена");
    }
    System.out.println("Итоговая стоимость покупки: " + cost);

        /* 5.3 В университете существуют следующие правила для системы оценок:
        Ниже 25 - F
        От 25 до 45 - E
        От 45 до 50 - D
        От 50 до 60 - C
        От 60 до 80 - B
        Выше 80 - A
        Создайте переменную grade и напечатайте в консоль соответствующую оценку в зависимости от значения переменной.*/

    int grade = 80;
    if (grade < 25) {
        System.out.println("Оценка: F");
    } else if (grade >= 25 && grade < 45) {
        System.out.println("Оценка: E");
    } else if (grade >= 45 && grade < 50) {
        System.out.println("Оценка: D");
    } else if (grade >= 50 && grade < 60) {
        System.out.println("Оценка C");
    } else if (grade >= 60 && grade < 80) {
        System.out.println("Оценка: B");
    } else if (grade >= 80) {
        System.out.println("Оценка: A");
    }

    //5.4 Дано целое положительное число. Напишите программу, которая выводит это число в обратном порядке.
    // Например, если дано число 12345, то вывод будет следующим: 54321
    int number = 12345;

    int reversedNumber = 0;

    do {
        int reverse = number % 10;
        reversedNumber = reversedNumber * 10 + reverse;
        number /= 10;
    } while (number != 0);

    System.out.println("Число в обратном порядке: " + reversedNumber);


    System.out.println("~~~Дополнительные задания~~~");

    //1.Напишите программу, которая проверяет, является ли заданное целое число четным или нечетным, и выводит соответствующее сообщение.
    int x1 = 3;
    if (x1 % 2 == 0) {
        System.out.println(x1 + " четное.");
    } else {
        System.out.println(x1 + " нечетное.");
    }

    //2.Напишите программу, которая сравнивает два целых числа и определяет, какое из них больше.
    int q1 = 9;
    int q2 = 8;
    if (q1 > q2) {
        System.out.println("Число " + q1 + " больше");
    } else {
        System.out.println("Число " + q2 + " больше");
    }

    //3.Напишите программу, которая определяет, является ли заданный год високосным.
    int year = 2023;
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        System.out.println(year + " год - високосный.");
    } else {
        System.out.println(year + " год - не високосный.");
    }

    //4.Напишите программу, которая принимает номер дня недели (1 - Понедельник, 2 - Вторник и так далее) и выводит название дня недели.

    int dayNumber = 2;
    if (dayNumber == 1) {
        System.out.println("Сегодня понедельник");
    } else if (dayNumber == 2) {
        System.out.println("Сегодня вторник");
    } else if (dayNumber == 3) {
        System.out.println("Сегодня среда");
    }

    //5.Напишите программу, которая принимает координаты точки (x, y) и определяет, в каком квадранте координатной плоскости она находится.

    int x2 = 7;
    int y2 = 5;
    if (x2 > 0 && y2 > 0) {
        System.out.println("Точка находится в 1 квадранте.");
    } else if (x2 < 0 && y2 > 0) {
        System.out.println("Точка находится во 2 квадранте.");
    } else if (x2 < 0 && y2 < 0) {
        System.out.println("Точка находится в 3 квадранте.");
    } else if (x2 > 0 && y2 < 0) {
        System.out.println("Точка находится в 4 квадранте.");
    }

//        6. Напишите программу, которая принимает длины трех сторон треугольника и определяет его тип
//        (равносторонний, равнобедренный или разносторонний).

    double side1 = 15;
    double side2 = 10;
    double side3 = 20;

    if (side1 == side2 && side2 == side3) {
        System.out.println("Треугольник равносторонний");
    } else if (side1 != side2 && side2 != side3 && side1 != side3) {
        System.out.println("Треугольник разносторонний");
    } else {
        System.out.println("Треугольник равнобедренный");
    }
}
}
