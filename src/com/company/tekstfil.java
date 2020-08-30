package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class tekstfil {

    Scanner scanner = new Scanner(System.in);
    PersonArrayClass personArrayClass = new PersonArrayClass();
    ArrayList<Person> personArrayList2 = new ArrayList<>();


    public void writeFile() {

        try {
            FileWriter fileWriter = new FileWriter("persons.rtf");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < personArrayClass.personArrayList.size(); i++) {
                if (i != 0) {
                    bufferedWriter.newLine();
                }

                Person p = personArrayClass.personArrayList.get(i);
                bufferedWriter.write(p.getName() + "\t" + p.getCPR());

            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void readFile(){

    String name = null;
    int CPR = 0;

    String fileLocation = "persons.rtf";

    try{
        Scanner scanner = new Scanner(new File(fileLocation));
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] split = line.split("\\s");
            name = split[0];
            CPR = Integer.parseInt(split[1]);

            Person personList = new Person(name, CPR);
            personArrayList2.add(personList);



        }
        System.out.println("Employees & Members - Name and CPR");
        System.out.println("***********************************");
        System.out.printf("%-12s", "Name");
        System.out.printf("%-12s", "CPR");
        System.out.println();

        for(Person p : personArrayList2){
            System.out.printf("%-12s", p.getName());
            System.out.printf("%-12s", p.getCPR());
            System.out.println();

        }

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }


    }
}

