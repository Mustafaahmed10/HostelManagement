package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class WriteReviewController {

    @FXML
    private TextField nameField;

    @FXML
    private TextArea reviewArea;

    // Method to handle submitting the review
    @FXML
    private void submitReview() {
        String name = nameField.getText().trim();
        String review = reviewArea.getText().trim();

        if (name.isEmpty() || review.isEmpty()) {
            // Show error if fields are empty
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Missing Information");
            alert.setContentText("Please fill in both the name and review fields.");
            alert.showAndWait();
        } else {
            // Save or process the review (add database or file handling here)
            System.out.println("Review submitted:");
            System.out.println("Name: " + name);
            System.out.println("Review: " + review);

            // Show success message
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText("Review Submitted");
            alert.setContentText("Thank you for your review!");
            alert.showAndWait();

            // Clear fields
            nameField.clear();
            reviewArea.clear();
        }
    }

    // Method to handle going back
    @FXML
    private void goBack() {
        // Close the current window
        Stage stage = (Stage) nameField.getScene().getWindow();
        stage.close();
    }
}
