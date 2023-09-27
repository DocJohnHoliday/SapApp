package Controller;

import DBAccess.DB_Parts;
import DBAccess.DB_Wood;
import Messages.Main_Warnings;
import Model.Part;
import Model.Wood;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.stream.IntStream;

public class WeightCheck_Controller implements Initializable {
    public ComboBox<Part> firstFirstCombo;
    public ComboBox<Part> firstSecondCombo;
    public ComboBox<Part> firstThirdCombo;
    public Button clearFirstButton;
    public ComboBox<Part> secondFirstCombo;
    public ComboBox<Part> secondSecondCombo;
    public ComboBox<Part> secondThirdCombo;
    public Button clearSecondButton;
    public ComboBox<Part> thirdFirstCombo;
    public ComboBox<Part> thirdSecondCombo;
    public ComboBox<Part> thirdThirdCombo;
    public Button clearThirdButton;
    public ComboBox<Part> fourthFirstCombo;
    public ComboBox<Part> fourthSecondCombo;
    public ComboBox<Part> fourthThirdCombo;
    public Button clearFourthButton;
    public TextField palletWeightSpot;
    public Button submitButton;
    public Button clearAllButton;
    public TextField inputBaseWeight;
    public TextField outputBaseWeight;
    public TextField outputPartWeight;
    public TextField inputTierWeight;
    public TextField outputTierWeight;
    public ComboBox<Part> partCombo;
    public Button inputClearButton;
    public TextField partsPerTier;
    public TextField partsCreate;
    public TextField partsWidth;
    public TextField partsLength;
    public TextField partsWeight;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        partCombo.setItems(DB_Parts.getAllParts());


        firstFirstCombo.setItems(DB_Parts.getAllParts());
        firstSecondCombo.setItems(DB_Parts.getAllParts());
        firstThirdCombo.setItems(DB_Parts.getAllParts());
        secondFirstCombo.setItems(DB_Parts.getAllParts());
        secondSecondCombo.setItems(DB_Parts.getAllParts());
        secondThirdCombo.setItems(DB_Parts.getAllParts());
        thirdFirstCombo.setItems(DB_Parts.getAllParts());
        thirdSecondCombo.setItems(DB_Parts.getAllParts());
        thirdThirdCombo.setItems(DB_Parts.getAllParts());
        fourthFirstCombo.setItems(DB_Parts.getAllParts());
        fourthSecondCombo.setItems(DB_Parts.getAllParts());
        fourthThirdCombo.setItems(DB_Parts.getAllParts());

        outputBaseWeight.setText(DB_Wood.getBaseWeightAvg());
        outputTierWeight.setText(DB_Wood.getTierWeightAvg());

