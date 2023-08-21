package org.example;

import org.example.translator.Translator;
import org.example.validator.TimeValidator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Input: ");
                String input = scanner.nextLine().trim();

                if (input.equals(":q!")) break;

                if (TimeValidator.isValidFormat(input)) {
                    String spokenTime = Translator.translate(input);
                    System.out.println(spokenTime);
                } else {
                    System.out.println("Given input has an invalid format. Please enter time in range 00:00-12:59 with the format HH:MM.");
                }
            }
        }
    }
}
