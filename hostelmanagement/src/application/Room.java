package application;

public class Room {
    private String roomName;
    private double price;
    private boolean available;

    public Room(String roomName, double price, boolean available) {
        this.roomName = roomName;
        this.price = price;
        this.available = available;
    }

    public String getRoomName() {
        return roomName;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }
}
