package Hotel_Management;

public class Room {
    private int LUXURY = 3000;
    private int DOUBLE = 2000;
    private int SINGLE = 1000;
    private Person person;

    public Room() {
    }

    public Room(int LUXURY, int DOUBLE, int SINGLE, Person person) {
        this.LUXURY = LUXURY;
        this.DOUBLE = DOUBLE;
        this.SINGLE = SINGLE;
        this.person = person;
    }

    public int getLUXURY() {
        return LUXURY;
    }

    public void setLUXURY(int LUXURY) {
        this.LUXURY = LUXURY;
    }

    public int getDOUBLE() {
        return DOUBLE;
    }

    public void setDOUBLE(int DOUBLE) {
        this.DOUBLE = DOUBLE;
    }

    public int getSINGLE() {
        return SINGLE;
    }

    public void setSINGLE(int SINGLE) {
        this.SINGLE = SINGLE;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
