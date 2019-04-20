package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField inputtxt;

    @FXML
    private Button btn;


    @FXML
    private Label lbl;

    @FXML
    void updateButtonPressed(ActionEvent event) {
        Double number = 0.0;
        try {
            number = Double.parseDouble(inputtxt.getText());

            String snumber = Double.toString(Math.abs(number));

            // Create the stringg builder and prepare it with *s
            StringBuilder check = new StringBuilder("*********");

            if (snumber.length() <= 9) {
                int checkLength = check.length() - 1;
                int snumberLength = snumber.length() - 1;

                while (snumberLength >= 0) {
                    check.setCharAt(checkLength--, snumber.charAt(snumberLength--));

                }

            }else{
                lbl.setText("The number you have entered is longer than 9 spaces");
            }

            lbl.setText(check.toString());
        } catch (NumberFormatException e) {
            lbl.setText("Enter a number");
        }



    }
}

//        try {
//                Double num = Double.parseDouble(string);
//                } catch (NumberFormatException e) {
//                numeric = false;
//                }

