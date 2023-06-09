import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class BookNowController {

    public RadioButton LocalRoom;
    public ToggleGroup Meals;
    public RadioButton ChinessMeals;
    public RadioButton FrenchMeals;
    public RadioButton singleRoom;
    public ToggleGroup Rooms;
    public RadioButton doubleRoom;
    public RadioButton TripleRoom;
    public RadioButton QuardRoom;
    public TextField AddressId;
    public TextField EmailId;
    public TextField TellNo;
    public TextField IDNoId;
    public TextField NameId;
    public TextField CheckIn;
    public TextField CheckOut;
    public TextField RoomNo;

    public void ContinueOnAction(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ShowSuccess.fxml"));
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
