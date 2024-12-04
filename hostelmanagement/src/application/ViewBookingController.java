package application;

import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ListView;

public class ViewBookingController {

    @FXML
    private ListView<String> bookingListView; // Assuming you are displaying booking details as Strings

    // This method is triggered when the user clicks on "View Details" button
    @FXML
    private void viewBookingDetails() {
        try {
            // Example: Show an alert or navigate to another scene with detailed booking information
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("View Booking Details");
            alert.setHeaderText("Details for the selected booking");
            alert.setContentText("Here you can view the details for the selected booking.");
            alert.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
            showError("Failed to load Booking Details");
        }
    }

    // This method is triggered when the user clicks on "Cancel Booking" button
    @FXML
    private void cancelBooking() {
        try {
            // Example: Logic to cancel a booking (could include confirmation)
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Cancel Booking");
            alert.setHeaderText("Are you sure you want to cancel the booking?");
            alert.setContentText("This action cannot be undone.");
            alert.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
            showError("Failed to cancel the booking");
        }
    }

    // This method is triggered when the user clicks on the "Back" button
    @FXML
    private void goBack() {
        try {
            // Example: Go back to the previous scene (user dashboard, for example)
            // This logic should be implemented based on how you handle scene transitions
        } catch (Exception e) {
            e.printStackTrace();
            showError("Failed to go back");
        }
    }

    // This method helps populate the ListView with the list of bookings
    public void setBookingList(List<String> bookings) {
        bookingListView.getItems().clear();
        bookingListView.getItems().addAll(bookings);
    }

    // Helper method to show an error message
    private void showError(String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("An error occurred");
        alert.setContentText(message);
        alert.showAndWait();
    }
}
