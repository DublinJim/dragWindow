module com.example.dragwindow {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dragwindow to javafx.fxml;
    exports com.example.dragwindow;
}