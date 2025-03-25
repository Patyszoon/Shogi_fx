module com.example.shogi_fx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    exports Myapp to javafx.graphics;
    opens Myapp to javafx.fxml;
    //exports com.example.shogi_fx;
}