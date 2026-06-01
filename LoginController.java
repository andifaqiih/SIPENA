package com.akademik;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private void login() {

        try {

            if(txtUsername.getText().equals("admin")
                    && txtPassword.getText().equals("123")) {

                Stage stage =
                        (Stage) txtUsername.getScene().getWindow();

                FXMLLoader loader = new FXMLLoader(;
                                getClass().getResource(
                                        "/com/akademik/dashboard.fxml"));

                stage.setScene(scene);

            } else {

                Alert alert =
                        new Alert(Alert.AlertType.ERROR);

                alert.setContentText("Login gagal!");
                alert.show();
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}