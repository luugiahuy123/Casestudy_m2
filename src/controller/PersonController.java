package controller;

import model.person.Person;
import model.room.Room;

import java.util.ArrayList;
import java.util.List;

public class PersonController {
    private List<Person> persons;
    public PersonController(){
        persons = new ArrayList<>();
    }
    public void add(Person person) {
        this.persons.add(person);
    }

    public void delete(Person person) {
        persons.remove(person);
    }
    public void updateRoom(Person oldPerson, Person newPerson) {
        int index = persons.indexOf(oldPerson);
        if (index != -1) {
            persons.set(index, newPerson);
        }
}}
