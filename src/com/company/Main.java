package com.company;

public class Main {

    public static void main(String[] args) {

PersonArrayClass personArrayClass = new PersonArrayClass();
tekstfil tekstfil1 = new tekstfil();
personArrayClass.addMembersArray(); //tilføjer Members til members arrayliste og person arrayliste
personArrayClass.printMembersArray(); //printer members information
personArrayClass.addEmployeesArray(); //tilføjer employees til employees arrayliste og persons arrayliste
personArrayClass.printEmployeeArray(); //printer members arrayliste
tekstfil1.writeFile(); //læser persons arrayliste og skriver det ind i filen (kun navn og CPR)
tekstfil1.readFile(); //læser filen og sætter det i en array, printer det.




        }
}
