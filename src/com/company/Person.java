package com.company;

public class Person {

private String name;
private int CPR;


    public Person(String name, int CPR) {
        this.name = name;
        this.CPR = CPR;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCPR() {
        return CPR;
    }

    public void setCPR(int CPR) {
        this.CPR = CPR;
    }




}
