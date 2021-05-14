package View_Controller;

import javafx.beans.binding.When;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddPartController implements Initializable {


    public TextField addPartIdField;
    public TextField addPartNameField;
    public TextField addPartInventoryField;
    public TextField addPartPriceField;
    public TextField addPartMaxField;
    public TextField addPartChangingField;
    public TextField addPartMinField;
    public Label addPartChangingLabel;

    private boolean isInHouse;

    private ActionEvent actionEvent;

    /**
     *
     * @param actionEvent changes field label to Machine ID if In-House
     */

    @FXML
    void addPartInHouse(ActionEvent actionEvent) {
        isInHouse = true;
        addPartChangingLabel.setText("Machine ID");
    }

    /**
     *
     * @param actionEvent changes field label to Company Name if Outsourced
     */

    @FXML
    void addPartOutsourced(ActionEvent actionEvent) {
        isInHouse = false;
        addPartChangingLabel.setText("Company Name");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    /**
     *
     * @param actionEvent
     * @throws IOException
     *
     * When this method is called, the scene will change to the main scene
     */

    public void changeScreenMain(javafx.event.ActionEvent actionEvent) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/View_Controller/Main.fxml"));


        /**
         * This line gets the stage info
         */

        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();


        /**
         * This line sets the scene
         */

        Scene mainScene = new Scene(root, 1200, 800);

        stage.setScene(mainScene);
        stage.show();
    }
}
