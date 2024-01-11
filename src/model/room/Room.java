package model;

public class Room implements HotelEntity {
    private String roomType;
    private int roomId;
    private int price;

    public Room() {
    }

    public Room(String roomType, int roomId, int price) {
        this.roomType = roomType;
        this.roomId = roomId;
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomType='" + roomType + '\'' +
                ", roomId=" + roomId +
                ", price=" + price +
                '}';
    }

    @Override
    public int getID() {
        return roomId;
    }
}
