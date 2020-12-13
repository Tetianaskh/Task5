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
        for (int number = 1, i = 2; number <= 100; i++ , number++) {
            if (number % i == 0) {
                return;
            }
            System.out.println(number);
        }
    }

    // Задача 3. Пользователь поочередно вводит числа, пока не введет 0, найти из среднее арифметичесткое,
    // использовать break
    public static void exercise03() {
        System.out.println("Добрый день!");
        System.out.println("Наш помощник посчитает среднее арифметическое всех введенных Вами чисел (до введенного числа 0):");
        System.out.println("Введите, пожалуйста, число:");
        Scanner sc = new Scanner(System.in);
        for (double number = sc.nextInt(), i = 1, sum = 0; number > 0; i++) {
            double result = 0;
            if (number == 0) {
                return;
            }
            sum += number;
            result = sum / i;
            System.out.println("Среднее арифметическое = " + result);
            break;
        }
    }

    // Дополнительные задачи:

    // Задача 1. Написать метод, который принимает 2 целых числа и возвращает их наибольший общий делитель
    public static void exercise001() {

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
