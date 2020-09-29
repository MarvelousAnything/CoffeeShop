module com.thearchermancoding {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.thearchermancoding to javafx.fxml;
    exports com.thearchermancoding;
}