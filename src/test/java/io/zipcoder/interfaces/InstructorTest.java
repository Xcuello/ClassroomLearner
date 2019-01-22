package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    @Test
    public void testImplementation() {

        //Given
        Instructor instructor = new Instructor (5);



        //Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        //Given
        Person instructor = new Instructor (5);

        //Then
        Assert.assertTrue(instructor instanceof Person);

    }

    @Test
    public void testTeach() {
        //Given
        Student student = new Student(5);

        Instructor instructor = new Instructor (5);


        double expected = 5.0;

        student.learn(5.0);

        //When
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0);


    }

    @Test
    public void testLecture() {

        //Given
        Student student1 = new Student(1);
        Student student2 = new Student(2);
        Student student3 = new Student(3);
        Student student4 = new Student(4);
        Student student5 = new Student(5);

        Student[] students = {student1,student2,student3,student4,student5};

        Instructor instructor = new Instructor(5);

        double expected = 2;

        //When
        instructor.lecture(students,10);

        double actual = students[0].getTotalStudyTime();

        //Then
        Assert.assertEquals(expected,actual,0);
    }


}
