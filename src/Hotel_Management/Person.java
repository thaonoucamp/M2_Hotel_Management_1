package Hotel_Management;

public class Person {
    private String name;
    private int birtDay;
    private String identity;

    public Person() {
    }

    public Person(String name, int birtDay, String identity) {
        this.name = name;
        this.birtDay = birtDay;
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirtDay() {
        return birtDay;
    }

    public void setBirtDay(int birtDay) {
        this.birtDay = birtDay;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birtDay=" + birtDay +
                ", identity=" + identity +
                '}';
    }
}
