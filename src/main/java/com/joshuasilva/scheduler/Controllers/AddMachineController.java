package com.joshuasilva.scheduler.Controllers;

import com.joshuasilva.scheduler.Models.Machine;
import com.joshuasilva.scheduler.Models.Model;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class AddMachineController implements Initializable {

    public Button submitButton;

    @FXML
    public TextField nameTextField;
    @FXML
    public TextField modelTextField;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        submitButton.setOnAction(actionEvent -> onSubmit());
    }

    public void onSubmit() {
        Machine machine = new Machine(nameTextField.getText(), modelTextField.getText());
        Model.getInstance().op.machines.add(machine);
        ObservableList<Machine> machines = Model.getInstance().op.machines;
        System.out.println("New " + machines.get(machines.size()-1) + " added!");

        // Close Form
        Stage stage = (Stage) submitButton.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
    }
}