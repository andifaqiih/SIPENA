module com.akademik {

    requires javafx.controls;
    requires javafx.fxml;

    opens com.akademik to javafx.fxml;

    exports com.akademik;
}