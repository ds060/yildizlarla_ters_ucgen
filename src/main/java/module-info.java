module com.example.yildizlarla_ters_ucgen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.yildizlarla_ters_ucgen to javafx.fxml;
    exports com.example.yildizlarla_ters_ucgen;
}