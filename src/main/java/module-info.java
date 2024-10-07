module com.example.ejemploalerts {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejemploalerts to javafx.fxml;
    exports com.example.ejemploalerts;
}