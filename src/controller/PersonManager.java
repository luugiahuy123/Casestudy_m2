package controller;

import model.Person;
import model.room.Room;
import model.room.RoomLux;
import model.room.RoomSup;
import utils.FileReadWrite;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.room.Room.*;

public class PersonManager {
    List<Person> personList = new ArrayList<>();
    private final FileReadWrite fileReadWrite = new FileReadWrite();
    private final Scanner scanner = new Scanner(System.in);

    public void addPerson() {

        System.out.print("Nhap ten kh: ");
        String name = scanner.nextLine();
        System.out.print("nhap tuoi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("nhap passport: ");
        int pass = Integer.parseInt(scanner.nextLine());
        int choice;
        String typeRoom = null;
        int count;
        do {
            count = 0;
            System.out.println("1. lux room");
            System.out.println("2. sup room");
            System.out.println("3. stand room");
            System.out.print("nhap loai phong");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    typeRoom = "Room lux";
                    break;
                case 2:
                    typeRoom = "Room sup";
                    break;
                case 3:
                    typeRoom = "Room stand";
                    break;
                default:
                    count++;
                    System.out.println("nhap sai roi, nhap lai");
            }
        } while (count != 0);
        Person person = new Person(name, age, pass, typeRoom);
        personList = fileReadWrite.readCSV();
        personList.add(person);
        String content = fileReadWrite.convertListToStringCSV(personList);
        fileReadWrite.writeListToCSV(content);
        System.out.println("thêm mới thành công");
    }

    public void deletePerson() {
        int count;
        int id;

        do {
            count = 0;
            System.out.println("nhap id can xoa");
            id = Integer.parseInt(scanner.nextLine());
            Person person = findPersonById(id);
            if (person == null) {
                System.out.println("id khong hop le");
                count++;
            } else {

                removePerson(id);
            }

        } while (count != 0);
    }

    private void removePerson(int id) {
        List<Person> personList1 = fileReadWrite.readCSV();
        for (int i = 0; i < personList1.size(); i++) {
            if (personList1.get(i).getID() == id) {
                personList1.remove(i);
                break;
            }
        }
        String content = fileReadWrite.convertListToStringCSV(personList1);
        fileReadWrite.writeListToCSV(content);
    }

    public void displayPersons() {
        System.out.println("danh sach khach hang:");
        personList = fileReadWrite.readCSV();
        for (Person person : personList) {
            System.out.println(person);
        }
    }


    private Person findPersonById(int passport) {
        List<Person> personList1 = fileReadWrite.readCSV();
        for (Person person : personList1) {
            if (person.getID() == passport) {
                return person;
            }
        }
        return null;
    }

    public void edit() {
        int count;
        int id;
        do {
            count = 0;
            System.out.println("nhap id can sua ");
            id = Integer.parseInt(scanner.nextLine());
            Person person = findPersonById(id);
            if (person == null) {
                System.out.println("id khong hop le ");
                count++;
            } else {
                System.out.print("Nhap ten kh moi ");
                String name = scanner.nextLine();
                System.out.print("nhap tuoi moi: ");
                int age = Integer.parseInt(scanner.nextLine());
                int choice;
                String typeRoom = null;
                int count1;
                do {
                    count1 = 0;
                    System.out.println("1. lux romm");
                    System.out.println("2. sup romm");
                    System.out.println("3. stand romm");
                    System.out.print("nhap loai phong");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            typeRoom = "Room lux";
                            break;
                        case 2:
                            typeRoom = "Room sup";
                            break;
                        case 3:
                            typeRoom = "Room stand";
                            break;
                        default:
                            count1++;
                            System.out.println("nhap sai roi, nhap lai");
                    }
                } while (count1 != 0);
                editPerson(name, age, typeRoom, id);
            }

        } while (count != 0);
    }

    private void editPerson(String name, int age, String typeRoom, int id) {
        List<Person> personList1 = fileReadWrite.readCSV();
        Person newPerson = new Person(name, age, id, typeRoom);
        for (int i = 0; i < personList1.size(); i++) {
            if (personList1.get(i).getID() == id) {
                personList1.set(i, newPerson);
                break;
            }
        }
        String content = fileReadWrite.convertListToStringCSV(personList1);
        fileReadWrite.writeListToCSV(content);
    }
}