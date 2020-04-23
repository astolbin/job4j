package ru.job4j.tracker;

public class StartUI {
    private final String SEP = System.lineSeparator();

    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                Item item = new Item(input.askStr("Enter name: "));
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
                String id = input.askStr("Enter id: ");
                Item item = new Item(input.askStr("Enter name: "));
                if (tracker.replace(id, item)) {
                    System.out.println("Item with id '" + id + "' has been replaced.");
                } else {
                    System.out.println("Item with id '" + id + "' not found.");
                }
                System.out.println();
            } else if (select == 3) {
                System.out.println("=== Delete Item by id ====");
                String id = input.askStr("Enter id: ");
                if (tracker.delete(id)) {
                    System.out.println("Item with id '" + id + "' has been deleted.");
                } else {
                    System.out.println("Item with id '" + id + "' not found.");
                }
                System.out.println();
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                String id = input.askStr("Enter id: ");
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Item with id '" + id + "' not found.");
                }
                System.out.println();
            } else if (select == 5) {
                System.out.println("=== Find item by name ====");
                Item[] items = tracker.findByName(input.askStr("Enter name: "));
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
