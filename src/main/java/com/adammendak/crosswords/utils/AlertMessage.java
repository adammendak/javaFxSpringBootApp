package com.adammendak.crosswords.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Component;

import java.util.*;


@Component
public class AlertMessage {

    public static void show(Alert.AlertType type, String title, String message) {
        show(type, title, message, Collections.emptyList());
    }

    public static void show(Alert.AlertType type, String title, String message, List<ButtonType> buttonTypes) {
        Alert alert = new Alert(type);
        alert.setContentText(message);

        if(CollectionUtils.isNotEmpty(buttonTypes)) {
            alert.getDialogPane().getButtonTypes().addAll(buttonTypes);
        }

        if(title != null) {
            alert.setHeaderText(title);
            alert.setTitle(type.name());
            Optional<ButtonType> result = alert.showAndWait();
        } else {
            alert.setHeaderText(null);
            alert.showAndWait();
        }
    }

}
