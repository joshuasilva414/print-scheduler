package com.joshuasilva.scheduler.Controllers;

import com.joshuasilva.scheduler.Models.Model;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class SplashController implements Initializable {

    public Button startButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        startButton.setOnAction(actionEvent -> onLogin());
    }

    private void onLogin() {
        Stage stage = (Stage) startButton.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showClientWindow();
    }
}
