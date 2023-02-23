package observerPattern.subjects;

import observerPattern.dao.EmployeeDAO;
import observerPattern.domain.Employee;
import observerPattern.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem implements ISubject{

    private List<Employee> employees;
    private List<IObserver> observers;

    private EmployeeDAO employeeDAO;

    private Employee employee;
    private String message;

    public EmployeeManagementSystem(){
        observers = new ArrayList<>();
        employeeDAO = new EmployeeDAO();
        employees = employeeDAO.generateEmployees();
    }

    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver departments : observers){
            departments.callMe(employee, message);
        }
    }

    public void hireEmployee(Employee emp){
        employee = emp;
        message = "New Hire:";
        employees.add(emp);
        notifyObservers();
    }

    public void modifyEmployeeName(int id, String newName){
        boolean notify = false;
        String oldName = getEmployeeOldName(id);
        for (Employee emp : employees){
            if(id == emp.getEmployeeID()){
                emp.setName(newName);
                this.employee = emp;
                this.message = "Employee name '" + oldName + "' has been modified to";
                notify = true;
            }
        }
        if(notify){
            notifyObservers();
        }
    }

    public void printEmployee(int id){
        boolean notify = false;
        for (Employee emp : employees){
            if(id == emp.getEmployeeID()){
                System.out.println(emp);
                notify = true;
            }
        }
        if(!notify){
            System.out.println("No employee with such ID.");
        }
    }

    public String getEmployeeOldName(int id){
        String oldName = null;
        for (Employee emp : employees){
            if(id == emp.getEmployeeID()){
                oldName = emp.getName();
            }
        }
        return oldName;
    }
}
