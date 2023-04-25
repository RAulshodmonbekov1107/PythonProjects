package uca.org.javafx.BMICalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class Controller {
    private boolean isEnglish = true;
    @FXML
    private TextField bmiTextField, weightTextField, heightTextField;
    @FXML
    private RadioButton metricRadioBtn, englishRadioBtn;
    @FXML
    private TextField resultTextField;

    @FXML
    private ToggleGroup system;

    @FXML
    void onClick(ActionEvent event) {
        try {
            BigDecimal weight = new BigDecimal(weightTextField.getText());
            BigDecimal height = new BigDecimal(heightTextField.getText()).divide(BigDecimal.valueOf(100));
            BigDecimal bmi = weight.divide(height.pow(2), RoundingMode.HALF_UP);
            if (this.isEnglish) {
                bmi = bmi.multiply(BigDecimal.valueOf(703));
            }
            bmiTextField.setText(bmi.toString());
            if (bmi.compareTo(BigDecimal.valueOf(18.5)) < 0) {
                resultTextField.setText("UnderWeight");
            }
            else if (bmi.compareTo(BigDecimal.valueOf(25)) < 0) {
                resultTextField.setText("Normal");
            } else if (bmi.compareTo(BigDecimal.valueOf(30)) < 0) {
                resultTextField.setText("Overweight");
            } else {
                resultTextField.setText("Obese");
            }
        }
        catch(Exception ex){
            System.out.println("Blyyyyy");
        }
    }

    public void initialize() {
        this.isEnglish = false;
        metricRadioBtn.setSelected(true);
    }

    public void getSystem(ActionEvent event) {
        if (metricRadioBtn.isSelected()) this.isEnglish = true;
        this.isEnglish = false;
    }
}
