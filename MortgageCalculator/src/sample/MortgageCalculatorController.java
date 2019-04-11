package sample;
import java.lang.Math;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MortgageCalculatorController {

        @FXML
        private Button calbtn;

        @FXML
        private Text tend;

        @FXML
        private Text monthlyd;

        @FXML
        private Text thirtyd;

        @FXML
        private Text loand;

        @FXML
        private TextField downin;

        @FXML
        private Text twentyd;

        @FXML
        private TextField pricein;

        @FXML
        private TextField ratein;

        @FXML
        private Slider loanslider;

        double monthlyPaymentCal(double principal, double interest, double year){
                //some errors tat can occur
                if(year == 0.0){
                        return 0.0;
                }
                if(interest == 0.0)
                {
                        interest =1.0;
                }

                double monthlyinterest = interest/12;
                double payments = year*12;

//                tried running returning both variables as one return but it gave me undesigedd values to I had to seperate it
                double top = monthlyinterest * Math.pow((1+monthlyinterest), payments);
                double bottom =(Math.pow((1+monthlyinterest), payments)-1.0);

                //Rounding
                return Math.round(principal*(top/bottom)*100.0)/100.0;
                // Return monthly payment depending on Month, Principal and Interest
        }


        @FXML
        void calculateButtonPressed(ActionEvent event) {

                // Take in the values and display Loam Amount (
                double priceinvalue = Integer.parseInt(pricein.getText());

                if(pricein.getText().isEmpty())
                {
                    priceinvalue = 0;
                }
                double downpaymentvalue = Integer.parseInt(downin.getText());

                if(downin.getText().isEmpty())
                {
                        downpaymentvalue = 0;
                }

                double intrestvalue = (Math.abs(Integer.parseInt(ratein.getText())));

                if(ratein.getText().isEmpty())
                {
                        priceinvalue = 1;
                }

                double totalloan = (priceinvalue-downpaymentvalue);

                loand.setText("$ " + Double.toString(totalloan));

                double slider = Math.round(loanslider.getValue()*100.0)/100.0;
                // Calculating Monthly Payment For the Presets

//                the InterestValue/100 appears inefficient, however I tried to do it efficiently but the code would not work, so I did it
//                the most mundane way possible.

                tend.setText( "$ " + Double.toString(monthlyPaymentCal(totalloan, intrestvalue/100, 10)));
                twentyd.setText( "$ " + Double.toString(monthlyPaymentCal(totalloan, intrestvalue/100, 20)));
                thirtyd.setText( "$ " + Double.toString(monthlyPaymentCal(totalloan, intrestvalue/100, 30)));

                if(loanslider.getValue() != 0.0) {
                        monthlyd.setText("$ " + Double.toString(monthlyPaymentCal(totalloan, intrestvalue / 100, slider)) + "/ month for " + slider + " years");
                }else{
                        monthlyd.setText("$ " + totalloan + "/ month for " + slider + " years");

                }
        }

    }

