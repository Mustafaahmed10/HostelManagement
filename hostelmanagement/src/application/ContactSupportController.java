package application;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class ContactSupportController {

    @FXML
    private ComboBox<String> issueTypeDropdown;

    @FXML
    private TextArea issueDescription;

    @FXML
    public void initialize() {
        issueTypeDropdown.setItems(FXCollections.observableArrayList("Booking Issue", "Payment Issue", "Account Issue", "Other"));
    }

    @FXML
    private void submitIssue() {
        String issueType = issueTypeDropdown.getValue();
        String description = issueDescription.getText();

        if (issueType != null && !description.isEmpty()) {
            System.out.println("Submitting issue of type " + issueType + " with description: " + description);
            // Logic to save issue in the database or send to support
        } else {
            System.out.println("Please select an issue type and describe your problem.");
        }
    }
}
