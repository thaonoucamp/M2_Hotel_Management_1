package Hotel_Management;

public class Customer extends Person{
    private int day;
    private String typeRoom;
    private double price;

    public Customer() {
    }

    public Customer(int day, String typeRoom, double price) {
        this.day = day;
        this.typeRoom = typeRoom;
        this.price = price;
    }

    public Customer(String name, int birtDay, int identity, int day, String typeRoom, double price) {
        super(name, birtDay, identity);
        this.day = day;
        this.typeRoom = typeRoom;
        this.price = price;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
