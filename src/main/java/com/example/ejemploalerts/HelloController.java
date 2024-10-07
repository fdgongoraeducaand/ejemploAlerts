package com.example.ejemploalerts;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

import java.util.Optional;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label lblResultadoModal;
    @FXML
    private Label lblResultadoBotones;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void onBtnModalSiNo(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmación");
        alert.setHeaderText("Ha ocurrido un error");
        alert.setContentText("¿ Desea intentar volver a conectarse a la red ?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            lblResultadoModal.setText("Resultado del Alert Modal - Aceptar");
        } else {
            lblResultadoModal.setText("Resultado del Alert Modal - Cancelar");
        }

    }


    @FXML
    public void onBtnAdvertencia(ActionEvent actionEvent) {
        // Crear una alerta de tipo error
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Advertencia");
        alert.setHeaderText("Advertencia");
        alert.setContentText("No   se pudo conectar al servidor.");

        // Mostrar la alerta
        alert.showAndWait();
    }

    @FXML
    public void onBtnError(ActionEvent actionEvent) {
        // Crear una alerta de tipo error
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Ha ocurrido un error");
        alert.setContentText("No   se pudo conectar al servidor.");

                // Mostrar la alerta
                alert.showAndWait();
    }

    @FXML
    public void onBtnInformacion(ActionEvent actionEvent) {
        // Crear una alerta de tipo error
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText("Ha ocurrido un error");
        alert.setContentText("No   se pudo conectar al servidor.");

        // Mostrar la alerta
        alert.showAndWait();
    }

    @FXML
    public void onBtnBotonesPersonalizados(ActionEvent actionEvent) {
        // Crear una alerta de confirmación con botones personalizados
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmación");
        alert.setHeaderText("¿Estás seguro?");
        alert.setContentText("Esta    acción no se puede deshacer.");

       // Crear los botones
        ButtonType buttonTypeOne = new ButtonType("Sí");
        ButtonType buttonTypeTwo = new ButtonType("No");
        ButtonType buttonTypeThree = new ButtonType("Cancelar");

        // Agregar los botones a la alerta
        alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeThree);

        // Mostrar la alerta y obtener el botón seleccionado
        ButtonType result = alert.showAndWait().orElse(buttonTypeThree);

        if (result == buttonTypeOne) {
            lblResultadoBotones.setText("Se seleccionó Sí");
        } else if (result == buttonTypeTwo) {
            lblResultadoBotones.setText("Se seleccionó No");
        } else {
            lblResultadoBotones.setText("Se canceló");
        }
    }
}