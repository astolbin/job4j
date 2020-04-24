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
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showItemAll(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private static void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Find item by name ====");
        Item[] items = tracker.findByName(input.askStr("Enter name: "));
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println();
    }

    private static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ====");
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Item with id '" + id + "' not found.");
        }
        System.out.println();
    }

    private static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete Item by id ====");
        String id = input.askStr("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Item with id '" + id + "' has been deleted.");
        } else {
            System.out.println("Item with id '" + id + "' not found.");
        }
        System.out.println();
    }

    private static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit the Item ====");
        String id = input.askStr("Enter id: ");
        Item item = new Item(input.askStr("Enter name: "));
        if (tracker.replace(id, item)) {
            System.out.println("Item with id '" + id + "' has been replaced.");
        } else {
            System.out.println("Item with id '" + id + "' not found.");
        }
        System.out.println();
    }

    private static void showItemAll(Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println();
    }

    private static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        Item item = new Item(input.askStr("Enter name: "));
        tracker.add(item);
        System.out.println();
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
