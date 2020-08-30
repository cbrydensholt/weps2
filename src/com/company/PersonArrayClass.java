package com.company;

import java.util.ArrayList;

public class PersonArrayClass {

    Instructor instructor = new Instructor();
    Administration administration = new Administration();
    Members members = new Members();
    public static ArrayList<Person> personArrayList = new ArrayList<>();

    public void addEmployeesArray() {
        Instructor Kirsten = new Instructor("Kirsten", 19239023, 27, 18000);
        Instructor Tom = new Instructor("Tom", 19339023, 31, 18000);
        Instructor Karsten = new Instructor("Karsten", 33239023, 32, 15000);
        Instructor Thomas = new Instructor("Thomas", 134239023, 37, 13222);

        Administration Finn = new Administration("Finn", 3043024, 37, 23000, 5);
        Administration Tilde = new Administration("Tilde", 324355, 37, 23000, 5);
        Administration Sofie = new Administration("Sofie", 123232, 37, 23000, 5);
        Administration Magnus = new Administration("Magnus", 6345345, 37, 23000, 5);


        instructor.instructorArrayList.add(Kirsten);
        instructor.instructorArrayList.add(Tom);
        instructor.instructorArrayList.add(Karsten);
        instructor.instructorArrayList.add(Thomas);

        administration.administrationArrayList.add(Finn);
        administration.administrationArrayList.add(Tilde);
        administration.administrationArrayList.add(Sofie);
        administration.administrationArrayList.add(Magnus);

    }

    public void addMembersArray(){
        Members Torsten = new Members("Torsten", 234324234, false, 0 );
        Members Sofie = new Members("Sofie", 63463334, true, 0 );
        Members Kasper = new Members("Kasper", 123232, true, 0 );
        Members Josefine = new Members("Josefine", 2345223, false, 0 );

        members.membersArrayList.add(Torsten);
        members.membersArrayList.add(Sofie);
        members.membersArrayList.add(Kasper);
        members.membersArrayList.add(Josefine);

        for(Members m : members.membersArrayList){

            personArrayList.add(m);

            if(m.isBasic == true){
                m.setFee(199);
            } else{
                m.setFee(299);
            }

        }




    }

    public void printMembersArray() {

        System.out.println("Members -----------------------------------------");
        System.out.printf("%-12s", "First Name");
        System.out.printf("%-12s", "CPR");
        System.out.printf("%-12s", "Membership type");
        System.out.printf("%-12s", "        Fee");
        System.out.println();

        for (Members m : members.membersArrayList) {

            System.out.printf("%-12s", m.getName());
            System.out.printf("%-12s", m.getCPR());
            if (m.isBasic == true) {
                System.out.printf("%-12s", "Basic Membership");
            } else {
                System.out.printf("%-12s", "Full Membership");
            }
            System.out.printf("       %-12s", m.getFee()); //?????
            System.out.println();


        }
    }
            public void printEmployeeArray() {

        System.out.println("Employees -----------------------------------------");
        System.out.printf("%-12s", "First Name");
        System.out.printf("%-12s", "CPR");
        System.out.printf("%-12s", "Work Hours");
        System.out.printf("%-12s", "Salary");
        System.out.printf("%-12s", "Vacationo Weeks");
        System.out.println();

        for (Instructor b : instructor.instructorArrayList) {

            System.out.printf("%-12s", b.getName());
            System.out.printf("%-12s", b.getCPR());
            System.out.printf("%-12s", b.getWorkHours());
            System.out.printf("%-12s", b.getSalary());
            System.out.println();

            personArrayList.add(b);

        }
        for (Administration a : administration.administrationArrayList) {

            System.out.printf("%-12s", a.getName());
            System.out.printf("%-12s", a.getCPR());
            System.out.printf("%-12s", a.getWorkHours());
            System.out.printf("%-12s", a.getSalary());
            System.out.printf("%-12s", a.getVacation());
            System.out.println();

            personArrayList.add(a);


        }

        for (Person a : personArrayList) {
                    }

        System.out.println("---------------------------------------------------");

    }
}