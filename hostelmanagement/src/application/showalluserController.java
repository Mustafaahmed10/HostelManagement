package application;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class showalluserController {

    @FXML
    private ListView<String> usersListView;

    @FXML
    private void initialize() {
        // Populate the list view with user data (simulate fetching from database)
        usersListView.getItems().addAll("User 1", "User 2", "User 3", "User 4");
    }

    @FXML
    private void goBack() {
        // Close the current window
        usersListView.getScene().getWindow().hide();
    }
}
