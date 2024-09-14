/*
    Employee Class with Salary Calculation
Create an Employee class with fields for name, position, and salary.
Add a method to calculate an employee’s yearly salary based on their monthly salary.
Include a method that gives employees a raise based on a percentage.
 */
package OOP.Exercises;

public class Employee {

    // Fields
    private String name;
    private String position;
    private String department;
    private double salary;
    private double performance;
    private int yearsOfExperience;

    // Constructor
    Employee(String name, String position, String department, double salary, double performance, int yearsOfExperience){
        this.setName(name);
        this.setPosition(position);
        this.setDepartment(department);
        this.setSalary(salary);
        this.setPerformance(performance);
        this.setYearsOfExperience(yearsOfExperience);

    }

    // Getters
    public String getName(){
        return this.name;
    }

    public String getPosition(){
        return this.position;
    }

    public String getDepartment(){
        return this.department;
    }

    public double getSalary(){
        return this.salary;
    }

    public double getPerformance(){
        return this.performance;
    }

    public int getYearsExperience(){
        return this.yearsOfExperience;
    }
    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setPerformance(double performance){
        this.performance = performance;
    }

    public void setYearsOfExperience(int yearsOfExperience){
        this.yearsOfExperience = yearsOfExperience;
    }

    // Method to calculate yearly_salary
    public double calcSalary(){
        return this.salary * 12;
    }

    // Method to check if someone deserves a raise
    public double raise(){
        int raisePerCent = 1;

        if(this.yearsOfExperience > 25){
            raisePerCent += 15;
        }
        else if (this.yearsOfExperience > 20) {
            raisePerCent += 10;

        }
        else if (this.yearsOfExperience > 15) {
            raisePerCent += 7;

        }
        else if (this.yearsOfExperience > 10) {
            raisePerCent += 5;

        }
        else if (this.yearsOfExperience > 5){
            raisePerCent += 3;
        }


        if(this.performance > 7.5){
            raisePerCent += 10;
        }
        else if(this.performance > 5){
            raisePerCent += 5;
        }

        double percentRaise = (double) raisePerCent / 100;
        return this.salary + (this.salary * percentRaise);
    }
}
