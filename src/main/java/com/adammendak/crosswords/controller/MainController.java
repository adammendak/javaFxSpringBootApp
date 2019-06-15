package com.adammendak.crosswords.controller;

import javafx.fxml.FXML;
import javafx.scene.web.WebView;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @FXML
    private WebView myWebView;

    @Value("${my.url}")
    private String myUrl;

    @FXML
    private void initialize() {
        myWebView.getEngine().load(myUrl);
    }

}
