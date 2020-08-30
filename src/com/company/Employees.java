package com.company;

public class Employees extends Person {

    public Employees(String name, int CPR, int workHours, int salary) {
        super(name, CPR);
        this.workHours = workHours;
        this.salary = salary;
    }

    int workHours;
    int salary;

    public Employees() {
        super();
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
