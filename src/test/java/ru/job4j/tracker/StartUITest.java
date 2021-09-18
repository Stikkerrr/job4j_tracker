package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                List.of("0", "Item name", "1")
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>() {{
            add(new CreateAction(out));
            add(new Exit());
        }};
        System.out.println(actions.size());
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                List.of("0", String.valueOf(item.getId()), replacedName, "1")
        );
        List<UserAction> actions = new ArrayList<>() {{
            add(new ReplaceAction(out));
            add(new Exit());
        }};
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                List.of("0", String.valueOf(item.getId()), "1")
        );
        List<UserAction> actions = new ArrayList<>() {{
            add(new DeleteAction(out));
            add(new Exit());
        }};
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenFindAll() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Test item"));
        Input in = new StubInput(
                List.of("0", "1")
        );
        List<UserAction> actions = new ArrayList<>() {{
            add(new ShowItemsAction(out));
            add(new Exit());
        }};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator()
                + "0. Show items" + System.lineSeparator()
                + "1. Exit" + System.lineSeparator()
                + "=== Show all items ====" + System.lineSeparator()
                + item + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. Show items" + System.lineSeparator()
                + "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindById() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Test item"));
        Input in = new StubInput(
                List.of("0", String.valueOf(item.getId()), "1")
        );
        List<UserAction> actions = new ArrayList<>() {{
            add(new FindByIdAction(out));
            add(new Exit());
        }};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator()
                + "0. Find item by id" + System.lineSeparator()
                + "1. Exit" + System.lineSeparator()
                + "=== Find item by id ====" + System.lineSeparator()
                + item + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. Find item by id" + System.lineSeparator()
                + "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Test item"));
        Input in = new StubInput(
                List.of("0", item.getName(), "1")
        );
        List<UserAction> actions = new ArrayList<>() {{
            add(new FindByNameAction(out));
            add(new Exit());
        }};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator()
                + "0. Find item by name" + System.lineSeparator()
                + "1. Exit" + System.lineSeparator()
                + "=== Find items by name ====" + System.lineSeparator()
                + item + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. Find item by name" + System.lineSeparator()
                + "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                List.of("0")
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>() {{
            add(new Exit());
        }};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                List.of("5", "0")
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>() {{
            add(new Exit());
        }};
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Exit" + ln
                        + "Wrong input, you can select: 0 .. 0" + ln
                        + "Menu." + ln
                        + "0. Exit" + ln
                )
        );
    }
}
