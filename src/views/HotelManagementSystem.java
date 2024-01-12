package views;

import controller.PersonManager;

import java.util.Scanner;

public class HotelManagementSystem {
    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("----- Hotel Management System Menu -----");
            System.out.println("1. Thêm");
            System.out.println("2. sua");
            System.out.println("3. Xoá Người");
            System.out.println("4. Hiển Thị Danh Sách Người");
            System.out.println("5. Lưu Dữ Liệu Và Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    personManager.addPerson();
                    break;
                case 2:
                    personManager.edit();
                    break;
                case 3:
                    personManager.deletePerson();
                    break;

                case 4:
                    personManager.displayPersons();
                    break;

                case 5:
                    System.out.println("Đã lưu dữ liệu và thoát khỏi chương trình.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }
}