package com.company;

import java.util.ArrayList;

public class Instructor extends Employees  {

    ArrayList<Instructor> instructorArrayList = new ArrayList<>();

    public Instructor(String name, int CPR, int workHours, int salary) {
        super(name, CPR, workHours, salary);
    }

    public Instructor() {
        super();
    }

    @Override
    public int getWorkHours() {
        return super.getWorkHours();
    }

    @Override
    public void setWorkHours(int workHours) {
        super.setWorkHours(workHours);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    public void addInstructors() {


        Instructor Kirsten = new Instructor("Kirsten", 19239023, 37, 18000);
        Instructor Tom = new Instructor("Tom", 19339023, 37, 18000);
        Instructor Karsten = new Instructor("Karsten", 33239023, 32, 15000);
        Instructor Thomas = new Instructor("Thomas", 134239023, 37, 13222);

        instructorArrayList.add(Kirsten);
        instructorArrayList.add(Tom);
        instructorArrayList.add(Karsten);
        instructorArrayList.add(Thomas);

        System.out.printf("%-12s", "First Name");
        System.out.printf("%-12s", "CPR");
        System.out.printf("%-12s", "Work Hours");
        System.out.printf("%-12s", "Salary");
        System.out.println();

        for (Instructor b : instructorArrayList) {

            System.out.printf("%-12s", b.getName());
            System.out.printf("%-12s", b.getCPR());
            System.out.printf("%-12s", b.getWorkHours());
            System.out.printf("%-12s", b.getSalary());
            System.out.println();


        }
    }
}
