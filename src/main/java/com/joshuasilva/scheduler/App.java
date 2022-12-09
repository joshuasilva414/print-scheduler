package com.joshuasilva.scheduler;

import com.joshuasilva.scheduler.Models.Model;
import com.joshuasilva.scheduler.Views.ViewFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        Model.getInstance().getViewFactory().showSplashWindow();
    }

    public static void main(String[] args) {
        launch();
    }
}