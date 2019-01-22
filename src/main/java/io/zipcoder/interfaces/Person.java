package io.zipcoder.interfaces;

public class Person {

    private final long id;

    private String name;

    public Person(int objectId) {

        this.id = objectId;

    }

    public long getId() {

        return this.id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
