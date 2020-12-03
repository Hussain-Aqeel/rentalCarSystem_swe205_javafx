package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CustomerController implements Initializable {

    @FXML
    private VBox pnItems = null;
    @FXML
    private Button btnOverview;

    @FXML
    private Button btnCars;

    @FXML
    private Button btnInfo;

    @FXML
    private Button btnSignout;

    @FXML
    private Pane panelCars;

    @FXML
    private Pane panelAccountInfo;

    @FXML
    private Pane panelOverview;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Adding elements to a specific list
        Node[] nodes = new Node[3];
        for (int i = 0; i < nodes.length; i++) {
            try {

                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("../UI/customerItem.fxml"));

                //give the items some effect

                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #0A0E3F");
                });
                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color : #02030A");
                });
                pnItems.getChildren().add(nodes[i]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    // menu buttons clicks handling
    public void handleClicks(ActionEvent actionEvent) throws IOException {
        if (actionEvent.getSource() == btnOverview) {
            showOverview();
        }
        if (actionEvent.getSource() == btnCars) {
            showCars();
        }
        if (actionEvent.getSource() == btnInfo) {
            showAccountInfo();
        }
        if(actionEvent.getSource() == btnSignout)
        {
            Parent parent = FXMLLoader.load(getClass().getResource("../UI/login.fxml"));
            Scene signoutScene = new Scene(parent);
            Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

            window.setScene(signoutScene);
            window.show();
        }
    }

    // these methods for transition between pages
    public void showOverview() {
        panelOverview.setVisible(true);
        panelAccountInfo.setVisible(false);
        panelCars.setVisible(false);
    }

    public void showCars() {
        panelCars.setVisible(true);
        panelOverview.setVisible(false);
        panelAccountInfo.setVisible(false);
    }

    public void showAccountInfo() {
        panelAccountInfo.setVisible(true);
        panelOverview.setVisible(false);
        panelCars.setVisible(false);
    }
}
