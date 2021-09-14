package ru.job4j;

import ru.job4j.tracker.Tracker;

public class SingleTracker {
    private static Tracker tracker = null;

    private SingleTracker() {

    }

    public static Tracker getInstance() {
        if (tracker == null) {
            tracker = new Tracker();
        }
        return tracker;
    }
}
