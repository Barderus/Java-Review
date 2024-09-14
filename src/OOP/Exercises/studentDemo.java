/*
        Student Class with Constructor Overloading
    Create a Student class with fields name, rollNumber, course.
    Use constructor overloading to create students with different initial data (e.g., only name, or name and rollNumber).
    Implement a method to display the student's information.
 */
package OOP.Exercises;

public class studentDemo {

    public static void main(String[] args) {

        String[] courses = {"Intro to Programming", "Calculus 1", "Intro to Sociology", "Chemistry 1"};
        Student stud1 = new Student("Gabriel", "1234567", courses);
        Student stud2 = new Student("Fiona", "098765");
        Student stud3 = new Student("56473839");

        System.out.println(stud1);
        System.out.println(stud2);
        System.out.println(stud3);
    }
}
