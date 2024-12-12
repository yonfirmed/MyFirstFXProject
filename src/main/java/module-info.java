module org.example.myfirstfxproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.example.myfirstfxproject to javafx.fxml;
    exports org.example.myfirstfxproject;
}