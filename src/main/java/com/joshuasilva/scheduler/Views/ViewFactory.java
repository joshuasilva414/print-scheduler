package com.joshuasilva.scheduler.Views;

import com.joshuasilva.scheduler.App;
import com.joshuasilva.scheduler.Controllers.AddMachineController;
import com.joshuasilva.scheduler.Controllers.ClientController;
import com.joshuasilva.scheduler.Controllers.SplashController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.lang.reflect.Executable;

public class ViewFactory {

    private AnchorPane dashboardView;
    public ViewFactory() {}

    public void showSplashWindow() {
        FXMLLoader loader = new FXMLLoader(App.class.getResource("Fxml/Splash.fxml"));
        SplashController splashController = new SplashController();
        loader.setController(splashController);
        createStage(loader);
    }

    public void showClientWindow() {
        FXMLLoader loader = new FXMLLoader(App.class.getResource("Fxml/Client.fxml"));
        ClientController clientController = new ClientController();
        loader.setController(clientController);
        createStage(loader);
    }

    public void showAddMachineForm() {
        FXMLLoader loader = new FXMLLoader(App.class.getResource("Fxml/AddMachineForm.fxml"));
        AddMachineController addMachineController = new AddMachineController();
        loader.setController(addMachineController);
        createStage(loader);
    }

    public AnchorPane getDashboardView() {
        if (dashboardView == null) {
            try {
                dashboardView = new FXMLLoader(App.class.getResource("Fxml/Dashboard.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return dashboardView;
    }

    private void createStage(FXMLLoader loader) {
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Scheduler");
        stage.show();
    }

    public void closeStage(Stage stage) {
        stage.close();
    }
}
