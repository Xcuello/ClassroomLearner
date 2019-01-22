package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class StudentTest {

    @Test
    public void testImplementation() {

        //Given
        Student student = new Student(5);



        //Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        //Given
        Person student = new Student(5);

        //Then
        Assert.assertTrue(student instanceof Person);

    }

    @Test
    public void testLearn() {
        //Given
        Student student = new Student(5);

        double expected = 4.5;

        student.learn(4.5);

        //Then
        double actual = student.getTotalStudyTime();

        //When
        Assert.assertEquals(expected, actual, 0);


    }



    }

