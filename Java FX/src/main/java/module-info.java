module uca.org.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens uca.org.javafx to javafx.fxml;
    exports uca.org.javafx;

    opens uca.org.javafx.TipCalculator to javafx.fxml;
    exports uca.org.javafx.TipCalculator;
    opens uca.org.javafx.EnhancedTipCalculator to javafx.fxml;
    exports uca.org.javafx.EnhancedTipCalculator;
    opens uca.org.javafx.BMICalculator to javafx.fxml;
    exports uca.org.javafx.BMICalculator;
    opens uca.org.javafx.TargetHeartRateCalculator to javafx.fxml;
    exports uca.org.javafx.TargetHeartRateCalculator;
}