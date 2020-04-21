package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    private final String SEP = System.lineSeparator();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                Item item = new Item(scanner.nextLine());
                tracker.add(item);
                System.out.println();
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] items = tracker.findAll();
                for (Item item : items) {
                    System.out.println(item);
                }
                System.out.println();
            } else if (select == 2) {
                System.out.println("=== Edit the Item ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                System.out.print("Enter name: ");
                Item item = new Item(scanner.nextLine());
                if (tracker.replace(id, item)) {
                    System.out.println("Item with id '" + id + "' has been replaced.");
                } else {
                    System.out.println("Item with id '" + id + "' not found.");
                }
                System.out.println();
            } else if (select == 3) {
                System.out.println("=== Delete Item by id ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Item with id '" + id + "' has been deleted.");
                } else {
                    System.out.println("Item with id '" + id + "' not found.");
                }
                System.out.println();
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Item with id '" + id + "' not found.");
                }
                System.out.println();
            } else if (select == 5) {
                System.out.println("=== Find item by name ====");
                System.out.print("Enter name: ");
                Item[] items = tracker.findByName(scanner.nextLine());
                for (Item item : items) {
                    System.out.println(item);
                }
                System.out.println();
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println(
            "Menu." + SEP +
            "0. Add new Item" + SEP +
            "1. Show all items" + SEP +
            "2. Edit item" + SEP +
            "3. Delete item" + SEP +
            "4. Find item by Id" + SEP +
            "5. Find items by name" + SEP +
            "6. Exit Program"
        );
    }
}
