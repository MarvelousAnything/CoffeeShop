module com.thearchermancoding {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;

    opens com.thearchermancoding to javafx.fxml;
    exports com.thearchermancoding;
}