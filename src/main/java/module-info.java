module com.responsive.responsivepackgradle {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.responsive.pack to javafx.fxml;
    exports com.responsive.pack;
}