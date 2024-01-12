package model.room;

public class RoomSup extends RoomStan {
    private String chair = "love chair";

    public RoomSup(int id, String type, double price, String window, String chair) {
        super(id, type, price, window);
        this.chair = chair;
    }

    public RoomSup(String roomType, int roomId, int price, String window, String chair) {
        super("super", 103, 1000000, window);
        this.chair = chair;
    }


    @Override
    public String toString() {
        return "RoomStan{" +
                "roomType='" + getRoomType() + '\'' +
                ", roomId=" + getRoomId() +
                ", price=" + getPrice() +
                ", window " +
                ", love chair " +
                '}';
    }
}
