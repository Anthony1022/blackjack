module dev.niss {
    requires javafx.controls;
    requires javafx.fxml;
    requires core.fx;

    opens dev.niss to javafx.fxml;

    exports dev.niss;
}
