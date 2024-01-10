package model.room;

public class Room {
    private int bed;
    private String roomId;
    private int roomRates;

    public Room() {
    }

    public Room(int bed, String roomId, int roomRates) {
        this.bed = bed;
        this.roomId = roomId;
        this.roomRates = roomRates;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public int getRoomRates() {
        return roomRates;
    }

    public void setRoomRates(int roomRates) {
        this.roomRates = roomRates;
    }

    @Override
    public String toString() {
        return "Room{" +
                "bed=" + bed +
                ", roomId='" + roomId + '\'' +
                ", roomRates=" + roomRates +
                '}';
    }
}
