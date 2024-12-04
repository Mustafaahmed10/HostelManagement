package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AdminController {

    private Stage stage;
    private Scene scene;

    // Buttons from the FXML file
    @FXML
    private Button showAllUsersButton;

    @FXML
    private Button showAllHostelOwnersButton;

    @FXML
    private Button contactSupportButton;

    @FXML
    private Button managePaymentsButton;

    // Method to load and change scenes
    @SuppressWarnings("unused")
	private void openNewScene(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            AnchorPane root = loader.load();
            scene = new Scene(root);

            if (stage == null) {
                stage = new Stage();
            }

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
    
 // Action for 'Show All Users' button
 private void showAllUsers() {
     try {
         // Load the Show All Users scene (FXML)
         FXMLLoader loader = new FXMLLoader(getClass().getResource("showalluser.fxml"));
         Scene showAllUsersScene = new Scene(loader.load());

         // Create a new window (stage) for Show All Users
         Stage stage = new Stage();
         stage.setTitle("Show All Users");
         stage.setScene(showAllUsersScene);
         stage.show();
     } catch (Exception e) {
         // Handle any loading errors
         e.printStackTrace();
         Alert alert = new Alert(Alert.AlertType.ERROR);
         alert.setTitle("Error");
         alert.setHeaderText("Failed to load Show All Users");
         alert.setContentText("There was an error loading the Show All Users page.");
         alert.showAndWait();
     }
 }

    @FXML
 // Action for 'Show All Hostel Owners' button
 private void showAllHostelOwners() {
     try {
         // Load the Show All Hostel Owners scene (FXML)
         FXMLLoader loader = new FXMLLoader(getClass().getResource("showhostelowner.fxml"));
         Scene showAllHostelOwnersScene = new Scene(loader.load());

         // Create a new window (stage) for Show All Hostel Owners
         Stage stage = new Stage();
         stage.setTitle("Show All Hostel Owners");
         stage.setScene(showAllHostelOwnersScene);
         stage.show();
     } catch (Exception e) {
         // Handle any loading errors
         e.printStackTrace();
         Alert alert = new Alert(Alert.AlertType.ERROR);
         alert.setTitle("Error");
         alert.setHeaderText("Failed to load Show All Hostel Owners");
         alert.setContentText("There was an error loading the Show All Hostel Owners page.");
         alert.showAndWait();
     }
 }


    @FXML
 // Action for 'Contact Support' button
 private void contactSupport() {
     try {
         // Load the Contact Support scene (FXML)
         FXMLLoader loader = new FXMLLoader(getClass().getResource("adminContactsupport.fxml"));
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
 // Action for 'Manage Payments' button
 private void managePayments() {
     try {
         // Load the Manage Payments scene (FXML)
         FXMLLoader loader = new FXMLLoader(getClass().getResource("managepayment.fxml"));
         Scene managePaymentsScene = new Scene(loader.load());

         // Create a new window (stage) for Manage Payments
         Stage stage = new Stage();
         stage.setTitle("Manage Payments");
         stage.setScene(managePaymentsScene);
         stage.show();
     } catch (Exception e) {
         // Handle any loading errors
         e.printStackTrace();
         Alert alert = new Alert(Alert.AlertType.ERROR);
         alert.setTitle("Error");
         alert.setHeaderText("Failed to load Manage Payments");
         alert.setContentText("There was an error loading the Manage Payments page.");
         alert.showAndWait();
     }
 }

}