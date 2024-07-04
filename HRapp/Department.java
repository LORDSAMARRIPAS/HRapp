package HRapp;
import java.util.ArrayList;

public class Department {
private String Name;
private Employee[] employees = new Employee[10]; // Array of Employee objects
private int lastAddedEmployeeIndex = -1; // Index of the last added employee
private ArrayList<Employee> employeess = new ArrayList<>();
private double totalSalary = 0;
private double salary = 0.0;
private double avarageSalary = 0.0;

public Department() {
    // Default constructor
}

public Department(String name) {
    this.Name = name;
}

public String getName() {
    return Name;
}

public void setName(String name) {
    this.Name = name;
}


public double getSalary() {
    return salary;
}

public Employee[] getEmployees() {
    // Create a new array of the same size as the number of employees
    Employee [] actualEmployees = new Employee[lastAddedEmployeeIndex + 1];
    // Copy the employees from the original array to the new array
    for(int i = 0; i <= lastAddedEmployeeIndex; i++) {
        actualEmployees[i] = employees[i];
    }
    return actualEmployees;
}

public void setEmployees(Employee[] employees) {
    this.employees = employees;
}

//option 1
public void addEmployee(Employee emp) {
// Check if the department is full
    if(lastAddedEmployeeIndex < employees.length - 1) {
        // Increment the index and add the employee
        lastAddedEmployeeIndex++;
        // Add the employee to the array
        employees[lastAddedEmployeeIndex] = emp;
    } else {
        System.out.println("Department is full");
    }
}

//option 2
public boolean addEmployees(Employee emp) {
    // Attempt to add the employee to the list
    return employeess.add(emp);
}

// Return the number of employees
public int getEmployeeCount() {
    return lastAddedEmployeeIndex + 1;
}

public Employee getEmployeebyID(int ID) {
    //return employee object based on id
    for (Employee emp : employees) {
        // Check if the employee ID matches the ID provided
        if (emp.getID() == (ID)) {
            return emp;
        }
    }
    return null;
}

// get the totalsalary of all employees in the department
public double getTotalSalary() {
    // Loop through the employees and add their salaries
    for(int i = 0; i <= lastAddedEmployeeIndex; i++) {
        totalSalary += employees[i].getSalary();
    }
    return totalSalary;

}


// get the avarage salary of employees in the department
public double getAvarageSalary() {
    
    if (lastAddedEmployeeIndex > -1) {
        // use the getTotalSalary and getEmployeeCount methods to calculate the average salary
        return getTotalSalary() / (getEmployeeCount());
    } else {
        return 0.0;
    }
}

}
