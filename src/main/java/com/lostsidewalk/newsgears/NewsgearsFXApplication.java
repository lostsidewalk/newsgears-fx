package com.lostsidewalk.newsgears;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * NewsgearsFX - Newsgears RSS client, JavaFX edition
 */
public class NewsgearsFXApplication extends Application {

    private static final Logger log = LoggerFactory.getLogger(NewsgearsFXApplication.class);

    @Override
    public final void start(Stage stage) throws IOException {
        log.info("Starting NG-FX");
        FXMLLoader fxmlLoader = new FXMLLoader(NewsgearsFXApplication.class.getResource("newsgears-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("NewsgearsFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
