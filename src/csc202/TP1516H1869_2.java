package csc202;
public class TP1516H1869_2 {
    public static void main (String[] args) {

        // Create two objects using constructors
        Employee empOne =new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        // Invoke the methods for James Smith
        empOne.empAge(26);;
        empOne.empDesignation("Senior Software Developer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        // Invoking the methods for Mary Anne
        empTwo.empAge(21);;
        empTwo.empDesignation("Lecturer II");
        empTwo.empSalary(500);
        empTwo.printEmployee();

    }
}
