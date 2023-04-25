package uca.org.javafx.TargetHeartRateCalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.math.BigDecimal;

public class Controller {

    @FXML
    private TextField ageTextInputField;

    @FXML
    private Label resultLabel;

    @FXML
    void onClick(ActionEvent event) {
        try {
            BigDecimal age = new BigDecimal(ageTextInputField.getText());
            BigDecimal max = new BigDecimal(220).subtract(age);
            resultLabel.setText(max.multiply(BigDecimal.valueOf(0.5)).toString() + "-" + max.multiply(BigDecimal.valueOf(0.85)).toString());
        } catch (Exception e) {
            ageTextInputField.setText("Enter your age:");
            ageTextInputField.selectAll();
            ageTextInputField.requestFocus();
        }
    }

}
