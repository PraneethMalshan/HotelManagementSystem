import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



import java.io.IOException;

public class MainFormController {

    public TextField userName;
    public TextField password;
    public Label labalId;

    public void addmin(ActionEvent actionEvent) throws IOException {
        if (userName.getText().equals("Admin") && password.getText().equals("1234")) {
            Parent root = FXMLLoader.load(getClass().getResource("Account.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else {
            System.out.println("Invalid Username or Password ! Please check and Log again");
        }


    }

    public void reception(ActionEvent actionEvent) throws IOException {
        if (userName.getText().equals("Reception") && password.getText().equals("12345")) {
            Parent root = FXMLLoader.load(getClass().getResource("Booking.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else {
            labalId.setText("user name or password invalid");
        }
    }
}
