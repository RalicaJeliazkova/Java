package singIn;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.jar.Attributes;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import registrators.Email;
import registrators.Password;
import registrators.Phone;
import registrators.UserName;

public class ControllerScene {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCancle;

    @FXML
    private Button btnValidation;

    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtPhoneNumber;

    @FXML
    private TextField txtEmailAddress;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtComfirmPassword;

    @FXML
    private Label LabelName;

    @FXML
    private Label LabelPhone;

    @FXML
    private Label LabelEmail;

    @FXML
    private Label LabelPassword;

    @FXML
    private Label labelComfirmPassword;

    @FXML
    void btnCancleOnAction(ActionEvent event) {
        Platform.exit();

    }
    @FXML
    void btnValidationOnAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        if(!UserName.isValid(txtUserName.getText())){
            LabelName.setText("No, no! Only letters");
        } else if (!Phone.isValid(txtPhoneNumber.getText())){
            LabelPhone.setText("No,no!Format is: (xxxx) (xxxxxxx)");
        }else if (!Password.isValid(txtPassword.getText())) {
            LabelPassword.setText("No,no!At least 1 letters and 7 digits");
        }else if (!Email.isValid(txtEmailAddress.getText())){
            LabelEmail.setText("No,no!Example: a@a.bg");
        }else if(!txtPassword.getText().equals(txtComfirmPassword.getText())){
            labelComfirmPassword.setText("Be careful, the passwords do not match");
        } else if (!UserName.isValid(txtUserName.getText()) || !Phone.isValid(txtPhoneNumber.getText()) || !Password.isValid(txtPassword.getText()) ||
                   !Email.isValid(txtEmailAddress.getText()) || !txtPassword.getText().equals(txtComfirmPassword.getText())) {
            alert.setTitle("ERROR");
            alert.setHeaderText("You do something wrong c(:" );
            alert.setContentText("Press OK to continue");
            alert.showAndWait();
        }else {
            alert.setTitle("Long In");
            alert.setHeaderText("Confirm your registration with the link sent to your email");
            alert.setContentText("Press OK to continue");
            alert.showAndWait();
        }

    }

    @FXML
    void initialize() {
        assert btnCancle != null : "fx:id=\"btnCancle\" was not injected: check your FXML file 'registrationForm.fxml'.";
        assert btnValidation != null : "fx:id=\"btnValidation\" was not injected: check your FXML file 'registrationForm.fxml'.";
        assert txtUserName != null : "fx:id=\"txtUserName\" was not injected: check your FXML file 'registrationForm.fxml'.";
        assert txtPhoneNumber != null : "fx:id=\"txtPhoneNumber\" was not injected: check your FXML file 'registrationForm.fxml'.";
        assert txtEmailAddress != null : "fx:id=\"txtEmailAddress\" was not injected: check your FXML file 'registrationForm.fxml'.";
        assert txtPassword != null : "fx:id=\"txtPassword\" was not injected: check your FXML file 'registrationForm.fxml'.";
        assert txtComfirmPassword != null : "fx:id=\"txtComfirmPassword\" was not injected: check your FXML file 'registrationForm.fxml'.";
        assert LabelName != null : "fx:id=\"LabelName\" was not injected: check your FXML file 'registrationForm.fxml'.";
        assert LabelPhone != null : "fx:id=\"LabelPhone\" was not injected: check your FXML file 'registrationForm.fxml'.";
        assert LabelEmail != null : "fx:id=\"LabelAddress\" was not injected: check your FXML file 'registrationForm.fxml'.";
        assert LabelPassword != null : "fx:id=\"LabelPassword\" was not injected: check your FXML file 'registrationForm.fxml'.";
        assert labelComfirmPassword != null : "fx:id=\"labelComfirmPassword\" was not injected: check your FXML file 'registrationForm.fxml'.";

    }
}
