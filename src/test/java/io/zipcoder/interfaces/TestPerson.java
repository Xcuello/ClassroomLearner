package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {

        //Given
        Person person = new Person( 5);

        long expected = 5;

        //When
        long actual = person.getId();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSetAndGetName() {
        //Given
        Person person = new Person(5);

        person.setName("Xzavia");

        String expected = "Xzavia";

        //When
        String actual = person.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

}
