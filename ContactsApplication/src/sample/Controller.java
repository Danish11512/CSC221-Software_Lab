package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.util.Callback;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.util.Comparator;

import java.util.Comparator;



public class Controller {
        @FXML
        private TextField phonetxt;

        @FXML
        private ImageView img;

        @FXML
        private Button updatebtn;

        @FXML
        private TextField fnametxt;

        @FXML
        private TextField picturetxt;

        @FXML
        private Button delbtn;

        @FXML
        private TextField emailtxt;

        @FXML
        private ListView<Contact> customlist;

        @FXML
        private final ObservableList<Contact> contacts = FXCollections.observableArrayList();

        @FXML
        private TextField lnametxt;

        @FXML
        private Button addbtn;

        Comparator<Contact> sorter= new SortByContactLastName();

        @FXML
        void updateButtonPressed(ActionEvent event) {
                Contact current = customlist.getSelectionModel().getSelectedItem();
                current.setEmail(emailtxt.getText());
                current.setLname(lnametxt.getText());
                current.setFname(fnametxt.getText());
                current.setPhonenumber(phonetxt.getText());
                current.setPicturepath(picturetxt.getText());

                contacts.sort(sorter);
                customlist.refresh();

        }

        @FXML
        void deleteButtonPressed(ActionEvent event) {
                Contact current = customlist.getSelectionModel().getSelectedItem();
                contacts.remove(current);

                if(contacts.size() == 0){
                        fnametxt.setText("");
                        lnametxt.setText("");
                        emailtxt.setText("");
                        phonetxt.setText("");
                       //picturetxt.setText("..//img//person_3.jpg");
                }

                contacts.sort(sorter);
                customlist.refresh();

        }

        @FXML
        void addButtonPressed(ActionEvent event) {
                img.setImage(new Image(picturetxt.getText()));
               contacts.add(new Contact(fnametxt.getText(), lnametxt.getText(),emailtxt.getText(), phonetxt.getText(), picturetxt.getText()));

                contacts.sort(sorter);
                customlist.refresh();
        }

        public void initialize() {
//                PROBLEM HERE
                contacts.add(new Contact("Danish", "Pastry", "danish.faruqi1@gmail.com", "9127590040", "sample/img/person_4.jpg"));
                contacts.add(new Contact("Sergie", "Korolev", "skorolev@gmail.com", "9127575640", "sample/img/korolev.jpg"));
                contacts.add(new Contact("Wernher Von", "Braun", "WVbraun@gmail.com", "9122340040", "sample/img/VonBraun.jpg"));

                contacts.sort(sorter);
                customlist.setItems(contacts);


                customlist.getSelectionModel().selectedItemProperty().addListener(
                        new ChangeListener<Contact>() {
                                @Override
                                public void changed(ObservableValue<? extends Contact> observable, Contact oldValue, Contact newValue) {
                                        img.setImage(new Image(newValue.getPicturepath()));
                                        emailtxt.setText(newValue.getEmail());
                                        picturetxt.setText(newValue.getPicturepath());
                                        fnametxt.setText(newValue.getFname());
                                        lnametxt.setText(newValue.getLname());
                                        phonetxt.setText(newValue.getPhonenumber());

                                }
                        }
                );



                customlist.setCellFactory(
                        new Callback<ListView<Contact>, ListCell<Contact>>() {
                                @Override
                                public ListCell<Contact> call(ListView<Contact> listView) {
                                        return new ContactsCell();}});


        }









}


