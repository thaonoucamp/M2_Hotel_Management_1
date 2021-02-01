package Hotel_Management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
    List<Room> rooms = new ArrayList<Room>();
    Scanner sc = new Scanner(System.in);

    public void checkIn() {
        System.out.println("Enter the Name: ");
        String name = sc.nextLine();

        System.out.println("Enter the Identity: ");
        int id = sc.nextInt();

        System.out.println("Enter the BirtDay:");
        String birtDay = sc.nextLine();

        System.out.println("Enter the Gen: ");
        String gen = sc.nextLine();

        System.out.println("Enter the PhoneNumber: ");
        int phoneNumber = sc.nextInt();

        System.out.println("Enter the DaysRent: ");
        int daysRent = sc.nextInt();
    }

    public void showInfoCus() {

    }

    public void checkOut() {

    }
}
