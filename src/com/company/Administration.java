package com.company;

import java.util.ArrayList;

public class Administration extends Employees {

    ArrayList<Administration> administrationArrayList = new ArrayList<>();

    private int vacation;

    public Administration(String name, int CPR, int workHours, int salary, int vacation) {
        super(name, CPR, workHours, salary);
    }




    public Administration() {

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


    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }
}
