module com.csusm.navigation.cougarnav {
    requires javafx.controls;
    requires javafx.web;

    opens com.csusm.navigation.cougarnav to javafx.base, javafx.fxml;
}
