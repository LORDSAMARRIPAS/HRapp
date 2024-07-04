package HRapp;

public class Employee {
private int ID;
private String Name;
private double salary;

public Employee(int ID, String Name, double salary) {
this.ID = ID;
this.Name = Name;
this.salary = salary;
}


// Getters
public int getID() {
    return ID;
}

public String getName() {
    return Name;
}

public double getSalary() {
    return salary;
}

// Setters
public void setID(int ID) {
    this.ID = ID;
}

public void setName(String Name) {
    this.Name = Name;
}

public void setSalary(double salary) {
    this.salary = salary;
}


public String toString() {
    return "Employee ID: " + ID + " Name: " + Name + " Salary: " + salary;
}

}