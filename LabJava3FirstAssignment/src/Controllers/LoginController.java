/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;
import Views.ViewManager;
import java.util.Optional;
   import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 *
 * @author emad
 */
public class LoginController extends Stage {




    @FXML
    private Label password;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    private Label userName;

    
    
    @FXML
    void Login(ActionEvent event) throws Exception {
if(txtUserName.getText().equals("Emad") && txtPassword.getText().equals("123")){
        ViewManager.openSystemPage();
    ViewManager.closeLoginPage();
    
}else {
    Alert alert = new Alert(AlertType.CONFIRMATION);
    alert.setTitle("Notification");
    alert.setHeaderText("Notification");
    alert.setHeaderText("Data Is Invalid");
    Optional<ButtonType> result = alert.showAndWait();

}
    }

}
 

