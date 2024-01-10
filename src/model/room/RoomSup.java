package model.room;

public class RoomSup extends RoomStan {

    private String window = "window";

    public RoomSup() {
    }

    public RoomSup(int bed, String roomId, int roomRates, String chair, String window) {
        super(bed, roomId, roomRates, chair);
        this.window = window;
    }

    @Override
    public String toString() {
        return "Room{" +
                "bed=" + getBed() +
                ", roomId='" + getRoomId() + '\'' +
                ", roomRates=" + getRoomRates() +
                ", Window " +",Love chair " +
                '}';
    }
}
