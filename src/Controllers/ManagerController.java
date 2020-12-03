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

public class ManagerController implements Initializable {

    @FXML
    private VBox pnItems = null;

    @FXML
    private Button btnOverview;

    @FXML
    private Button btnCustomers;

    @FXML
    private Button btnCars;

    @FXML
    private Button btnBlacklist;

    @FXML
    private Button btnInfo;

    @FXML
    private Button btnSignout;

    @FXML
    private Pane panelCustomers;

    @FXML
    private Pane panelCars;

    @FXML
    private Pane panelOverview;

    @FXML
    private Pane panelBlacklist;

    @FXML
    private Pane panelAccountInfo;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Adding elements to a specific list
        Node[] nodes = new Node[10];
        for (int i = 0; i < nodes.length; i++) {
            try {

                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("../UI/managersItem.fxml"));

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


    public void handleClicks(ActionEvent actionEvent) throws IOException {
        if (actionEvent.getSource() == btnOverview) {
            showOverview();
        }
        if (actionEvent.getSource() == btnCustomers) {
            showCustomers();
        }
        if (actionEvent.getSource() == btnCars) {
            showCars();
        }
        if (actionEvent.getSource() == btnBlacklist) {
            showBlacklist();
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
        panelCustomers.setVisible(false);
        panelCars.setVisible(false);
        panelBlacklist.setVisible(false);
        panelAccountInfo.setVisible(false);
    }

    public void showCustomers() {
        panelOverview.setVisible(false);
        panelCustomers.setVisible(true);
        panelCars.setVisible(false);
        panelBlacklist.setVisible(false);
        panelAccountInfo.setVisible(false);
    }

    public void showCars() {
        panelOverview.setVisible(false);
        panelCustomers.setVisible(false);
        panelCars.setVisible(true);
        panelBlacklist.setVisible(false);
        panelAccountInfo.setVisible(false);
    }

    public void showBlacklist() {
        panelOverview.setVisible(false);
        panelCustomers.setVisible(false);
        panelCars.setVisible(false);
        panelBlacklist.setVisible(true);
        panelAccountInfo.setVisible(false);
    }

    public void showAccountInfo() {
        panelOverview.setVisible(false);
        panelCustomers.setVisible(false);
        panelCars.setVisible(false);
        panelBlacklist.setVisible(false);
        panelAccountInfo.setVisible(true);
    }

}
