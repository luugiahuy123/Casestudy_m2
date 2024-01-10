package model.person;

public class Person {
    private String name;
    private int age;
    private String passport;
    private int room;
    private int numberRent;

    public Person()
    {

    }

    public Person(String name, int age, String passport, int room, int numberRent) {
        this.name = name;
        this.age = age;
        this.passport = passport;
        this.room = room;
        this.numberRent = numberRent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getNumberRent() {
        return numberRent;
    }

    public void setNumberRent(int numberRent) {
        this.numberRent = numberRent;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", passport='" + passport + '\'' +
                ", room=" + room +
                ", numberRent=" + numberRent +
                '}';
    }

}
