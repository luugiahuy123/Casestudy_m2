package model.person;

public class Person {
    private String name ;
    private int age;
    private int passPort;

    private String email;
    private int number;

    public Person() {
    }

    public Person(String name, int age, int passPort, String email, int number) {
        this.name = name;
        this.age = age;
        this.passPort = passPort;
        this.email = email;
        this.number = number;
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

    public int getPassPort() {
        return passPort;
    }

    public void setPassPort(int passPort) {
        this.passPort = passPort;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", passPort=" + passPort +
                ", email='" + email + '\'' +
                ", number=" + number +
                '}';
    }
}
