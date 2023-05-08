package bsu.comp152;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField display;

    private int firstNumber;

    public void clearClicked(ActionEvent actionEvent) {
        display.setText("");
    }

    public void numberClicked(ActionEvent actionEvent) {
        var buttonPressed = (Button) actionEvent.getSource();
        var newNumber = buttonPressed.getText();
        var oldNumber = display.getText();
        var newDisplayNumber = oldNumber + newNumber;
        display.setText(newDisplayNumber);
    }

    public void plusClicked(ActionEvent actionEvent) {
        String numberAsString = display.getText();
        firstNumber = Integer.parseInt(numberAsString);
        display.setText("");

    }

    public void equalsClicked(ActionEvent actionEvent) {
        String numberAsString = display.getText();
        int secondNumber = Integer.parseInt(numberAsString);
        String newDisplayNumber = String.valueOf(firstNumber + secondNumber);
        display.setText(newDisplayNumber);
    }
}
