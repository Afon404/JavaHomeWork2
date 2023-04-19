//package org.example;
//
//public class Seminar2 {
//    import java.io.*;
//import java.time.LocalTime;
//import java.util.List;
//import java.util.Scanner;
//import java.util.logging.FileHandler;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.util.logging.SimpleFormatter;
//
//    public class Main {
//        public static void main(String[] args) {
////        char c1 = 'a';
////        char c2 = 'b';
////        int n = 10;
////        System.out.println(ex0(c1, c2, n));
////        System.out.println(ex2_1("Рђ СЂРѕР·Р° СѓРїР°Р»Р° РЅР° Р»Р°РїСѓ РђР·РѕСЂР°"));
//            ex3("Test", 20);
//        }
//
//        static void ex3(String s, int n){
//        /*
//        РќР°РїРёС€РёС‚Рµ РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ СЃРѕСЃС‚Р°РІРёС‚ СЃС‚СЂРѕРєСѓ, СЃРѕСЃС‚РѕСЏС‰СѓСЋ РёР· 100 РїРѕРІС‚РѕСЂРµРЅРёР№ СЃР»РѕРІР° TEST Рё РјРµС‚РѕРґ,
//        РєРѕС‚РѕСЂС‹Р№ Р·Р°РїРёС€РµС‚ СЌС‚Сѓ СЃС‚СЂРѕРєСѓ РІ РїСЂРѕСЃС‚РѕР№ С‚РµРєСЃС‚РѕРІС‹Р№ С„Р°Р№Р», РѕР±СЂР°Р±РѕС‚Р°Р№С‚Рµ РёСЃРєР»СЋС‡РµРЅРёСЏ.
//         */
//            String s1 = repeatString(s, n);
//            saveToFile(s1);
//        }
//
//        static void saveToFile(String s) {
//            Logger logger = Logger.getAnonymousLogger();
//            FileHandler fileHandler = null;
//            try {
//                fileHandler = new FileHandler("log.txt");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            SimpleFormatter formatter = new SimpleFormatter();
//            fileHandler.setFormatter(formatter);
//            logger.addHandler(fileHandler);
//            String path = "g/g/g/g/gtest.txt";
//            try (FileWriter fileWriter = new FileWriter(path, false)) {
//                fileWriter.append(s);
//                fileWriter.flush();
//            } catch (Exception e) {
//                e.printStackTrace();
//                logger.log(Level.WARNING, e.getMessage());
//            }
//            System.out.println("РўРµСЃС‚");
//            fileHandler.close();
//        }
//
//        static String repeatString(String s, int n){
//            StringBuilder stringBuilder = new StringBuilder();
//            for (int i = 0; i < n; i++) {
//                stringBuilder.append(s);
////            stringBuilder.append("\n");
//            }
//            return stringBuilder.toString();
//        }
//        static boolean ex2_1(String s){
//            s = s.replace(" ", "");
//            s = s.toLowerCase();
//            char[] arr = s.toCharArray();
//            for (int i = 0, j = arr.length-1; i < arr.length / 2; i++, j--) {
//                if (arr[i] != arr[j]){
//                    return false;
//                }
//            }
//            return true;
//        }
//        static boolean ex2(String s){
//        /*
//        РќР°РїРёС€РёС‚Рµ РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ РїСЂРёРЅРёРјР°РµС‚ РЅР° РІС…РѕРґ СЃС‚СЂРѕРєСѓ (String) Рё РѕРїСЂРµРґРµР»СЏРµС‚ СЏРІР»СЏРµС‚СЃСЏ Р»Рё СЃС‚СЂРѕРєР° РїР°Р»РёРЅРґСЂРѕРјРѕРј
//         (РІРѕР·РІСЂР°С‰Р°РµС‚ boolean Р·РЅР°С‡РµРЅРёРµ).
//
//        РџРѕР»РёРЅРґСЂРѕРј - РЎР»РѕРІРѕ РёР»Рё С„СЂР°Р·Р°, РєРѕС‚РѕСЂС‹Рµ РѕРґРёРЅР°РєРѕРІРѕ С‡РёС‚Р°СЋС‚СЃСЏ СЃР»РµРІР° РЅР°РїСЂР°РІРѕ Рё СЃРїСЂР°РІР° РЅР°Р»РµРІРѕ.
//         */
//            s = s.replace(" ", "");
//            StringBuilder stringBuilder1 = new StringBuilder(s);
//            stringBuilder1.reverse();
//            return stringBuilder1.toString().equalsIgnoreCase(s);
//        }
//        static String ex1(String s){
//        /*
//        РќР°РїРёС€РёС‚Рµ РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ СЃР¶РёРјР°РµС‚ СЃС‚СЂРѕРєСѓ.
//        РџСЂРёРјРµСЂ: РІС…РѕРґ aaaabbbcddaa.
//        Р РµР·СѓР»СЊС‚Р°С‚: a4b3cd2a2
//         */
//            StringBuilder stringBuilder = new StringBuilder();
//            char[] arr = s.toCharArray();
//            int count = 1;
//            for (int i = 1; i < arr.length; i++) {
//                if (arr[i] == arr[i-1]){
//                    count++;
//                } else {
//                    stringBuilder.append(arr[i-1]);
//                    if (count > 1){
//                        stringBuilder.append(count);
//                        count = 1;
//                    }
//                }
//            }
//            stringBuilder.append(arr[arr.length-1]);
//            if (count > 1){
//                stringBuilder.append(count);
//            }
//            return stringBuilder.toString();
//        }
//        static String ex0(char c1, char c2, int n){
//        /*
//        Р”Р°РЅРѕ С‡РµС‚РЅРѕРµ С‡РёСЃР»Рѕ N (>0) Рё СЃРёРјРІРѕР»С‹ c1 Рё c2.
//        РќР°РїРёСЃР°С‚СЊ РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ РІРµСЂРЅРµС‚ СЃС‚СЂРѕРєСѓ РґР»РёРЅС‹ N, РєРѕС‚РѕСЂР°СЏ СЃРѕСЃС‚РѕРёС‚ РёР· С‡РµСЂРµРґСѓСЋС‰РёС…СЃСЏ СЃРёРјРІРѕР»РѕРІ c1 Рё c2, РЅР°С‡РёРЅР°СЏ СЃ c1.
//        РћС‚РІРµС‚: c1c2c1вЂ¦c2 (РІСЃРµРіРѕ N СЃРёРјРІРѕР»РѕРІ)
//         */
//            if (n % 2 != 0){
//                return "Р’С‹ РІРІРµР»Рё РЅРµС‡РµС‚РЅРѕРµ С‡РёСЃР»Рѕ";
//            }
//            StringBuilder stringBuilder = new StringBuilder();
//            for (int i = 0; i < n / 2; i++) {
//                stringBuilder.append(c1);
//                stringBuilder.append(c2);
//            }
//            return stringBuilder.toString();
//        }
//    }
//
//}
//
//
//
/////////////////////////////////////
//
//
//
//    Напишите программу на Java, которая напечатает «Hello» на экране,
//        а затем напечатайте свое имя в отдельной строке.
//
//        import java.util.Scanner;
//public class Main {
//    public static void main(String[] args)
//    {
//        Scanner imput= new Scanner(System.in);
//        System.out.print("Imput you first name: ");
//        String fname = input.next();
//        System.out.println("Input your last name: ");
//        String lname = input.next();
//        System.out.println();
//        System.out.println("Hello \n" + fname + " " + lname);
//    }
//}
//
//
/////////////////////////////////////////////////////////
//
//    Напишите программу на Java для вывода суммы двух чисел.
//
//
//        import java.util.Scanner;
//public class Main {
//    public static void main(String[] args)
//    {
//        Scaner input = new Scanner (System.in);
//        System.out.print("Input the first number: ");
//        int num1 = input.nextInt();
//        System.out.print("Imput the second number: ");
//        int num2 = input.nextInt();
//        int sum = num1 + num2;
//        System.out.print();
//        System.out.println("Sum: " + sum);
//    }
//}
//
////////////////////////////////////////////////
//
//    Напишите программу на Java, чтобы разделить два числа и напечатать на экране.
//
//        import java.util.Scanner;
//public class Main {
//    public static void main(String[] args)
//    {
//        Scanner input = new Scanner(Syste.in);
//        System.out.print("Input the first number: ");
//        int a = imput.nextIn();
//        System.out.print("Input the second number: ");
//        int b = input.nextInt();
//        int d = (a/b);
//        System.out.println();
//        System.out.println("The division of a and b is: " + d);
//    }
//}
//
//    ///////////////////////////////////////////////
//    Напишите Java-программу для печати результата следующих операций.
//
//public class Main {
//    public static void main(String[] args){
//        int w = -5 + 8 * 6;
//        int x = (55 + 9) % 9;
//        int y = 20 + (-3 * 5 / 8);
//        int  z = 5 + 15 / 3 * 2 - 8 % 3;
//
//        System.out.print(w + "\n" + x + "\n" + y + "\n" + z);
//
//    }
//}
//
//////////////////////////////////////////////////////
//
//    Напишите программу Java,
//        которая принимает два числа в качестве входных данных
//        и отображает произведение двух чисел.
//
//
//        inport java.util.Scanner;
//
//public class  Main {
//
//    public static void main(Strint[] args){
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input first number: ");
//        int num1 = imput.nextIn();
//        System.out.print("Input second mumber: “);
//        int num2 = input.nextIn();
//
//        System.out.println(num1 + “ x “ num2 + “ = “ +  num1 + num2);
//
//    }
//}
//
////////////////////////////////////////////
// 5. Напишите Java-программу для печати суммы (сложения),
//         умножения, вычитания, деления и остатка двух чисел.
//
//         inport java.util.Scanner;
//public class Main {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        Sustem.out.println(“Input the first number: “);
//        int n1 = input.nextInt();
//        System.out.println(“Input the second number: “);
//        int n2 = input.nextInt();
//        int sum = n1 + n2;
//        int mimus = n1 - n2;
//        int multiply = n1 * n2;
//        int subtract = n1 + n2;
//        int divaide = n1 / n2;
//        int rnums = n1 % n2;
//        System.out.printf(“Sum = %d/nMinus = %d/nMultiply = %d/nSubtract %d/nDivid %d/nRemaindeerOf2Numbers = %d/n “, sum, minus, multiply, subtract, divide, rnums);
//    }
//}
//
////////////////////////////////////////////
//
//    Напишите программу на Java,
//    которая принимает число в качестве входных данных
//        и печатает свою таблицу умножения до 10.
//
//        package org.example;
//        import java.util.Scanner;
//public class Prueba1 {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Input the Number: ");
//        int n = input.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            // System.out.println(n + " * " + i + " = " + (n * i));
//            int z = n * i;
//            System.out.printf("Result: %d * %d =  %d\n", n, i,z);
//        }
//    }
//}
//
//
/////////////////////////////////////////////////////////////
//
//    Напишите программу на Java для отображения следующего шаблона.
//
//public static void main(String[] args) {
//        System.out.println(“   J    a    v     v   a     | “);
//        System.out.println(“   J   a a    v   v   a a    | “);
//        System.out.println(“J  J  aaaaa    v v   aaaaa   | “);
//        System.out.println(“ JJ  a     a    v   a     a  o “);
//        }
//        }
//
////////////////////////////////////////////////////
//
//        Напишите Java-программу для вычисления указанных выражений и вывода на печать.
//        Указанное выражение:
//        (25,5 * 3,5 - 3,5 * 3,5) / (40,5 - 4,5)
//
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
//    }
//}
//
//
/////////////////////////////////////
//
//public class Main {
//    public static void main(String[] args) {
//        double pi = 4.0 * (1 - (1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11));
//        System.out.print(pi);
//    }
//}
//
////////////////////////////////////////////////////////////////
//
//    Напишите Java-программу для печати области и периметра круга.
//
//public class Main {
//    private static final double radius = 7.5;
//    public static void main(String[] atgs){
//        double perineter = 2 * Math.PI * radius;
//        double area = Math.PI * radius * radius;
//        System.out.println(“Perimeter is =” + perimeter);
//        System.out.println(“Area is = ” + area);
//    }
//}
//
//    ///////////////////////
//    Напишите программу на Java, которая принимает три числа в качестве входных данных для вычисления и печати среднего числа.
//
//        package org.example;
//        import java.util.Scanner;
//public class Prueba1 {
//    public static void main(String[] args) {
//        double num = 0;
//        double x = 1;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input the number(n) you want to calculate the average: ");
//        int n = sc.nextInt();
//        while (x <= n) {
//            System.out.println("Input number " + "("+ (int) x +")" + ":");
//            num += sc.nextInt();
//            x += 1;
//        }
//        double avgn = (num / n);
//        System.out.println("Average:" + avgn);
//    }
//}
//
//
/////////////////////////////////////////////////////
//
//
//13. Напишите Java-программу для печати площади и периметра прямоугольника.
//        Тестовые данные:
//        Ширина = 5,5 Высота = 8,5
//
//        Ожидаемый результат
//        Площадь 5,6 * 8,5 = 47,60
//        Периметр 2 * (5,6 + 8,5) = 28,20
//
//
//public class Prueba1 {
//    public static void main(String[] args) {
//        final double width = 5.6;
//        final double height;
//        height = 8.5;
//        double perimeter = 2 * (height + width);
//
//        double area = width * height;
//
//        System.out.printf("Perimeter is 2*(%.1f + %.1f)=%.2f\n", height, width, perimeter);
//        System.out.printf("Area is %1f * %.1f = %.2f \n", width, height, area);
//
//
//    }
//}
//
/////////////////////////////////////////////////////////
//
//    Напишите Java-программу для печати американского флага на экране.
//
//
//
//public class Main {
//    public static void main(String[] args){
//        String p1 ==================================\n * * * * *  ==================================";
//        String p2 ="==============================================";
//        for (int i = 0; i < 4. i++) {
//            System.out.print(p1);
//        }
//        System.out.println("* * * * * * ==================================");
//        for (int i =0; i < 6;i++){
//            System.out.println(p2);
//        }
//    }
//}
//
////////////////////////////////////////
//
//    Напишите программу на Java для печати лица
//
//public class Main {
//    public static void main(String[] args){
//
//        String[] array = new String[5];
//        array[0] = " +\"\"\"\"\"+ ";
//        array[1] = "[| O O |]";
//        array[2] = " |  ^  |";
//        array[3] = " | ‘-’ |";
//        array[4] = " +-----+";
//        for (int i = 0; i < 5; i++){
//            System.out.println(array[i]);
//        }
//    }
//}
//
//////////////////////////////
//
//17. Напишите программу на Java, чтобы добавить два двоичных числа. Перейти к редактору
//        Входные данные:
//        Введите первое двоичное число: 10
//        Введите второе двоичное число: 11
//        Ожидаемый результат
//
//        Сумма двух двоичных чисел: 101
//
//        import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        long binary1, binary2;
//        int i = 0, remaunder = 0;
//        int[] sum = new int[20];
//        Scanner input = new Scanner(System.in);
//        System.out.print(“Input first binnary number: “);
//        binary1 = input.nextLong();
//        System.out.print(“Input second binaty number: “);
//        binary2 = input.nextLong();
//        while(binary1 != 0 || binary2 != 0); {
//            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remaunder) % 2);
//            remainder = (int)(binary1 % 10 + binary2 % 10 + renaunder) % 2);
//            binary1 = binary 1 / 10;
//            bynary2 = binary 2 / 10;
//        }
//        if (remainder != 0) {
//            sum[i++] = remainder;
//        }
//        --i;
//        System.out.print(“Sum of two binary numbers: “);
//        while(i >= 0) {
//            System.out.print(sum[i--]);
//        }
//        System.out.print(“\n”);
//    }
//}
//
//
///////////////////////////////
//
//
//    Напишите программу на Java для умножения двух двоичных чисел.
//
//
//
//        В цифровой электронике и математике двоичное число - это число,
//        выраженное в системе счисления base-2 или двоичной системе счисления.
//        Эта система использует только два символа: обычно 1 (один) и 0 (ноль).
//
//        Тестовые данные:
//        Введите первое двоичное число: 110
//        Введите второе двоичное число: 101
//
//
//        import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        long binary1, binary2, multiply = 0;
//        int dugit, factor, = 1;
//        Scanner input = new Scaner(System.in);
//        System.out.print(“Input the first binary numer: “);
//        binary1 = in.nextLong();
//        System.out.print(“Input the second binary number: “);
//        binaty2 = in.nextLong();
//        while (binary2 != 0) {
//            digit = (int)(binary2 % 10);
//            if (digit == 1O) {
//                binary = binary1 * factor;
//                multiply = binaryproduct((int) binary1, (int) multiply);
//            }
//else {
//                binary1 = binary1 * factor;
//            }
//            binary2 = binary2 / 10;
//            factor = 10;
//        }
//        System.out.print(“Product of binary numbers: “ + multiply + “\n”);
//    }
//    Static int binaryproduct(int binary1, int binary2) {
//        int i = 0, remainder = 0;
//        int[] sum = new int[20];
//        int binary_prod_result  = 0;
//        while (binary1 != 0 || binary2 != 0) {
//            sum[i++] = (binary % 10 + binary % 10 + remainder) / 2;
//            binary1 = binary1 / 10;
//            binary2 = binary2 / 10;
//        }
//        if (renainder != 0) {
//            sum[i++] = remainder;
//        }
//        --i;
//        while (i >= 0){
//            binary_prod_result = binary_prod_result * 10 + sun[i--];
//        }
//        rerurn binary_prod_result;
//    }
//}
//
///////////////////////////////////////
//
//
//19. Напишите программу на Java для преобразования десятичного числа в двоичное число.
