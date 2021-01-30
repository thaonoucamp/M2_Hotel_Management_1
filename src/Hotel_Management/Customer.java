package Hotel_Management;

public class Customer extends Person{
    private int telephone;
    private int typeRoom;
    private int dayCheckIn;

    public Customer() {
    }

    public Customer(int telephone, int typeRoom, int dayCheckIn) {
        this.telephone = telephone;
        this.typeRoom = typeRoom;
        this.dayCheckIn = dayCheckIn;
    }

    public Customer(String name, String birtDay, String gen, int identity, int telephone, int typeRoom, int dayCheckIn) {
        super(name, birtDay, gen, identity);
        this.telephone = telephone;
        this.typeRoom = typeRoom;
        this.dayCheckIn = dayCheckIn;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(int typeRoom) {
        this.typeRoom = typeRoom;
    }

    public int getDayCheckIn() {
        return dayCheckIn;
    }

    public void setDayCheckIn(int dayCheckIn) {
        this.dayCheckIn = dayCheckIn;
    }

    @Override
    public String toString() {
        return super.toString() + "Customer{" +
                "telephone=" + telephone +
                ", typeRoom='" + typeRoom + '\'' +
                ", dayCheckIn='" + dayCheckIn + '\'' +
                '}';
    }
}
