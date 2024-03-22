package org.chatbotproject;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final String firstText = "\nThis is a loop test, please enter a string: ";

    public static void main(String[] args) {
        System.out.println(firstText);

        while (true) {
            String userText = sc.nextLine();

            if (userText.equals("exit")) {
                System.out.println("You are going to exit the program now.");
                break;
            }

            System.out.println("You wrote: " + userText);
        }
    }
}