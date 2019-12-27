package de.fraguela.backendcalendar.user;

import de.fraguela.backendcalendar.entry.Entry;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class User {
    private static final AtomicLong counter = new AtomicLong(0);
    private long id;
    private String mail;
    private String password;
    private String firstname;
    private String lastname;
    private String username;
    private LocalDate birth;
    private List<Entry> entrylist;

    public User(String mail, String password, String firstname, String lastname, String username, LocalDate birth) {
        id = counter.getAndIncrement();
        this.mail = mail;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.birth = birth;
    }


    public long getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void addEntry(Entry entry){
        entrylist.add(entry);
    }

    public Entry getEntry(int id){
        return entrylist.get(id);
    }


}
