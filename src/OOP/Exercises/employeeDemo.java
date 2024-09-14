package OOP.Exercises;

public class employeeDemo {

    public static void main(String[] args) {

        // Test case 1: Basic yearly salary calculation
        Employee employee1 = new Employee("Alice", "Developer", "Engineering",
                5000.0, 8.0, 6);

        double expectedYearlySalary1 = 5000.0 * 12;
        assert employee1.calcSalary() == expectedYearlySalary1 : "Test case 1 failed";

        // Test case 2: Raise calculation with high performance and medium experience
        Employee employee2 = new Employee("Bob", "Manager", "Sales",
                6000.0, 8.5, 16);

        double expectedNewSalary2 = 6000.0 + (6000.0 * (1.07 + 0.10)); // 7% for experience + 10% for performance
        assert employee2.raise() == expectedNewSalary2 : "Test case 2 failed";

        // Test case 3: Raise calculation with low performance and high experience
        Employee employee3 = new Employee("Charlie", "Designer", "Marketing",
                4000.0, 4.5, 26);

        double expectedNewSalary3 = 4000.0 + (4000.0 * (0.15)); // 15% for experience + 0% for performance
        assert employee3.raise() == expectedNewSalary3 : "Test case 3 failed";

        // Test case 4: No raise with low performance and low experience
        Employee employee4 = new Employee("Diana", "Analyst", "Finance",
                4500.0, 3.0, 3);

        double expectedNewSalary4 = 4500.0; // No raise, so salary remains the same
        assert employee4.raise() == expectedNewSalary4 : "Test case 4 failed";

        System.out.println("All test cases passed!");
    }
}
