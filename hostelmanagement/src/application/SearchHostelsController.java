package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.Alert.AlertType;

import java.util.List;

public class SearchHostelsController {
    
    @FXML
    private ListView<String> hostelListView;
    
    // Assuming we have some predefined list of hostels for now
    private List<Hostel> hostels;
    private Hostel selectedHostel;

    public SearchHostelsController() {
        // Simulating a list of hostels (this would come from your actual data)
        this.hostels = List.of(
            new Hostel("Hostel A", List.of(new Review("Great place!")), List.of(new Room("101", 50, true), new Room("102", 60, true))),
            new Hostel("Hostel B", List.of(new Review("Not bad!")), List.of(new Room("201", 40, true), new Room("202", 70, true)))
        );
    }

    @FXML
    private void initialize() {
        // Initialize the hostel list view with hostel names
        hostelListView.getItems().clear();
        for (Hostel hostel : hostels) {
            hostelListView.getItems().add(hostel.getName());
        }
    }

    @FXML
    private void viewReviews() {
        int selectedIndex = hostelListView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            selectedHostel = hostels.get(selectedIndex);
            List<Review> reviews = selectedHostel.getReviews();
            
            if (reviews.isEmpty()) {
                showAlert("No reviews available for this hostel.");
            } else {
                StringBuilder reviewList = new StringBuilder("Reviews for " + selectedHostel.getName() + ":\n");
                for (Review review : reviews) {
                    reviewList.append(review.toString()).append("\n");
                }
                showAlert(reviewList.toString());
            }
        } else {
            showAlert("Please select a hostel first.");
        }
    }

    @FXML
    private void viewRooms() {
        int selectedIndex = hostelListView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            selectedHostel = hostels.get(selectedIndex);
            List<Room> rooms = selectedHostel.getRooms();
            
            StringBuilder roomList = new StringBuilder("Available Rooms in " + selectedHostel.getName() + ":\n");
            for (Room room : rooms) {
                if (room.isAvailable()) {
                    roomList.append(room.getRoomName()).append(" - $").append(room.getPrice()).append("\n");
                }
            }
            showAlert(roomList.toString());
        } else {
            showAlert("Please select a hostel first.");
        }
    }

    @FXML
    private void bookRoom() {
        int selectedIndex = hostelListView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            selectedHostel = hostels.get(selectedIndex);
            @SuppressWarnings("unused")
			List<Room> rooms = selectedHostel.getRooms();
            
            // Here we would handle booking logic (like selecting a room, entering dates, etc.)
            // For now, we simulate that the room is available and a booking is successful.
            showAlert("Booking successful at " + selectedHostel.getName());
        } else {
            showAlert("Please select a hostel first.");
        }
    }

    @FXML
    private void goBack() {
        // Logic to navigate back to the previous screen (e.g., user dashboard)
    }

    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
