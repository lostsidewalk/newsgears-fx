/**
 * NewsgearsFX - Newsgears RSS client, JavaFX edition
 */
module com.lostsidewalk.newsgears {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.slf4j;


    opens com.lostsidewalk.newsgears to javafx.fxml;
    exports com.lostsidewalk.newsgears;
}
