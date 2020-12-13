package com.company;

import java.util.Scanner;

public class Task5 {

   // Основные задачи:

    // Задача 1. Используя цикл for вывести те числа которые делятся на 5, но не делятся на 3 из интервала 1...100
    public static void exercise01() {
        System.out.println("Добрый день!");
        System.out.println("Наш помощник выведет числа которые делятся на 5 но не делятся на 3 из интерала 1...100:");
        for (int number = 1; number <= 100; number++) {
            if (number % 5 == 0 && number % 3 != 0) {
                System.out.println(number);
            }
        }
    }

    // Задача 2. Вывести все простые числа из интервала 1...100
    public static void exercise02() {
        System.out.println("Добрый день!");
        System.out.println("Наш помощник выведет все простые числа из интервала 1...100:");
        for (int number = 1, i = 2; number <= 100; number++) {
            if (number % i == 0) {
                continue;
            }
            System.out.println(number);
        }
    }

    // Задача 3. Пользователь поочередно вводит числа, пока не введет 0, найти их среднее арифметичесткое, использовать break
    public static void exercise03() {
        System.out.println("Добрый день!");
        System.out.println("Наш помощник посчитает среднее арифметическое всех введенных Вами чисел (до введенного числа 0):");
        Scanner sc = new Scanner(System.in);
        int number;
        int i = 0;
        double sum = 0;
        double result;
        do {
            System.out.println("Введите, пожалуйста, число:");
            number = sc.nextInt();
            sum += number;
            i++;
            result = sum / i;
        } while (number != 0);

        System.out.println("Среднее арифметическое = " + result);
    }

    // Дополнительные задачи:

    // Задача 1. Написать метод, который принимает 2 целых числа и возвращает их наибольший общий делитель
    public static void exercise001() {
        System.out.println("Добрый день!");
        System.out.println("Наш помощник посчитает наибольший общий делитель двух целых чисел:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, два целых числа:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();


    }

    // Задача 2. Пользователь вводит число описывающее марштур? где каждая цифра означает направление
    // 1 - прямо, 2 - направо, 3 - налево, вывести этот маршрут текстом, причем если единица повторяется
    // вывести "продолжайте движение прямо"
    // Например? если пользователь введет 1211312
    // двигайтесь прямо
    // поверните направо
    // двигайтесь прямо
    // продолжайте движение прямо
    // поверните налево
    // двигайтесь прямо
    // повернитесь направо
    public static void exercise002() {

    }

    public static void main(String[] args) {
        exercise03();
    }
}
