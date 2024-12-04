package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

public class adminContactsupportController {

    @FXML
    private TextArea supportTextArea;

    @FXML
    private void sendSupportRequest() {
        String message = supportTextArea.getText();

        if (message.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Empty Message");
            alert.setHeaderText("No Message Entered");
            alert.setContentText("Please enter your query or issue.");
            alert.showAndWait();
        } else {
            // Simulate sending support message
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Support Request Sent");
            alert.setHeaderText("Thank You!");
            alert.setContentText("Your support request has been sent successfully.");
            alert.showAndWait();

            // Clear the text area
            supportTextArea.clear();
        }
    }

    @FXML
    private void goBack() {
        // Close the current window
        supportTextArea.getScene().getWindow().hide();
    }
}
