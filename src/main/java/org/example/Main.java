package org.example;

import org.example.sweets.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.print("Выберите номер задачи: (1 - Создание массива и смена местами максимального и " +
                "минимального элементов, " +
                "2 - Собрать подарок): ");
        int task = scanner.nextInt();
        if (task == 1) {
            System.out.println("Вы выбрали создание массива.");
            getArray();
        } else if (task == 2) {
            System.out.println("Вы выбрали собрать подарок.");
            getGift();
        } else {
            System.out.println("Вы ввели не верный номер операции. Попробуйте снова.");
            scanner.next();
        }
        scanner.close();
    }

    public static void getArray() {

        int maxNegIndex = 0;
        int minPosIndex = 0;
        int[] mas = new int[20];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) ((Math.random() * 20) - 10);
            if (mas[i] < 0) {
                if (mas[i] > mas[maxNegIndex])
                    maxNegIndex = i;
                if (mas[maxNegIndex] >= 0)
                    maxNegIndex = i;
            } else if (mas[i] > 0) {
                if (mas[i] < mas[minPosIndex])
                    minPosIndex = i;
                if (mas[minPosIndex] <= 0)
                    minPosIndex = i;
            }
        }
//        Для проверки найденных индексов
//        System.out.println(maxNegIndex);
//        System.out.println(minPosIndex);
        System.out.println(Arrays.toString(mas));
        int temp = mas[maxNegIndex];
        mas[maxNegIndex] = mas[minPosIndex];
        mas[minPosIndex] = temp;

        System.out.println(Arrays.toString(mas));
    }

    public static void getGift() throws IOException {
        ArrayList<Gift> gift = new ArrayList<>();
        boolean formed = false;
        double totalPrice = 0;
        int totalWeight = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose a sweet to add as a gift:");
        System.out.println("'1' - Candy \"Chocolate candy\"");
        System.out.println("'2' - Chocolate \"Alenca\"");
        System.out.println("'3' - Jellybean \"Apple\"");
        System.out.println("'4' - Kinder \"Kinder delice\"");
        System.out.println("'5' - Macaroon \"Apple\"");
        System.out.println("'6' - Waffles \"Cow\"");
        System.out.println("'0' - Finish choosing gifts");

        while (!formed) {
            String choice = reader.readLine();
            switch (choice) {
                case "1" -> {
                    Candy candy = new Candy("Chocolate candy", 10, 10.00);
                    gift.add(candy);
                    totalPrice += candy.getPrice();
                    totalWeight += candy.getWeight();
                    System.out.println("Candy \"Chocolate candy\" added as a gift");
                }
                case "2" -> {
                    Chocolate chocolate = new Chocolate(1, "Alenca", 100, 89.99);
                    gift.add(chocolate);
                    totalPrice += chocolate.getPrice();
                    totalWeight += chocolate.getWeight();
                    System.out.println("Chocolate \"Alyonka\" added as a gift");
                }
                case "3" -> {
                    Jellybean jellybean = new Jellybean(1, "Apple", 20, 20.2);
                    gift.add(jellybean);
                    totalPrice += jellybean.getPrice();
                    totalWeight += jellybean.getWeight();
                    System.out.println("Jellybean \"Jellybean apple\" added as a gift");
                }
                case "4" -> {
                    Kinder kinder = new Kinder(1, "Kinder delice", 50, 74.40);
                    gift.add(kinder);
                    totalPrice += kinder.getPrice();
                    totalWeight += kinder.getWeight();
                    System.out.println("Kinder \"Kinder delice\" added as a gift");
                }
                case "5" -> {
                    Macaroon macaroon = new Macaroon(1, "Apple", 80, 99.50);
                    gift.add(macaroon);
                    totalPrice += macaroon.getPrice();
                    totalWeight += macaroon.getWeight();
                    System.out.println("Macaroon \"Macaroon apple\" added as a gift");
                }
                case "6" -> {
                    Waffles waffles = new Waffles(1, "Cow", 120, 110.90);
                    gift.add(waffles);
                    totalPrice += waffles.getPrice();
                    totalWeight += waffles.getWeight();
                    System.out.println("Waffles \"Cow\" added as a gift");
                }
                case "0" -> formed = true;
                default -> {
                    System.out.println("You made a mistake with the number, try another one." +
                            "\n Choose from 1 to 6 or 0 to complete the selection of gifts");
                }
            }
        }
        int count = 0;
        System.out.println("\nThe gift consists of:");
        for (Gift sweet : gift) {
            count++;
            System.out.println(count + ". " + sweet.getName());
        }
        System.out.printf("\nTotal weight of the gift: %s гр.\nTotal gift price: %.2f руб.%n", totalWeight, totalPrice);
    }
}

