//By Danish Faruqi CSC 22100 - R

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Heart Rate Calculator");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        //Prints Label before showing up
        Label title = new Label("Heart Rate Calculator"); // a title to print on the application
		title.setAlignment(Pos.CENTER); // Aligned to the center
		primaryStage.setScene(new Scene(title, 300, 250)); // create a stage, the application window


        //Label that shows up on top of everything
        Label SceneTitle = new Label("Heart Rate Calculator");
        SceneTitle.setAlignment(Pos.CENTER);

        // Creating all the Text Fields
        TextField TextFname = new TextField();
        TextField TextLname = new TextField();
        TextField TextDay = new TextField();
        TextField TextMonth = new TextField();
        TextField TextYear = new TextField();


        // Settings for each Textfield
        TextFname.setMinHeight(30);
        TextFname.setMinWidth(50);
        TextFname.setPromptText("Enter your First Name");

        TextLname.setMinHeight(30);
        TextLname.setMinWidth(150);
        TextLname.setPromptText("Enter your Last Name");

        TextDay.setMinHeight(30);
        TextDay.setMinWidth(150);
        TextDay.setPromptText("Enter your Birth Day");

        TextMonth.setMinHeight(30);
        TextMonth.setMinWidth(150);
        TextMonth.setPromptText("Enter your Birth Month");

        TextYear.setMinHeight(30);
        TextYear.setMinWidth(150);
        TextYear.setPromptText("Enter your Birth Year");


        // Button to enter info
        Button Enterbtn = new Button("Enter");
        VBox Mybox = new VBox();

        //Display and center it
        Mybox.getChildren().addAll(SceneTitle, TextFname,TextLname, TextDay, TextMonth, TextYear, Enterbtn);
        Mybox.setAlignment(Pos.CENTER);


        // show up on Scene
        Scene newscene = new Scene(Mybox, 300, 250);
        primaryStage.setScene(newscene);
        primaryStage.show(); // actually show the stage


        Enterbtn.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                // create attributes to hold the information

                String fname = TextFname.getText();
                String lname = TextLname.getText();

                int birthdateday = Integer.parseInt(TextDay.getText());
                int birthdatemonth = Integer.parseInt(TextMonth.getText());
                int birthdateyear = Integer.parseInt(TextYear.getText());

                // create instance and input information
                Heart_Rates patient = new Heart_Rates(fname, lname, birthdateday, birthdatemonth, birthdateyear);

                // Output information into the scene
                Label labelname = new Label("Your Name is: " + patient.getFirst_name() + " " + patient.getLast_name());
                Label age = new Label( "Age: " + patient.getAge());
                Label info = new Label("Maximum Heart Rate: " + patient.getMaxHeartRate() +  "bpm");
                Label info2 = new Label("Target Heart Range: " + patient.getTargetHeartRate());

                // a new scene that displays the information

                if(patient.ErrorBday() && patient.ErrorBmonth() && patient.ErrorByear()) {
                    VBox outputstage2 = new VBox();
                    Scene Scene3 = new Scene(outputstage2, 300, 250);
                    primaryStage.setScene(Scene3);
                    outputstage2.getChildren().addAll(labelname, age, info, info2);
                    outputstage2.setAlignment(Pos.CENTER);
                }else{

                    // Error handling for day
                    Label BdayError = new Label("");
                    if(!patient.ErrorBday())
                    {
                         BdayError.setText("Error: date entered is not a valid date");
                    }

                    // Error handling for month
                    Label BmonthError = new Label("");
                    if(!patient.ErrorBmonth())
                    {
                        BmonthError.setText("Error: month entered is not a valid date");
                    }

                    // Error handling for year
                    Label ByearError = new Label("");
                    if(!patient.ErrorByear())
                    {
                        ByearError.setText("Error: year entered is not a valid date");
                    }

                    VBox outputstage3 = new VBox();
                    Scene Scene4 = new Scene(outputstage3, 300, 250);
                    primaryStage.setScene(Scene4);
                    outputstage3.getChildren().addAll(BdayError, BmonthError, ByearError);
                    outputstage3.setAlignment(Pos.CENTER);


                }

            }
        });


    }

    public static void main(String[] args) {

        launch(args);
    }
}
