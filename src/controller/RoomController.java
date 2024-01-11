package controller;
import model.room.Room;
import java.util.ArrayList;
import java.util.List;
import java.io.*;


public class RoomController {
    private List<Room> rooms;
    static String FILE_PATH = "room.txt";


    public RoomController() {
        rooms = new ArrayList<>();
    }

    public void add(Room room) {
        this.rooms.add(room);
    }

    public void delete(Room room) {
        rooms.remove(room);
    }
    public void updateRoom(Room oldRoom, Room newRoom) {
        int index = rooms.indexOf(oldRoom);
        if (index != -1) {
            rooms.set(index, newRoom);
        }
    }
    public void writeDataToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(rooms);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readDataFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            rooms = (List<Room>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
