/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Views.ViewManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author emad
 */
public class SystemPageController extends Stage {

    @FXML
    private TextField txtNIS;

    @FXML
    private TextField txtUSD;

    @FXML
    void LogOut(ActionEvent event) throws Exception {
        ViewManager.openLoginPage();
        ViewManager.closeSystemPage();
    }

    @FXML
    void convert(ActionEvent event) {
        if (!txtNIS.getText().isEmpty()) {
            Double nis = Integer.parseInt(txtNIS.getText()) / 3.60;
            txtUSD.setText(Double.toString(nis));
            txtNIS.setText("");
        } else if (!txtUSD.getText().isEmpty()) {
            Double usd = Integer.parseInt(txtUSD.getText()) * 3.60;
            txtNIS.setText(Double.toString(usd));
            txtUSD.setText("");
        }

    }

}
