package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class HostelOwnerController {

    @FXML
    private void listHostels(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("List Hostels");
        alert.setHeaderText("Displaying All Hostels");
        alert.setContentText("List of all hostels you manage displayed here.");
        alert.showAndWait();
    }

    @FXML
    private void viewListedHostels(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("View Listed Hostels");
        alert.setHeaderText("Hostels Details");
        alert.setContentText("Details of the hostels you have listed are displayed here.");
        alert.showAndWait();
    }

    @FXML
    private void contactSupport(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Contact Support");
        alert.setHeaderText("Support Contact");
        alert.setContentText("Reach out to support for any assistance.");
        alert.showAndWait();
    }

    @FXML
    private void viewEditAccount(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("View/Edit Account");
        alert.setHeaderText("Account Details");
        alert.setContentText("View or edit your account details from here.");
        alert.showAndWait();
    }

    @FXML
    private void deleteAccount(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Delete Account");
        alert.setHeaderText("Account Deletion");
        alert.setContentText("Are you sure you want to delete your account?");
        alert.showAndWait();
    }

    @FXML
    private void updateHostelDetails(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Update Hostel Details");
        alert.setHeaderText("Hostel Details Update");
        alert.setContentText("Update details for your hostels here.");
        alert.showAndWait();
    }

    @FXML
    private void deleteRoom(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Delete Room");
        alert.setHeaderText("Room Deletion");
        alert.setContentText("Room deleted successfully (placeholder functionality).");
        alert.showAndWait();
    }
}
