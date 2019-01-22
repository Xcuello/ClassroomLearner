package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class People {

    List<Person> personList = new ArrayList<>();

    public void add(Person person1) {

        personList.add(person1);

    }

    public int getSize() {

        return personList.size();
    }


    public boolean remove(Person person1) {

        return personList.remove(person1);
    }

    public void remove(long i) {

        Person personToRemove = null;

        for (Person person : personList) {

            if (person.getId() == i) {

                personToRemove = person;

            }

        }
        personList.remove(personToRemove);

    }

    public Person findById(long i) {

        Person personToCapture = null;

        for (Person person : personList) {

            if (person.getId() == i) {

                personToCapture = person;

            }

        }
        return personToCapture;
    }

    public Object[] getArray() {

        return personList.toArray();
    }

    public boolean removeAll() {

        return personList.removeAll(personList);
    }
}
