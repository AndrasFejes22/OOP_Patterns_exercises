package observerPattern.observers;

import observerPattern.domain.Employee;

public class HRDepartment implements IObserver{

    @Override
    public void callMe(Employee emp, String message) {
        System.out.println("HR department notified.");
        System.out.println(message + " " + emp.getName());
    }
}
