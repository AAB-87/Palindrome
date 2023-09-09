package ru.epam;

import java.util.Scanner;


public class PalindromeService {

    public static void main(String[] args) {
        char forwardChar = 0;
        char backwardChar = 0;
        Scanner inputScanner = new Scanner(System.in); // Объявление и инициализация переменной типа Scanner
        System.out.print("Введите пример: "); // Выводим предложение пользователю
        String input = inputScanner.nextLine(); // Сканируем введённый пример
        String example = input.replaceAll("\\s+", "").toLowerCase(); // Убираем пробелы между словами и трансформируем буквы в строчные, где \\s+ - соответствует последовательности из одного или нескольких пробельных символов меняется на "" - пустая строка
        int length = example.length(); // Определяем кол-во букв в ведённом примере
        int forward = 0; // Создаём переменную со значением 0, для начала отсчёта перебора
        int backward = length - 1; // Создаём переменную в которой будет храниться кол-во букв в ведённом примере - 1
        while (backward > forward) { // пока кол-во букв -1, больше 0
            forwardChar = example.charAt(forward++);
            backwardChar = example.charAt(backward--);// Из введённого примера без пробелов вызываем метод, который разбивает каждую букву по индексам и минусует 1
        }
        if (forwardChar != backwardChar) {
            System.out.println("Пример: " + input + " - не палиндром");
        } else {
            System.out.println("Пример: " + input + " - палиндром");
        }
    }
}

