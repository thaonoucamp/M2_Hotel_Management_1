package Hotel_Management;

public class Person {
    private String name;
    private int identity;
    private String birtDay;
    private String gen;

    public Person() {
    }

    public Person(String name, int identity, String birtDay, String gen) {
        this.name = name;
        this.identity = identity;
        this.birtDay = birtDay;
        this.gen = gen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public String getBirtDay() {
        return birtDay;
    }

    public void setBirtDay(String birtDay) {
        this.birtDay = birtDay;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", identity=" + identity +
                ", birtDay='" + birtDay + '\'' +
                ", gen='" + gen + '\'' +
                '}';
    }
}
