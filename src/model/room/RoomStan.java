package model.room;

public class RoomStan extends Room {
    private String window = "window";

    public RoomStan(int id, String type, double price, String window) {
        super(id, type, price);
        this.window = window;
    }

    public RoomStan(String roomType, int roomId, int price, String window) {
        super("Room Standard", 102, 500000);
        this.window = window;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    @Override
    public String toString() {
        return "RoomStan{" +
                "roomType='" + getRoomType() + '\'' +
                ", roomId=" + getRoomId() +
                ", price=" + getPrice() +
                ", window " +
                '}';
    }
}
