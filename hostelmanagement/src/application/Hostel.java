package application;

import java.util.List;

public class Hostel {
    private String name;
    private List<Review> reviews;
    private List<Room> rooms;

    public Hostel(String name, List<Review> reviews, List<Room> rooms) {
        this.name = name;
        this.reviews = reviews;
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
