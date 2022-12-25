package com.joshuasilva.scheduler.Controllers;

import com.joshuasilva.scheduler.Models.Machine;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;

import java.io.IOException;

public class ScheduleListCell extends ListCell<Machine> {
    public ScheduleListCell() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ScheduleListCell.fxml"));
            loader.setController(this);
            loader.setRoot(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void updateItem(Machine item, boolean empty) {
        // To be implemented
    }
}
