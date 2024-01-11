package views;

import controller.PersonController;
import model.person.Person;
import java.util.Scanner;


public class ViewPerson {
    public static void main(String[] args) {
        PersonController personController = new PersonController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----- Person Controller Menu -----");
            System.out.println("1. thêm khách hàng");
            System.out.println("2. Xoá khách hàng");
            System.out.println("3. Sửa khách hàng");
            System.out.println("4. Ghi vào file ");
            System.out.println("5. Đọc file");
            System.out.println("6. Hien thi ");
            System.out.println("7. Thoat");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("name, age, passport, room, and number of rents:");
                    System.out.println("name");
                    String name = scanner.nextLine();
                    System.out.println("age");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.println("pass");
                    String passport = scanner.nextLine();
                    System.out.println("so ngay o");
                    int numberRent = Integer.parseInt(scanner.nextLine());
                    System.out.println("loai phong");
                    int choice1;
                    String room = null;
                    int count = 0;
                    do {
                        count = 0;
                        System.out.println("1 lux");
                        System.out.println("2 stand");
                        System.out.println("3 Sup");
                        System.out.println("Nhap vo");
                        choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:
                                room = "lux";
                                break;
                            case 2:
                                room = "lux";
                                break;
                            case 3:
                                room = "sup";
                                break;
                            default:
                                count++;
                        }
                    } while (count != 0);
                    Person person = new Person(name, age, passport, room, numberRent);
                    personController.add(person);
                    break;
                case 2:
                    System.out.println("Nhập ID của người để xóa:");
                    String passportToDelete = scanner.nextLine();
                    Person personToDelete = null;
                    for (Person p : personController.getPersons()) {
                        if (p.getPassport().equals(passportToDelete)) {
                            personToDelete = p;
                            break;
                        }
                    }
                    if (personToDelete != null) {
                        personController.delete(personToDelete);
                        System.out.println("Người đã được xoá");
                    } else {
                        System.out.println("Không tìm thấy người này");
                    }
                    break;

                case 3:
                    System.out.println("Nhập hộ chiếu của người cần cập nhật:");
                    String passportToUpdate = scanner.nextLine();
                    Person personToUpdate = null;
                    for (Person p : personController.getPersons()) {
                        if (p.getPassport().equals(passportToUpdate)) {
                            personToUpdate = p;
                            break;
                        }
                    }

                    if (personToUpdate != null) {
                        System.out.println("Enter the new person's name, age, passport, room, and number of rents:");
                        String newName = scanner.nextLine();
                        int newAge = scanner.nextInt();
                        String newPassport = scanner.next();
                        String newRoom = scanner.nextLine();
                        int newNumberRent = scanner.nextInt();
                        scanner.nextLine();
                        Person newPerson = new Person(newName, newAge, newPassport, newRoom, newNumberRent);
                        personController.updatePerson(personToUpdate, newPerson);
                    } else {
                        System.out.println("Không tìm thấy người này");
                    }
                    break;
                case 4:

                case 5:
                    case 6:
                    personController.displayPerson();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}

