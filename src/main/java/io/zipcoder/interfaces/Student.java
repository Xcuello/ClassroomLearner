package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    private double totalStudyTime;

    public Student(int objectId) {

        super(objectId);
    }

    public void learn(double numberOfHours) {

        totalStudyTime += numberOfHours;

    }

    public double getTotalStudyTime() {

        return totalStudyTime;
    }
}
