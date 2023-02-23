package observerPattern.dao;

import observerPattern.domain.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    Employee emp1 = new Employee("Laci", LocalDate.of(2000, 1, 12), 5000, false);
    Employee emp2 = new Employee("Kati", LocalDate.of(2001, 3, 4), 6000, false);
    Employee emp3 = new Employee("Feri", LocalDate.of(2002, 5, 7), 7000, false);
    Employee emp4 = new Employee("Lajos", LocalDate.of(2003, 4, 22), 54000, false);
    Employee emp5 = new Employee("Manka", LocalDate.of(2004, 7, 30), 3000, false);

    List<Employee> employees;

    public List<Employee> generateEmployees(){

        employees = new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        return employees;
    }

    public void addEmployee(Employee emp){
        employees.add(emp);
    }
}
