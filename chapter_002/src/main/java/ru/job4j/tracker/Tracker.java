package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;
    private final Item empty = new Item("");

    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item findById(String id) {
        for (int i = 0; i < position; i++) {
            Item item = items[i];
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return empty;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    public Item[] findByName(String key) {
        Item[] itemsFound = new Item[position];
        int size = 0;

        for (int i = 0; i < position; i++) {
            Item item = items[i];
            if (item.getName().equals(key)) {
                itemsFound[size] = item;
                size++;
            }
        }

        return Arrays.copyOf(itemsFound, size);
    }
}