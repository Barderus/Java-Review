/*
        Student Class with Constructor Overloading
    Create a Student class with fields name, rollNumber, course.
    Use constructor overloading to create students with different initial data (e.g., only name, or name and rollNumber).
    Implement a method to display the student's information.
 */
package OOP.Exercises;

import java.util.Arrays;

public class Student {
    String name;
    String rollNumber;
    String[] course;

    public Student(String name, String rollNumber, String[] course){
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    public Student(String name, String rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public Student(String rollNumber){
        this.rollNumber = rollNumber;
    }


    @Override
    public String toString(){
        return "\nStudent name: " + this.name +
                "\nEnroll number: " + this.rollNumber +
                "\nCourses: " + Arrays.toString(this.course);
    }
}
