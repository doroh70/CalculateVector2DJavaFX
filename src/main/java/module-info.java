module com.example.ice2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ice2 to javafx.fxml;
    exports com.example.ice2;
}