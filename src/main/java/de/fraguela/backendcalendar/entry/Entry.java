package de.fraguela.backendcalendar.entry;

        import de.fraguela.backendcalendar.type.Type;

        import java.time.LocalDateTime;
        import java.util.concurrent.atomic.AtomicLong;

public class Entry {
    private static final AtomicLong counter = new AtomicLong(0);
    private long id;
    private String name;
    private LocalDateTime start;
    private LocalDateTime end;
    private String place;
    private String[] participants;
    private Type type;
    private boolean full_day;
    private long userid;

    public Entry(String name, LocalDateTime start, LocalDateTime end, String place, String[] participants, Type type, boolean full_day, long userid) {
        id = counter.incrementAndGet();
        this.name = name;
        this.start = start;
        this.end = end;
        this.place = place;
        this.participants = participants;
        this.type = type;
        this.full_day = full_day;
        this.userid = userid;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String[] getParticipants() {
        return participants;
    }

    public void setParticipants(String[] participants) {
        this.participants = participants;
    }

    public boolean isFull_day() {
        return full_day;
    }

    public void setFull_day(boolean full_day) {
        this.full_day = full_day;
    }

    public long getUserid() {
        return userid;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
