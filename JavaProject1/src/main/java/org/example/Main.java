package org.example;

import java.sql.Connection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Connection conn = DBConnection.getConnection();

//        DBConnection.createTable("person");

        Person p1 = new Person("Akanksha", "Chopra", 21);
        DBConnection.insertPerson(p1);

        Person p2 = new Person("Ananya", "Gupta", 21);
        DBConnection.insertPerson(p2);

        List<Person> persons = DBConnection.getAllPerson();
        System.out.println("All Persons:");
        for (Person p : persons) {
            System.out.println(p);
        }

        Person personById = DBConnection.getPersonbyId(1);
        System.out.println("Person with ID 1: " + personById);

        Person updatedPerson = new Person("Ak", "Sharma", 22);
        DBConnection.updatePerson(1, updatedPerson);

        System.out.println("After update:");
        List<Person> updatedList = DBConnection.getAllPerson();
        for (Person p : updatedList) {
            System.out.println(p);
        }

        DBConnection.deletePersonBYId(2);


        System.out.println("After deletion:");
        List<Person> finalList = DBConnection.getAllPerson();
        for (Person p : finalList) {
            System.out.println(p);
        }

        DBConnection.closeConnection();
    }
}