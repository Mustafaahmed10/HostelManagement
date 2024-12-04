package application;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class ManagePaymentsController {

    @FXML
    private ListView<String> paymentsListView;

    @FXML
    private void initialize() {
        // Populate the list view with payment data (simulate fetching from database)
        paymentsListView.getItems().addAll("Payment 1: $100", "Payment 2: $200", "Payment 3: $300");
    }

    @FXML
    private void goBack() {
        // Close the current window
        paymentsListView.getScene().getWindow().hide();
    }
}
