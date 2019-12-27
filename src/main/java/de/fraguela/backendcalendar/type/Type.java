package de.fraguela.backendcalendar.type;

import java.util.concurrent.atomic.AtomicInteger;

public class Type {
    private static final AtomicInteger counter = new AtomicInteger(0);
    private int id;
    private String name;

    public Type(String name) {
        this.name = name;
        id = counter.incrementAndGet();
    }

    public String getName() {
        return name;
    }
}
