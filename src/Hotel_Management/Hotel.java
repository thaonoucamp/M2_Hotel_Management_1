package Hotel_Management;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Hotel {

    List<Customer> list = new ArrayList<Customer>();
    int LUXURY = 3000;
    int DOUBLE = 2000;
    int SIMPLE = 1000;

    Scanner sc = new Scanner(System.in);

    // 1. CheckIn;
    public void checkIn() {
        System.out.println("Enter the Name: ");
        String name = sc.nextLine();

        System.out.println("Enter the BirtDay: ");
        String birtDay = sc.nextLine();

        System.out.println("Enter the Gen: ");
        String gen = sc.nextLine();

        System.out.println("Enter the Identity: ");
        int id = sc.nextInt();

        System.out.println("Enter the Telephone: ");
        int telephone = sc.nextInt();

        System.out.println("Enter the TypeRoom: ");
        int typeRoom = sc.nextInt();

        System.out.println("Enter the DayCheckIn: ");
        int dayIn = sc.nextInt();

        Customer customer = new Customer(name, birtDay, gen, id, telephone, typeRoom, dayIn);

        list.add(customer);
    }

    // 2. CheckOut;
    public double checkOut() {
        Customer cus = checkIn();
        System.out.println("Enter the DayCheckOut: ");
        int dayOut = sc.nextInt();

        double totalMoney = (dayOut - cus.getDayCheckIn()) * cus.getTypeRoom();
        return totalMoney;
    }

    // 3. Hiển thị Menu;
    public void showMenu() {
        System.out.println("Menu: ");
        System.out.println("1. CheckIn: ");
        System.out.println("2. CheckOut: ");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                checkIn();
                break;
            case 2:
                checkOut();
                break;
        }
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        hotel.showMenu();
    }
}
