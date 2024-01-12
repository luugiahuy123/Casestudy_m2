package model;

public class Person implements HotelEntity {
    private String name;
    private int age;
    private int passport;
    private String kindOfRoom;

    public Person() {
    }

    public Person(String name, int age, int passport, String kindOfRoom) {
        this.name = name;
        this.age = age;
        this.passport = passport;
        this.kindOfRoom = kindOfRoom;
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

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    public String getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", passport=" + passport +
                ", kindOfRoom='" + kindOfRoom + '\'' +
                '}';
    }

    @Override
    public int getID() {
        return passport;
    }
}
