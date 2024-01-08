package com.lostsidewalk.newsgears;

import javafx.fxml.FXML;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * NewsgearsFX - Newsgears RSS client, JavaFX edition
 */
public class NewsgearsFXController {

    private static final Logger log = LoggerFactory.getLogger(NewsgearsFXController.class);

    @FXML
    protected final void onHelloButtonClick() {
        log.info("NewsgearsFX");
    }

    @Override
    public final String toString() {
        return "NewsgearsFXController{" +
                '}';
    }
}
