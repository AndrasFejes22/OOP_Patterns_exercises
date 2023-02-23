package observerPattern.domain;

import java.time.LocalDate;

public class Employee {

    private String name;
    private LocalDate hireDate;
    private int salary;
    private int employeeID;
    private boolean working = false;

    private static int COUNTER;

    public Employee(String name, LocalDate hireDate, int salary, boolean working) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.working = working;

        employeeID = ++COUNTER;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "name='" + name + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", employeeID=" + employeeID +
                ", working=" + working +
                ']';
    }
}
