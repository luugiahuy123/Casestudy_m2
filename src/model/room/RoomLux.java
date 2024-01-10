package model.room;

public class RoomLux  extends RoomSup{

    private String bathtub = "Bathtub";
    public RoomLux() {
    }

    public RoomLux(int bed, String roomId, int roomRates, String chair, String window, String bathtub) {
        super(bed, roomId, roomRates, chair, window);
        this.bathtub = bathtub;
    }

    @Override
    public String toString() {
        return "Room{" +
                "bed=" + getBed() +
                ", roomId='" + getRoomId() + '\'' +
                ", roomRates=" + getRoomRates() +
                ", Window " + ", bathtub " +",Love chair " +
                '}';
    }
}
