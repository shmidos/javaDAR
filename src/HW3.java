public class HW3 {
    public static void main(String[] args) {
        String flowersName = "Roses";
        int flowersNumber = 101;
        System.out.println(flowersName+" "+flowersNumber);

        int a = 15;
        int b = 10;
        System.out.println(a+b);
        System.out.println(a+"+"+b+"=" +(a+b));

        int c = a+b;
        System.out.println(a+ "+"+b+"="+c);

        a=55; b=65; c=75;
        System.out.println(a+b+c);
        System.out.println(a +"+" + b +"+" + c + "=" + (a+b+c));

        int t,y,u,i;
        t = y =u = i = 100;
        System.out.println(t+y+u+i);
        System.out.println(t +"+" + y +"+" + u + "+" + i + "=" + (t+y+u+i));

        double w;
        w=15;
        System.out.println(w);

        final double PI = 3.14159;
        System.out.println("Число PI = " + PI);
        final double GrAc= 9.8;
        // GrAc = gravitational acceleration
        System.out.println("Ускорение свободного падения = " + GrAc);
        final String myHome = "Алматы";
        System.out.println("Мой родной город " + myHome);

        byte byteVar = 123;
        short shortVar = 12345;
        int intVar = 123456789;
        long longVar = 324324234345546546L;
        double doubleVar = 3.14159;
        float floatVar = 2.71828f;
        boolean booleanVar = true;
        char charVar = 'A';
        String stringVar = "Hello, World!";
        System.out.println(byteVar);
        System.out.println(shortVar);
        System.out.println(intVar);
        System.out.println(longVar);
        System.out.println(doubleVar);
        System.out.println(floatVar);
        System.out.println(booleanVar);
        System.out.println(charVar);
        System.out.println(stringVar);
    }
}