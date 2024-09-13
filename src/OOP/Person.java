/*
    Create a Simple Person Class
    Create a Person class with fields name, age, and gender.
    Write methods to set and get the values of each field.
    Add a method to print the details of a Person.
 */
package OOP;

public class Person{
    String firstName;
    String lastName;
    int age;
    String gender;

    public Person(String fName, String lName, int age, String gender){
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString(){
        return "First Name: " + firstName +
                " \nLast name: " + lastName +
                " \nAge: " + age +
                " \nGender: " + gender + "\n";
        }
}
