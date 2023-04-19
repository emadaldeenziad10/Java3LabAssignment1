/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author emad
 */
public class LoginPage extends Stage {
    
    public LoginPage() throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Parent parent = loader.load();        
        Scene scene = new Scene(parent);        
        this.setScene(scene);
        this.setTitle("Login");
        this.show();
    }
}
