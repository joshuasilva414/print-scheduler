package com.joshuasilva.scheduler.Controllers;

import com.joshuasilva.scheduler.Models.Machine;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class ScheduleListCellFactory implements Callback<ListView<Machine>, ListCell<Machine>> {
    @Override
    public ListCell<Machine> call(ListView<Machine> param) {
        return new ScheduleListCell();
    }
}