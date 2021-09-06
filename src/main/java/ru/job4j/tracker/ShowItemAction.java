package ru.job4j.tracker;

public class ShowItemAction implements UserAction {
    private final Output out;

    public ShowItemAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all items ====");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("Хранилище еще не содержит заявок");
        }
        return true;
    }
}
