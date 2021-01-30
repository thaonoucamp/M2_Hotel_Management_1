package Hotel_Management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
    // 1. Lớp khách sạn có thuộc tính là danh sách khách hàng;
    List<Customer> listCustomer = new ArrayList<Customer>();
    // 1.2. Nhập thông tin khách hàng từ bàn phím;
    Scanner sc = new Scanner(System.in);

    // 2.1. Có Hàm hiển thị thông tin KH;
    public void showInfoCustomer(Customer customer) {

    }

    // 2.2 Hàm checkIn;
    public void inputInfoCustomer() {

    }

    // 2.3 Hàm xoá thông tin KH sau khi checkOut;
    public void deleteInfoCustomer() {

    }

    // 2.4 Hàm thêm KH cùng phòng;
    public void addMultiCustomer() {

    }

    // 2.5 Hàm hiển thị tất cả KH đang có trong Hotel;
    public void showListCustomer() {

    }

    // 2.6 Hàm tìm KH bằng CMTND;
    public void findCustomerById() {

    }

    // 2.7 Hàm thanh toán khi KH trả phòng;
    public double totalMoney(String identity) {
        int index = findCustomerById(identity);
        double totalMoney = listCustomer.get(index).getDay() * listCustomer.get(index).getPrice();
        return totalMoney;
    }
}
