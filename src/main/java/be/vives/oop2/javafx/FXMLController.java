package be.vives.oop2.javafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import be.vives.oop2.javafx.EvenUneven;
import javafx.scene.control.TextArea;

public class FXMLController implements Initializable {
    
    EvenUneven checkNumber = new EvenUneven();

    @FXML
    private Label label;
    
    @FXML
    private TextField numberInput;

    @FXML
    private Label textPush;

    @FXML
    private void checkButtonHandler(ActionEvent event){
        int number = Integer.parseInt(numberInput.getText());
        System.out.println(checkNumber.getResult(number));   
        textPush.setText(checkNumber.getResult(number));
    }

    //int number = Integer.parseInt(numberInput.getText());


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
