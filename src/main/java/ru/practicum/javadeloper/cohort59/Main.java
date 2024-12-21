package ru.practicum.javadeloper.cohort59;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static DinnerConstructor dc;
    static Scanner scanner;

    public static void main(String[] args) {
        dc = new DinnerConstructor();
        scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    addNewDish();
                    break;
                case "2":
                    generateDishCombo();
                    break;
                case "3":
                    return;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Выберите команду:");
        System.out.println("1 - Добавить новое блюдо");
        System.out.println("2 - Сгенерировать комбинации блюд");
        System.out.println("3 - Выход");
    }

    private static void addNewDish() {
        System.out.println("Введите тип блюда:");
        String dishType = scanner.nextLine();
        System.out.println("Введите название блюда:");
        String dishName = scanner.nextLine();

        // добавьте новое блюдо
        dc.addNewDish(dishType, dishName);

    }

    private static void generateDishCombo() {
        System.out.println("Начинаем конструировать обед...");

        System.out.println("Введите количество наборов, которые нужно сгенерировать:");
        int numberOfCombos = scanner.nextInt();
        scanner.nextLine();

        List<String> comboTypes = new ArrayList<>();

        String nextItem = askAndGetNextComboType(comboTypes);
        //реализуйте ввод типов блюд
        while (!nextItem.isEmpty()) {
            nextItem = askAndGetNextComboType(comboTypes);
        }

        // сгенерируйте комбинации блюд и выведите на экран
        List<List<String>> combos = dc.generateCombos(comboTypes, numberOfCombos);

        for (List<String> combo: combos) {
            int index = combos.indexOf(combo) + 1;
            System.out.println("Комбо " + index);
            System.out.println(combo);
        }
    }

    private static String askAndGetNextComboType(List<String> comboTypes) {
        System.out.println("Вводите типы блюда, разделяя символом переноса строки (enter). Для завершения ввода введите пустую строку");
        String nextItem = scanner.nextLine();
        if (dc.checkType(nextItem)) {
            comboTypes.add(nextItem);
        } else {
            System.out.println("Такой тип не найден среди существующих блюд! Введите повторно");
        }
        return nextItem;
    }
}
