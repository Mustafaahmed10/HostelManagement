package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class ViewEditAccountController {

    @FXML
    private TextField fullNameField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField phoneField;

    @FXML
    private TextField passwordField;

    // Action to update account details
    @FXML
    private void updateAccount() {
        String fullName = fullNameField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String password = passwordField.getText();

        // Perform validation (simple example)
        if (fullName.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Validation Error");
            alert.setHeaderText("Incomplete Information");
            alert.setContentText("All fields are required. Please fill them out.");
            alert.showAndWait();
            return;
        }

        // Perform update logic here (e.g., update in database)
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText("Account Updated");
        alert.setContentText("Your account details have been successfully updated.");
        alert.showAndWait();
    }

    // Action to reset fields to default values
    @FXML
    private void resetFields() {
        fullNameField.clear();
        emailField.clear();
        phoneField.clear();
        passwordField.clear();
    }

    // Action to go back to the previous page
    @FXML
    private void goBack() {
        // Logic to close the current window or navigate back
        fullNameField.getScene().getWindow().hide(); // Close the current stage
    }

    // Method to initialize the fields with user data
    @FXML
    private void initialize() {
        // Simulated data load, replace with actual user data retrieval
        fullNameField.setText("John Doe");
        emailField.setText("johndoe@example.com");
        phoneField.setText("1234567890");
        passwordField.setText("password123");
    }
}
