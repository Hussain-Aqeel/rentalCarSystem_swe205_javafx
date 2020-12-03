package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Label signupBtn;

    @FXML
    private Label loginPageText;

    @FXML
    private Label btnCustomer;

    @FXML
    private Label btnManager;

    @FXML
    private Label btnEmployee;

    @FXML
    private Button btnAdmin;

    @FXML
    private Pane pn1Customer;

    @FXML
    private Pane pn1Manager;

    @FXML
    private Pane pn1Employee;

    @FXML
    private Pane pn1Admin;

    @FXML
    private Pane pn1Signup;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnCustomer.setStyle("-fx-border-style: hidden hidden solid hidden; -fx-border-width: 3; -fx-border-color: #111975; -fx-padding: 0 0 8 0;");
        btnManager.setStyle("-fx-border-style: none;");
        btnEmployee.setStyle("-fx-border-style: none;");

        pn1Admin.setVisible(false);
        pn1Manager.setVisible(false);
        pn1Employee.setVisible(false);
        pn1Signup.setVisible(false);
        pn1Customer.setVisible(true);
    }

    // Start page buttons clicks handling
    public void handleClicks(MouseEvent actionEvent) {
        if (actionEvent.getSource() == btnCustomer) {
            btnCustomer.setStyle("-fx-border-style: hidden hidden solid hidden; -fx-border-width: 3; -fx-border-color: #111975; -fx-padding: 0 0 8 0;");
            btnManager.setStyle("-fx-border-style: none;");
            btnEmployee.setStyle("-fx-border-style: none;");

            loginPageText.setText("Sign In");

            showCustomerForm();
        }
        if (actionEvent.getSource() == btnManager) {
            btnManager.setStyle("-fx-border-style: hidden hidden solid hidden; -fx-border-width: 3; -fx-border-color: #111975; -fx-padding: 0 0 8 0;");
            btnCustomer.setStyle("-fx-border-style: none;");
            btnEmployee.setStyle("-fx-border-style: none;");

            loginPageText.setText("Sign In");

            showManagerForm();
        }
        if (actionEvent.getSource() == btnEmployee) {
            btnEmployee.setStyle("-fx-border-style: hidden hidden solid hidden; -fx-border-width: 3; -fx-border-color: #111975; -fx-padding: 0 0 8 0;");
            btnCustomer.setStyle("-fx-border-style: none;");
            btnManager.setStyle("-fx-border-style: none;");

            loginPageText.setText("Sign In");

            showEmployeeForm();
        }
        if(actionEvent.getSource()== btnAdmin)
        {
            btnCustomer.setStyle("-fx-border-style: none;");
            btnManager.setStyle("-fx-border-style: none;");
            btnEmployee.setStyle("-fx-border-style: none;");

            loginPageText.setText("Login as Admin");

            showAdminForm();
        }
        if(actionEvent.getSource()== signupBtn)
        {
            btnCustomer.setStyle("-fx-border-style: none;");
            btnManager.setStyle("-fx-border-style: none;");
            btnEmployee.setStyle("-fx-border-style: none;");

            loginPageText.setText("Sign Up");

            showSignupForm();
        }
    }

    // these methods for transition between pages
    public void showCustomerForm() {
        pn1Admin.setVisible(false);
        pn1Manager.setVisible(false);
        pn1Employee.setVisible(false);
        pn1Signup.setVisible(false);
        pn1Customer.setVisible(true);
    }

    public void showManagerForm() {
        pn1Admin.setVisible(false);
        pn1Manager.setVisible(true);
        pn1Employee.setVisible(false);
        pn1Signup.setVisible(false);
        pn1Customer.setVisible(false);
    }

    public void showEmployeeForm() {
        pn1Admin.setVisible(false);
        pn1Manager.setVisible(false);
        pn1Employee.setVisible(true);
        pn1Signup.setVisible(false);
        pn1Customer.setVisible(false);
    }

    public void showAdminForm() {
        pn1Admin.setVisible(true);
        pn1Manager.setVisible(false);
        pn1Employee.setVisible(false);
        pn1Signup.setVisible(false);
        pn1Customer.setVisible(false);
    }

    public void showSignupForm() {
        pn1Admin.setVisible(false);
        pn1Manager.setVisible(false);
        pn1Employee.setVisible(false);
        pn1Customer.setVisible(false);
        pn1Signup.setVisible(true);
    }

    // these methods to load and enter to the dashboard (login after authentication)
    public void loadCustomer(MouseEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../UI/customer.fxml"));
        Scene CustomerScene = new Scene(parent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(CustomerScene);
        window.show();
    }

    public void loadManager(MouseEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../UI/manager.fxml"));
        Scene managerScene = new Scene(parent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(managerScene);
        window.show();
    }

    public void loadEmployee(MouseEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../UI/employee.fxml"));
        Scene employeeScene = new Scene(parent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(employeeScene);
        window.show();
    }

    public void loadAdmin(MouseEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../UI/admin.fxml"));
        Scene adminScene = new Scene(parent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(adminScene);
        window.show();
    }

}
