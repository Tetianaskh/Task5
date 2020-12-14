package com.company;

import java.util.Scanner;

public class Task5 {

    // Основные задачи:

    /**
     * Задача 1. Используя цикл for вывести те числа которые делятся на 5, но не делятся на 3 из интервала 1...100
     */
    public static void exercise01() {
        System.out.println("Добрый день!");
        System.out.println("Наш помощник выведет числа которые делятся на 5 но не делятся на 3 из интерала 1...100:");
        for (int number = 1; number <= 100; number++) {
            if (number % 5 == 0 && number % 3 != 0) {
                System.out.println(number);
            }
        }
    }

    /**
     * Проверяет делится ли число на другие числа кроме 1 и самого себя
     *
     * @param number число от 1 до 100
     * @return простое число или нет
     */
    public static boolean isPrimeNumber(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Задача 2. Вывести все простые числа из интервала 1...100
     */
    public static void exercise02() {
        System.out.println("Добрый день!");
        System.out.println("Наш помощник выведет все простые числа из интервала 1...100:");
        for (int number = 1; number <= 100; number++) {
            if (isPrimeNumber(number)) {
                System.out.println(number);
            }
        }
    }

    /**
     * Задача 3. Пользователь поочередно вводит числа, пока не введет 0, найти их среднее арифметичесткое,
     * использовать break
     */
    public static void exercise03() {
        System.out.println("Добрый день!");
        System.out.println("Наш помощник посчитает среднее арифметическое всех введенных Вами чисел " +
                "(до введенного числа 0):");
        Scanner sc = new Scanner(System.in);
        int number;
        int i = 0;
        double sum = 0;
        double result;
        do {
            System.out.println("Введите, пожалуйста, число:");
            number = sc.nextInt();
            sum += number;
            if (number == 0) {
                break;
            }
            i++;
        } while (true);
        result = sum / i;
        System.out.println("Среднее арифметическое = " + result);
    }

    // Дополнительные задачи:

    /**
     * Вычисление наибольшего общего делителя двух целых чисел
     *
     * @param number1 первое число
     * @param number2 второе число
     * @return наибольший общий делитель
     */
    public static int getGreatestCommonDivisor(int number1, int number2) {
        while (number2 != 0) {
            int remainderOfDivision = number1 % number2;
            number1 = number2;
            number2 = remainderOfDivision;
        }
        return number1;
    }

    /**
     * Задача 1. Написать метод, который принимает 2 целых числа и возвращает их наибольший общий делитель
     */
    public static void exercise001() {
        System.out.println("Добрый день!");
        System.out.println("Наш помощник посчитает наибольший общий делитель двух целых чисел:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, два целых числа:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int commonDivisor = getGreatestCommonDivisor(number1, number2);
        System.out.println("Наибольший общий делитель чисел " + number1 + " и " + number2 + " = " + commonDivisor);
    }

    /*
     *    Задача 2. Пользователь вводит число описывающее маршрут? где каждая цифра означает направление
     *   1 - прямо, 2 - направо, 3 - налево, вывести этот маршрут текстом, причем если единица повторяется
     *    вывести "продолжайте движение прямо"
     *    Например? если пользователь введет 1211312
     *    двигайтесь прямо
     *    поверните направо
     *    двигайтесь прямо
     *    продолжайте движение прямо
     *    поверните налево
     *    двигайтесь прямо
     *    повернитесь направо
     */
    public static void exercise002() {
        System.out.println("Добрый день!");
        System.out.println("Наш помощник опишет маршрут из введенных вами чисел:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, желаемый маршрут (используя цифры от 1 до 3):");
        String route = sc.nextLine();
        for (int i = 0; i < route.length(); i++) {
            if (route.charAt(i) == '1') {
                if (i > 0 && route.charAt(i - 1) == '1') {
                    System.out.println("Продолжайте движение прямо");
                } else {
                    System.out.println("Двигайтесь прямо");
                }
            } else if (route.charAt(i) == '2') {
                System.out.println("Поверните направо");
            } else if (route.charAt(i) == '3') {
                System.out.println("Поверните налево");
            }
        }
    }

    public static void main(String[] args) {
        exercise01();
        exercise02();
        exercise03();
        exercise001();
        exercise002();
    }
}
