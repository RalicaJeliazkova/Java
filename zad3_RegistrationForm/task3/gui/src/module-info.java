module gui {
    requires javafx.fxml;
    requires javafx.controls;

    opens singIn to javafx.fxml;
    exports singIn to javafx.graphics;

    requires registration;
}