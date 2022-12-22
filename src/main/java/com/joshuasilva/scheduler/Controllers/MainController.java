package com.joshuasilva.scheduler.Controllers;

import com.joshuasilva.scheduler.Models.Model;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    public Label welcomeText;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}

    @FXML
    public void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void onJobButtonClick() {
        // Create job and add to operation

        System.out.println("Job added!");
    }

    @FXML
    public void onMachineButtonClick() {
        // Create machine and add to operation
        Model.getInstance().getViewFactory().showAddMachineForm();
    }
}