module com.joshuasilva.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.joshuasilva.javafxdemo to javafx.fxml;
    exports com.joshuasilva.javafxdemo;
}