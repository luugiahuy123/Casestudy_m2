package controller;

import model.person.Person;

import java.util.ArrayList;
import java.util.List;


public class PersonController {

    static String FILE_PATH = "person.txt";
    private final List<Person> persons;

    public PersonController() {
        persons = new ArrayList<>();
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public void delete(Person person) {
        persons.remove(person);
    }

    public void updatePerson(Person oldPerson, Person newPerson) {
        int index = persons.indexOf(oldPerson);
        if (index != -1) {
            persons.set(index, newPerson);
        }
    }

    public void displayPerson() {
        for (Person person : persons) {
            System.out.println(person);
        }
    }


}
