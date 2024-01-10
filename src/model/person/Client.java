package model.person;

import model.room.Room;

public class Client extends Person  {
    private int numberDay ;
    private int numberPeople;

    public Client() {
    }

    public Client(int numberDay, int numberPeople) {
        this.numberDay = numberDay;
        this.numberPeople = numberPeople;
    }

    public Client(String name, int age, int passPort, String email, int number, int numberDay, int numberPeople) {
        super(name, age, passPort, email, number);
        this.numberDay = numberDay;
        this.numberPeople = numberPeople;
    }

    public int getNumberDay() {
        return numberDay;
    }

    public void setNumberDay(int numberDay) {
        this.numberDay = numberDay;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }



    @Override
    public String toString() {
        return "Client{" +
                "numberDay=" + numberDay +
                ", numberPeople=" + numberPeople +
                '}';
    }
}
