/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slovicka;

import Core.Repository;
import Core.Slovicko;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Vojta
 */
public class FXMLDocumentController implements Initializable {

    private final Repository rep;

    private Slovicko current_slovicko;

    @FXML
    private TextField inf;

    @FXML
    private Button checkBut;

    @FXML
    private TextField pastPar;

    @FXML
    private Button nextBut;

    @FXML
    private Label vysledek;

    @FXML
    private TextField pastSim;

    @FXML
    private TextField czech;

    public FXMLDocumentController() {
        rep = new Repository();
    }

    @FXML
    void next(ActionEvent event) {
        Slovicko sl = rep.getSlovicko();
        this.current_slovicko = sl;

        String infi = sl.getInfinitiv();

        czech.setText("");
        pastSim.setText("");
        pastPar.setText("");
        inf.setText(infi);
        inf.setEditable(false);
        vysledek.setText("");

    }

    @FXML
    void kontrola(ActionEvent event) {
        if (this.current_slovicko.isCorrect(inf.getText(), pastSim.getText(), pastPar.getText(), czech.getText())) {
            vysledek.setText("spravně");
        } else {
            vysledek.setText("špatně");
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        next(null);
    }

}
