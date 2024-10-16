module com.example.masterdyplom {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.masterdyplom to javafx.fxml;
    exports com.example.masterdyplom;
}