package sample;

import javafx.scene.control.ListCell;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;

//Most of this is from the slides

public class ContactsCell extends ListCell<Contact> {
    private  VBox vBox = new VBox(8.0);
    private ImageView thumbImageView = new ImageView();
    private Label label = new Label();

    public ContactsCell(){
        vBox.setAlignment(Pos.CENTER);

        thumbImageView.setPreserveRatio(true);
        thumbImageView.setFitHeight(100.00);
        vBox.getChildren().add(thumbImageView);

        label.setWrapText(true);
        label.setTextAlignment(TextAlignment.CENTER);
        vBox.getChildren().add(label);
        setPrefWidth(USE_PREF_SIZE);
    }

    @Override
    protected void updateItem(Contact item, boolean empty) {
        super.updateItem(item, empty);

        if(empty || item == null) {
            setGraphic(null);
        }
        else {
            thumbImageView.setImage(new Image(item.getPicturepath()));
            label.setText(item.getLname() + ", " + item.getFname());
            setGraphic(vBox);
        }
    }

}
