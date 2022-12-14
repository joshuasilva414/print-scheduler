module com.joshuasilva.scheduler {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.joshuasilva.scheduler to javafx.fxml;
    exports com.joshuasilva.scheduler;
    exports com.joshuasilva.scheduler.Controllers;
    exports com.joshuasilva.scheduler.Models;
    exports com.joshuasilva.scheduler.Views;
}