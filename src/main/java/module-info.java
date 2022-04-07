module com.example.crushfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.crushfx to javafx.fxml;
    exports com.example.crushfx;
}