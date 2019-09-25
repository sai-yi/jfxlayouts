module zero.saiyi.layouts {
    requires javafx.controls;
    requires javafx.fxml;

    opens zero.saiyi.layouts to javafx.fxml;
    exports zero.saiyi.layouts;
}