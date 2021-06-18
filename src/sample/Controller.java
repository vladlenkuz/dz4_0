package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    TextArea mainT;
    @FXML
    TextField msgField;
    @FXML
    Button send;


    public void keyPress(KeyEvent keyEvent){
        if (keyEvent.getCode() == KeyCode.ENTER){
            mainT.appendText(msgField.getText() + "\n");
            msgField.clear();
            keyEvent.consume();
        }
    }
}
