module com.example.java_razmik_arutinovi {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.java_razmik_arutinovi to javafx.fxml;
    exports com.example.java_razmik_arutinovi;
}