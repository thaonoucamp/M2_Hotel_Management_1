package Hotel_Management;

public class Customer extends Person{
    private int phoneNumber;
    private int daysRent;

    public Customer() {
    }

    public Customer(String name, int identity, String birtDay, String gen) {
        super(name, identity, birtDay, gen);
    }

    public Customer(int phoneNumber, int daysRent) {
        this.phoneNumber = phoneNumber;
        this.daysRent = daysRent;
    }

    public Customer(String name, int identity, String birtDay, String gen, int phoneNumber, int daysRent) {
        super(name, identity, birtDay, gen);
        this.phoneNumber = phoneNumber;
        this.daysRent = daysRent;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getDaysRent() {
        return daysRent;
    }

    public void setDaysRent(int daysRent) {
        this.daysRent = daysRent;
    }

    @Override
    public String toString() {
        return super.toString() + "Customer{" +
                "phoneNumber=" + phoneNumber +
                ", daysRent=" + daysRent +
                '}';
    }
}
