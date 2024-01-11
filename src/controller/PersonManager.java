package controller;

import model.FileHandler;
import model.HotelEntity;
import model.Person;

import java.util.List;
import java.util.Scanner;

public class PersonManager {
//    implements FileHandler<HotelEntity>
    private List<HotelEntity> persons;

    public PersonManager() {
        persons = new java.util.ArrayList<>();
    }

    public void addOrUpdatePerson(Scanner scanner) {
        System.out.println("Nhập thông tin người (Passport, Name, Age, Kind of Room): ");
        int passport = scanner.nextInt();
        String name = scanner.next();
        int age = scanner.nextInt();
        String kindOfRoom = scanner.next();
        Person newPerson = new Person(name, age, passport, kindOfRoom);
        Person existingPerson = findPersonById(passport);

        if (existingPerson != null) {
            System.out.println("Người đã tồn tại. Bạn có muốn cập nhật thông tin không? (Y/N)");
            String choice = scanner.next().toUpperCase();
            if (choice.equals("Y")) {
                existingPerson.setName(newPerson.getName());
                existingPerson.setAge(newPerson.getAge());
                existingPerson.setKindOfRoom(newPerson.getKindOfRoom());
                System.out.println("Thông tin người đã được cập nhật.");
            }
        } else {
            persons.add(newPerson);
            System.out.println("Người đã được thêm mới.");
        }
    }

    public void deletePerson(Scanner scanner) {
        System.out.print("Nhập Passport người cần xoá: ");
        int passportToDelete = scanner.nextInt();
        Person person = findPersonById(passportToDelete);
        if (person != null) {
            persons.remove(person);
            System.out.println("Người đã được xoá.");
        } else {
            System.out.println("Không tìm thấy người với Passport đã nhập.");
        }
    }

    public void displayPersons() {
        System.out.println("Danh Sách Người:");
        for (HotelEntity entity : persons) {
            if (entity instanceof Person) {
                System.out.println(entity);
            }
        }
    }

//    @Override
//    public List<HotelEntity> readFromFile(String fileName) {
//        // Đọc dữ liệu từ file
//        // ...
//
//    }
//
//    @Override
//    public void writeToFile(List<HotelEntity> entities, String fileName) {
//        // Ghi dữ liệu vào file
//        // ...
//    }

    private Person findPersonById(int passport) {
        for (HotelEntity entity : persons) {
            if (entity.getID() == passport && entity instanceof Person) {
                return (Person) entity;
            }
        }
        return null;
    }
}