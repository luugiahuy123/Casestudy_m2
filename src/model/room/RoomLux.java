package model.room;

public class RoomLux extends RoomSup {
    private String bathtub = "bathtub";


    public RoomLux(int id, String type, double price, String window, String chair, String bathtub) {
        super(id, type, price, window, chair);
        this.bathtub = bathtub;
    }

    public RoomLux(String roomType, int roomId, int price, String window, String chair, String bathtub) {
        super(roomType, roomId, price, window, chair);
        this.bathtub = bathtub;
    }

    public String getBathtub() {
        return bathtub;
    }

    public void setBathtub(String bathtub) {
        this.bathtub = bathtub;
    }

    @Override
    public String toString() {
        return "RoomStan{" +
                "roomType='" + getRoomType() + '\'' +
                ", roomId=" + getRoomId() +
                ", price=" + getPrice() +
                ", window " +
                ", love chair " + ",Bathtub " +
                '}';
    }
}
