package com.example.ice2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculateVector2DDistanceController {

    @FXML
    private TextField X1;

    @FXML
    private TextField Y1;

    @FXML
    private TextField X2;

    @FXML
    private TextField Y2;

    @FXML
    private TextField ResultTextField;

    @FXML
    void OnCalculateButtonClicked(ActionEvent event) {
        try {


            float x1 = Float.parseFloat(X1.getText());
            float y1 = Float.parseFloat(Y1.getText());
            float x2 = Float.parseFloat(X2.getText());
            float y2 = Float.parseFloat(Y2.getText());

            Vector2D point1 = new Vector2D(x1, y1);
            Vector2D point2 = new Vector2D(x2, y2);

            float distance = Utility.Distance(point1, point2);

            ResultTextField.setText(String.valueOf(distance));
        }
        catch (Exception e){
            ResultTextField.setText("Please enter valid numbers");
        }
    }

    @FXML
    void OnClearButtonClicked(ActionEvent event) {
        X1.clear();
        X2.clear();
        Y1.clear();
        Y2.clear();
        ResultTextField.clear();

        X1.requestFocus();

    }

}

