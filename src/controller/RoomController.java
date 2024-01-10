package controller;

import model.room.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomController {
    private List<Room> rooms;

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


}
