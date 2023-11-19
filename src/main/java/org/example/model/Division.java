package org.example.model;

public class Division {

    private long id;
    private String name;

    public Division(String name) {
        this.name = name;
        id = (long) (name.toCharArray()[0] * (100 + Math.random() * 200));
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
