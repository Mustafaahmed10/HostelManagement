package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

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
    private void contactSupport() {
        try {
            // Load the Contact Support scene (FXML)
            FXMLLoader loader = new FXMLLoader(getClass().getResource("contactSupport2.fxml"));
            Scene contactSupportScene = new Scene(loader.load());
            
            // Create a new window (stage) for Contact Support
            Stage stage = new Stage();
            stage.setTitle("Contact Support");
            stage.setScene(contactSupportScene);
            stage.show();
        } catch (Exception e) {
            // Handle any loading errors
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Failed to load Contact Support");
            alert.setContentText("There was an error loading the Contact Support page.");
            alert.showAndWait();
        }
        }
    @FXML
    
 // Action for 'View/Edit Account' button
    private void viewEditAccount() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ownerViewedit.fxml"));
            Scene viewEditAccountScene = new Scene(loader.load());

            Stage stage = new Stage();
            stage.setTitle("View/Edit Account");
            stage.setScene(viewEditAccountScene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Failed to load View/Edit Account");
            alert.setContentText("There was an error loading the View/Edit Account page.");
            alert.showAndWait();
        }
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
