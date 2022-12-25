package com.joshuasilva.scheduler.Controllers;

import com.joshuasilva.scheduler.Models.Machine;
import com.joshuasilva.scheduler.Models.Model;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {

    @FXML
    private ListView<Machine> machineListView;
    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {
        machineListView.setCellFactory(new ScheduleListCellFactory());
        machineListView.setItems(Model.getInstance().op.machines);
    }
}