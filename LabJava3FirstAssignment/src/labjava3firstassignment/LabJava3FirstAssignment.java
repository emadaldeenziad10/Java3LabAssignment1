/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labjava3firstassignment;

import Controllers.LoginController;
import Views.ViewManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author emad
 */
public class LabJava3FirstAssignment extends Application{

    /**
     * @param args the command line arguments
     */
 
    @Override
    public void start(Stage stage) throws Exception {
   ViewManager.openLoginPage();
    }
       public static void main(String[] args) {
        launch(args);
    }

}
