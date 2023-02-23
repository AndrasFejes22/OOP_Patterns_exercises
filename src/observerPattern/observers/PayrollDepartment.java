package observerPattern.observers;

import observerPattern.domain.Employee;

public class PayrollDepartment implements IObserver {

    @Override
    public void callMe(Employee emp, String message) {
        System.out.println("Payroll department notified.");
        System.out.println(message + " " + emp.getName());
    }
}
