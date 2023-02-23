package observerPattern.observers;

import observerPattern.domain.Employee;

public interface IObserver{
    void callMe(Employee emp, String message);
}
