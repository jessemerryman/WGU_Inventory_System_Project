package View_Controller;

import Model.Part;
import Model.Product;
import javafx.beans.binding.When;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    public TableView mainProductTable;
    public TableColumn mainProductIdColumn;
    public TableColumn mainProductNameColumn;
    public TableColumn mainProductInventoryLevelColumn;
    public TableColumn mainProductPriceColumn;

    public TableView mainPartTable;
    public TableColumn mainPartIdColumn;
    public TableColumn mainPartNameColumn;
    public TableColumn mainPartInventoryLevelColumn;
    public TableColumn mainPartPriceColumn;

    private static ObservableList<Part> allParts = FXCollections.observableArrayList();
    private static ObservableList<Part> allProducts = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        mainPartTable.setItems(allParts);
        mainProductTable.setItems(allProducts);

        mainPartIdColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        mainPartNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        mainPartInventoryLevelColumn.setCellValueFactory(new PropertyValueFactory<>("stock"));
        mainPartPriceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        mainProductIdColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        mainProductNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        mainProductInventoryLevelColumn.setCellValueFactory(new PropertyValueFactory<>("stock"));
        mainProductPriceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));


    }

    /**
     *
     * @param actionEvent
     * @throws IOException
     *
     * When this method is called, the scene will change to AddPart
     */

    public void changeScreenAddPart(javafx.event.ActionEvent actionEvent) throws IOException {

        Parent addPartParent = FXMLLoader.load(getClass().getResource("/View_Controller/AddPart.fxml"));

        /**
         * This line gets the Stage info
         */

        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        /**
         * This line sets the scene
         */

        Scene addPartScene = new Scene(addPartParent, 1200, 800);

        stage.setScene(addPartScene);
        stage.show();
    }

    public void changeScreenAddProduct(javafx.event.ActionEvent actionEvent) throws IOException {

        Parent addPartParent = FXMLLoader.load(getClass().getResource("/View_Controller/AddProduct.fxml"));

        /**
         * This line gets the Stage info
         */

        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        /**
         * This line sets the scene
         */

        Scene addPartScene = new Scene(addPartParent, 1200, 800);

        stage.setScene(addPartScene);
        stage.show();
    }

    public void changeScreenModifyPart(javafx.event.ActionEvent actionEvent) throws IOException {

        Parent addPartParent = FXMLLoader.load(getClass().getResource("/View_Controller/ModifyPart.fxml"));

        /**
         * This line gets the Stage info
         */

        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        /**
         * This line sets the scene
         */

        Scene addPartScene = new Scene(addPartParent, 1200, 800);

        stage.setScene(addPartScene);
        stage.show();
    }

    public void changeScreenModifyProduct(javafx.event.ActionEvent actionEvent) throws IOException {

        Parent addPartParent = FXMLLoader.load(getClass().getResource("/View_Controller/ModifyProduct.fxml"));

        /**
         * This line gets the Stage info
         */

        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        /**
         * This line sets the scene
         */

        Scene addPartScene = new Scene(addPartParent, 1200, 800);

        stage.setScene(addPartScene);
        stage.show();
    }
}