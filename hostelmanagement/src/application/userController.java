package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class userController {

    private Stage stage;
    private Scene scene;

    // Method to load and change scenes
    @SuppressWarnings("unused")
	private void openNewScene(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            AnchorPane root = loader.load();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Scene Loading Error");
            alert.setContentText("There was an error loading the new scene.");
            alert.showAndWait();
        }
    }
    @FXML
    // Action for 'Search Hostels' button
    private void searchHostels() {
        try {
            // Load the Search Hostels scene (FXML)
            FXMLLoader loader = new FXMLLoader(getClass().getResource("searchhostels.fxml"));
            Scene searchHostelsScene = new Scene(loader.load());

            // Create a new window (stage) for Search Hostels
            Stage stage = new Stage();
            stage.setTitle("Search Hostels");
            stage.setScene(searchHostelsScene);
            stage.show();
        } catch (Exception e) {
            // Handle any loading errors
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Failed to load Search Hostels");
            alert.setContentText("There was an error loading the Search Hostels page.");
            alert.showAndWait();
        }
    
        
    }
    // Action for 'View Bookings' button
    @FXML
    
 // Action for 'View Booking' button
 private void viewBooking() {
     try {
         // Load the View Booking scene (FXML)
         FXMLLoader loader = new FXMLLoader(getClass().getResource("viewbookings.fxml"));
         Scene viewBookingScene = new Scene(loader.load());

         // Create a new window (stage) for View Booking
         Stage stage = new Stage();
         stage.setTitle("View Booking");
         stage.setScene(viewBookingScene);
         stage.show();
     } catch (Exception e) {
         // Handle any loading errors
         e.printStackTrace();
         Alert alert = new Alert(Alert.AlertType.ERROR);
         alert.setTitle("Error");
         alert.setHeaderText("Failed to load View Booking");
         alert.setContentText("There was an error loading the View Booking page.");
         alert.showAndWait();
     }
 }

    // Action for 'Write Review' button
    @FXML
 // Action for 'Write Review' button
    private void writeReview() {
        try {
            // Load the Write Review scene (FXML)
            FXMLLoader loader = new FXMLLoader(getClass().getResource("writereview.fxml"));
            Scene writeReviewScene = new Scene(loader.load());

            // Create a new window (stage) for Write Review
            Stage stage = new Stage();
            stage.setTitle("Write Review");
            stage.setScene(writeReviewScene);
            stage.show();
        } catch (Exception e) {
            // Handle any loading errors
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Failed to load Write Review");
            alert.setContentText("There was an error loading the Write Review page.");
            alert.showAndWait();
        }
    }


    @FXML
    private void contactSupport() {
        try {
            // Load the Contact Support scene (FXML)
            FXMLLoader loader = new FXMLLoader(getClass().getResource("contactSupport.fxml"));
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

    // Action for 'View/Edit Account' button
    @FXML
 // Action for 'View/Edit Account' button
    private void viewEditAccount() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Viewedit.fxml"));
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

    // Action for 'Delete Review' button
    @FXML
    private void deleteReview(ActionEvent event) {
        // Example Action: Just showing an alert
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Delete Review");
        alert.setHeaderText("Review Deletion");
        alert.setContentText("Your review has been deleted successfully.");
        alert.showAndWait();
    }

    // Action for 'Delete Account' button
    @FXML
    private void deleteAccount(ActionEvent event) {
        // Example Action: Just showing an alert
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Delete Account");
        alert.setHeaderText("Account Deletion");
        alert.setContentText("Are you sure you want to delete your account?");
        alert.showAndWait();
    }

    // Method to initialize the stage (can be used for setting the current scene)
    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
