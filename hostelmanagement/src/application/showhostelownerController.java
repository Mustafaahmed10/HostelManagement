package application;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class showhostelownerController {

    @FXML
    private ListView<String> hostelOwnersListView;

    @FXML
    private void initialize() {
        // Populate the list view with hostel owner data (simulate fetching from database)
        hostelOwnersListView.getItems().addAll("Hostel Owner 1", "Hostel Owner 2", "Hostel Owner 3");
    }

    @FXML
    private void goBack() {
        // Close the current window
        hostelOwnersListView.getScene().getWindow().hide();
    }
}
