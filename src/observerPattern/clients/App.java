package observerPattern.clients;

import observerPattern.domain.Employee;
import observerPattern.observers.HRDepartment;
import observerPattern.observers.IObserver;
import observerPattern.observers.PayrollDepartment;
import observerPattern.subjects.EmployeeManagementSystem;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("--------HR Management system---------");
        System.out.println();

        IObserver payroll = new PayrollDepartment();
        IObserver hr = new HRDepartment();

        EmployeeManagementSystem employeeManagementSystem = new EmployeeManagementSystem();

        employeeManagementSystem.registerObserver(payroll);
        employeeManagementSystem.registerObserver(hr);

        Employee bob = new Employee("Joe", LocalDate.of(2000, 10, 01), 23000, true);
        employeeManagementSystem.hireEmployee(bob);

        System.out.println("--------------------------------");

        employeeManagementSystem.modifyEmployeeName(6, "John Doe");
        System.out.println();
        System.out.println("Print an Employee:");
        employeeManagementSystem.printEmployee(2);




    }


}
