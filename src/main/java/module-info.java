module org.test.proyectohibernate {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;


    opens org.test.proyectohibernate to javafx.fxml;
    exports org.test.proyectohibernate;
}