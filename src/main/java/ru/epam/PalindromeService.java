package ru.epam;

import java.util.Scanner;


public class PalindromeService {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Введите пример: ");
        String input = inputScanner.nextLine();
        Scanner in = new Scanner(System.in);
        String name = input.replaceAll("\\s+", "").toLowerCase();
        int length = name.length();
        int forward = 0;
        int backward = length - 1;
        while (backward >= forward) {
            char forwardChar = name.charAt(forward++);
            char backwardChar = name.charAt(backward--);
            if (forwardChar != backwardChar) {
                System.out.println("Пример: " + input + " - не палиндром");
            }
            System.out.println("Пример: " + input + " - палиндром");
        }
    }

}
