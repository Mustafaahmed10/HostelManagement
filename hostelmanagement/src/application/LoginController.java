package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Label errorMessageLabel;

    @FXML
    private Label statusMessageLabel;

    /**
     * Method to handle login button click
     */
    @FXML
    public void handleLogin() {
        String username = usernameField.getText().trim();
        String password = passwordField.getText().trim();

        if (username.isEmpty() || password.isEmpty()) {
            displayStatusMessage("Username or Password cannot be empty!", "red");
            return;
        }

        if (isValidCredentialsAdmin(username, password)) {
            displayStatusMessage("Admin login successful!", "green");
            navigateTo("Admin.fxml", "Admin Dashboard");
        } else if (isValidCredentialsUser(username, password)) {
            displayStatusMessage("User login successful!", "green");
            navigateTo("user.fxml", "Resident Dashboard");
        } else if (isValidCredentialsHostelOwner(username, password)) {
            displayStatusMessage("Hostel Owner login successful!", "green");
            navigateTo("HostelOwner.fxml", "Hostel Owner Dashboard");
        } else {
            displayStatusMessage("Invalid credentials. Please try again.", "red");
        }
    }

    /**
     * Method to navigate to a specific FXML page
     *
     * @param fxmlFile The FXML file to load
     * @param title    The title of the new stage
     */
    private void navigateTo(String fxmlFile, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Scene scene = new Scene(loader.load());

            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle(title);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            displayStatusMessage("Error: Unable to load the requested dashboard.", "red");
        }
    }

    /**
     * Admin credentials validation
     */
    private boolean isValidCredentialsAdmin(String username, String password) {
        return "admin".equalsIgnoreCase(username) && "admin123".equals(password);
    }

    /**
     * User credentials validation
     */
    private boolean isValidCredentialsUser(String username, String password) {
        return "user".equalsIgnoreCase(username) && "user123".equals(password);
    }

    /**
     * Hostel Owner credentials validation
     */
    private boolean isValidCredentialsHostelOwner(String username, String password) {
        return "hostelowner".equalsIgnoreCase(username) && "owner123".equals(password);
    }

    /**
     * Displays a status message on the right-hand side
     *
     * @param message Message text
     * @param color   Message color ("red" for errors, "green" for success)
     */
    private void displayStatusMessage(String message, String color) {
        statusMessageLabel.setText(message);
        statusMessageLabel.setStyle("-fx-text-fill: " + color + ";");
    }
}
