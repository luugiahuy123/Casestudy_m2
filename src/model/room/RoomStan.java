package model.room;

public class RoomStan extends Room {

    private String chair = "Love chair";
    public RoomStan() {
    }

    public RoomStan(int bed, String roomId, int roomRates, String chair) {
        super(bed, roomId, roomRates);
        this.chair = chair;
    }

    @Override
    public String toString() {
        return "Room{" +
                "bed=" + getBed() +
                ", roomId='" + getRoomId() + '\'' +
                ", roomRates=" + getRoomRates() +
                ",Love chair " +
                '}';
    }
}
