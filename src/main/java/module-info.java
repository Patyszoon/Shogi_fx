module com.example.shogi_fx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.shogi_fx to javafx.fxml;
    exports com.example.shogi_fx;
}