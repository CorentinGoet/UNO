module com.example.projetconceptionlogicielle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetconceptionlogicielle to javafx.fxml;
    exports com.example.projetconceptionlogicielle;
}