module com.example.todotask {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.todotask to javafx.fxml;
    exports com.example.todotask;
}