package ru.job4j.tracker;

import junit.framework.TestCase;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest extends TestCase {
    private Tracker tracker;

    @Override
    public void setUp() {
        tracker = new Tracker();
    }

    public void testWhenAddNewItemThenTrackerHasSameItem() {
        Item item = new Item("Test 1");
        tracker.add(item);

        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    public void testWhenTrackerNotFoundItemById() {
        Item result = tracker.findById("Test 2");

        assertNull(result.getId());
        assertThat(result.getName(), is(""));
    }

    public void testWhenFindAllThanReturnAllItems() {
        tracker.add(new Item("Test 1"));
        tracker.add(new Item("Test 2"));
        tracker.add(new Item("Test 3"));

        Item[] items = tracker.findAll();
        assertThat(items.length, is(3));
    }

    public void testWhenFindItemsByNameThan2ItemsFound() {
        tracker.add(new Item("Test 1"));
        tracker.add(new Item("Test 2"));
        tracker.add(new Item("Test 2"));
        tracker.add(new Item("Test 3"));

        Item[] items = tracker.findByName("Test 2");
        assertThat(items.length, is(2));
    }

    public void testWhenFindItemsByNameThanNoItemsFound() {
        tracker.add(new Item("Test 1"));
        tracker.add(new Item("Test 2"));
        tracker.add(new Item("Test 2"));
        tracker.add(new Item("Test 3"));

        Item[] items = tracker.findByName("Test 4");
        assertThat(items.length, is(0));
    }

    public void testWhenReplace() {
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    public void testWhenDelete() {
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);

        Item result = tracker.findById(id);
        assertNull(result.getId());
        assertThat(result.getName(), is(""));
    }
}