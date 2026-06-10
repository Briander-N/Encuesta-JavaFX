module com.example.encuestajavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.encuestajavafx to javafx.fxml;
    exports com.example.encuestajavafx;
}