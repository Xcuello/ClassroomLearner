package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PeopleTest {

    private People people;
    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;


    @Before
    public void setup() {
        people = new People();
        person1 = new Person(5);
        person2 = new Person(4);
        person3 = new Person(3);
        person4 = new Person(2);


    }

    @Test
    public void testAdd() {

        //Given

        int expected = 1;

        //When
        people.add(person1);

        int actual = people.getSize();


        //Then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveByPerson() {

        //Given
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        //When
        Assert.assertTrue(people.remove(person1));

        //Then


    }

    @Test
    public void testRemovePersonChangeSize() {

        //Given
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        //When
        people.remove(person1);

        int expected = 3;

        int actual = people.getSize();

        //Then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testRemovePersonById() {

        //Given
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        //When
        people.remove(5);

        int expected = 3;

        int actual = people.getSize();

        //Then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testFindById() {

        //Given
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        //When
        Person expected = person1;

        Person actual = people.findById(5);

        //Then
        Assert.assertEquals(expected, actual);



    }

    @Test
    public void testGetArray() {

        //Given
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        //When
        Object[]expected ={person1,person2,person3,person4};

        Object[] actual = people.getArray();

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveAll() {

        //Given
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        //When
        Object[]expected ={person1,person2,person3,person4};

        Object[] actual = people.getArray();

        //Then
        Assert.assertTrue(people.removeAll());
    }
}


