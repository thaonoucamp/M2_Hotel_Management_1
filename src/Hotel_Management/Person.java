package Hotel_Management;

public class Person {
    private String name;
    private String birtDay;
    private String gen;
    private int identity;

    public Person() {
    }

    public Person(String name, String birtDay, String gen, int identity) {
        this.name = name;
        this.birtDay = birtDay;
        this.gen = gen;
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birtDay='" + birtDay + '\'' +
                ", gen='" + gen + '\'' +
                ", identity='" + identity + '\'' +
                '}';
    }
}