        firstFirstCombo.getSelectionModel().select(6);
        firstSecondCombo.getSelectionModel().select(6);

    }


    ////////////////Tiers
    public void submitTier(ActionEvent actionEvent) {

        ArrayList<Integer> combos = new ArrayList<Integer>();
        ArrayList<Integer> addition = new ArrayList<Integer>();

        ///////////First Tier Combos
        Part ffc = firstFirstCombo.getValue();
        int ffcI = ffc.getPartWeight();
        combos.add(ffcI);

        Part fsc = firstSecondCombo.getValue();
        int fscI = fsc.getPartWeight();
        combos.add(fscI);

        Part ftc = firstThirdCombo.getValue();
        int ftcI = ftc.getPartWeight();
        combos.add(ftcI);

        //////////Second Tier Combos
        Part sfc = secondFirstCombo.getValue();
        int sfcI = sfc.getPartWeight();
        combos.add(sfcI);

        Part ssc = secondSecondCombo.getValue();
        int sscI = ssc.getPartWeight();
        combos.add(sscI);

        Part stc = secondThirdCombo.getValue();
        int stcI = stc.getPartWeight();
        combos.add(stcI);

        //////////Third Tier Combos
        Part tfc = thirdFirstCombo.getValue();
        int tfcI = tfc.getPartWeight();
        combos.add(tfcI);

        Part tsc = thirdSecondCombo.getValue();
        int tscI = tsc.getPartWeight();
        combos.add(tscI);

        Part ttc = thirdThirdCombo.getValue();
        int ttcI = ttc.getPartWeight();
        combos.add(ttcI);

        /////////Fourth Tier Combos
        Part ff = fourthFirstCombo.getValue();
        int ffI = ff.getPartWeight();
        combos.add(ffI);

        Part fs = fourthSecondCombo.getValue();
        int fsI = fs.getPartWeight();
        combos.add(fsI);

        Part ft = fourthThirdCombo.getValue();
        int ftI = ft.getPartWeight();
        combos.add(ftI);

        int weightBase = Integer.parseInt(DB_Wood.getBaseWeightAvg());
        int weightTier = Integer.parseInt(DB_Wood.getTierWeightAvg());

        /*for (Integer combo : combos)
            if (combo != null) {
                addition.add(combo);
            }

        int sum = 0;
        for(int i = 0; i < addition.size(); i++)
            sum += addition.get(i);*/

//        int total = sum + weightBase + weightTier;

       // palletWeightSpot.setText(String.valueOf(total));
    }

    public void clearTier(ActionEvent actionEvent) {

        firstFirstCombo.getSelectionModel().clearSelection();
        firstSecondCombo.getSelectionModel().clearSelection();
        firstThirdCombo.getSelectionModel().clearSelection();

        secondFirstCombo.getSelectionModel().clearSelection();
        secondSecondCombo.getSelectionModel().clearSelection();
        secondThirdCombo.getSelectionModel().clearSelection();

        thirdFirstCombo.getSelectionModel().clearSelection();
        thirdSecondCombo.getSelectionModel().clearSelection();
        thirdThirdCombo.getSelectionModel().clearSelection();

        fourthFirstCombo.getSelectionModel().clearSelection();
        fourthSecondCombo.getSelectionModel().clearSelection();
        fourthThirdCombo.getSelectionModel().clearSelection();
    }

    public void clearFirst(ActionEvent actionEvent) {
        firstFirstCombo.getSelectionModel().clearSelection();
        firstSecondCombo.getSelectionModel().clearSelection();
        firstThirdCombo.getSelectionModel().clearSelection();
    }

    public void ClearSecond(ActionEvent actionEvent) {
        secondFirstCombo.getSelectionModel().clearSelection();
        secondSecondCombo.getSelectionModel().clearSelection();
        secondThirdCombo.getSelectionModel().clearSelection();
    }

    public void clearThird(ActionEvent actionEvent) {
        thirdFirstCombo.getSelectionModel().clearSelection();
        thirdSecondCombo.getSelectionModel().clearSelection();
        thirdThirdCombo.getSelectionModel().clearSelection();
    }

    public void ClearFourth(ActionEvent actionEvent) {
        fourthFirstCombo.getSelectionModel().clearSelection();
        fourthSecondCombo.getSelectionModel().clearSelection();
        fourthThirdCombo.getSelectionModel().clearSelection();
    }

    //////////////////WOOD
    public void clearWood(ActionEvent actionEvent) {

        inputBaseWeight.clear();
        inputTierWeight.clear();

    }

    public void submitWood(ActionEvent actionEvent) {

        String woodBaseWeight = inputBaseWeight.getText();
        String woodTierWeight = inputTierWeight.getText();

        try {
            int wBW = Integer.parseInt(woodBaseWeight);
            int wTW = Integer.parseInt(woodTierWeight);

            if(wBW == 0 || wTW == 0) {
                Main_Warnings.fieldsNullWarning();
            } else {
                DB_Wood.addWoodWeight(wBW, wTW);
                inputBaseWeight.clear();
                inputTierWeight.clear();
            }
            outputBaseWeight.setText(DB_Wood.getBaseWeightAvg());
            outputTierWeight.setText(DB_Wood.getTierWeightAvg());
        }catch (NumberFormatException e) {

            Main_Warnings.numberWarning();

        }

    }

    /////////////////Parts

    public void clearPart(ActionEvent actionEvent) {

        partsCreate.clear();
        partsWeight.clear();
        partsWidth.clear();
        partsLength.clear();

    }

    public void submitPart(ActionEvent actionEvent) {

        String pCreate = partsCreate.getText();
        String pWeight = partsWeight.getText();
        String pWidth = partsWidth.getText();
        String pHeight = partsLength.getText();

        try {

            int pW = Integer.parseInt(pWeight);
            int pWi = Integer.parseInt(pWidth);
            int pH = Integer.parseInt(pHeight);

            if (pCreate == null || pCreate.length() == 0 || pWeight == null || pWeight.length() == 0) {
                Main_Warnings.fieldsNullWarning();
            } else {

                DB_Parts.createPart(pCreate, pW, pWi, pH);
                partsCreate.clear();
                partsWeight.clear();
                partsWidth.clear();
                partsLength.clear();
                partCombo.setItems(DB_Parts.getAllParts());
                firstFirstCombo.setItems(DB_Parts.getAllParts());
                firstSecondCombo.setItems(DB_Parts.getAllParts());
                firstThirdCombo.setItems(DB_Parts.getAllParts());
                secondFirstCombo.setItems(DB_Parts.getAllParts());
                secondSecondCombo.setItems(DB_Parts.getAllParts());
                secondThirdCombo.setItems(DB_Parts.getAllParts());
                thirdFirstCombo.setItems(DB_Parts.getAllParts());
                thirdSecondCombo.setItems(DB_Parts.getAllParts());
                thirdThirdCombo.setItems(DB_Parts.getAllParts());
                fourthFirstCombo.setItems(DB_Parts.getAllParts());
                fourthSecondCombo.setItems(DB_Parts.getAllParts());
                fourthThirdCombo.setItems(DB_Parts.getAllParts());
                Main_Warnings.confirmation();

            }
        } catch (RuntimeException e) {
            Main_Warnings.fieldsNullWarning();
        }
    }

    public void logout(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/View/Login.fxml"));
        loader.load();

        Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
        Parent scene = loader.getRoot();
        stage.setScene(new Scene(scene));
        stage.show();
    }

    public void drawings(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/View/Print_Drawer.fxml"));
        loader.load();

        Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
        Parent scene = loader.getRoot();
        stage.setScene(new Scene(scene));
        stage.show();
    }
}

