package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class ViewListedHostelsController {

    @FXML private TextField hostelIDField;
    @FXML private Button viewHostelButton;

    @FXML
    private void viewListedHostels(ActionEvent event) {
        String hostelID = hostelIDField.getText();
        if (hostelID.isEmpty()) {
            showError("Hostel ID", "Please provide a valid hostel ID.");
        } else {
            // Fetch hostel details by ID (Simulating with an alert)
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Hostel Details");
            alert.setHeaderText("Details for Hostel ID: " + hostelID);
            alert.setContentText("Displaying details for the hostel.");
            alert.showAndWait();
        }
    }

    // Helper Method for Error Message
    private void showError(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
