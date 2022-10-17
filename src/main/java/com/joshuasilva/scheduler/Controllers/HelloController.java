package com.joshuasilva.scheduler.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onJobButtonClick() {
        // Create job and add to operation
        System.out.println("Job added!");
    }

    @FXML
    protected void onMachineButtonClick() {
        // Create machine and add to operation
        System.out.println("Machine added!");
    }
}