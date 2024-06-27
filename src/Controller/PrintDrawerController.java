package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PrintDrawerController implements Initializable {

    public TextField openingHeight;
    public TextField openingWidth;
    public TextField frameHeight;
    public TextField frameWidth;
    public TextField doorHeight;
    public TextField doorWidth;
    public TextField leftHeight;
    public TextField leftWidth;
    public TextField rightHeight;
    public TextField rightWidth;
    public ChoiceBox<String> hardwareUneven;
    public ChoiceBox<String> type;
    public ChoiceBox<String> hinging;
    public ChoiceBox<String> glass;
    public ChoiceBox<String> hardware;
    public TextField quantity;
    public ChoiceBox<String> bottomRail;
    public ChoiceBox<String> stileSize;
    public ChoiceBox<String> color;
    public ChoiceBox<String> secondHardware;
    public TextArea notes;
    public Canvas previewCanvas;
    public CheckBox push;
    public ChoiceBox<String> pull;
    public Canvas doorCanvas;
    public Canvas windowCanvas;
    public TextField midRail;

    public void initialize(URL url, ResourceBundle resourceBundle) {

        type.getItems().add("Custom Single RH");
        type.getItems().add("Custom Single LH");
        type.getItems().add("Custom Pair");
        type.setValue("Custom Single LH");

        hinging.getItems().add("No Hinging");
        hinging.getItems().add("Continuous Hinge");
        hinging.getItems().add("Pivots");
        hinging.getItems().add("Butt Hinge");
        hinging.setValue("Pivots");

        glass.getItems().add("No Glass");
        glass.getItems().add("3/16 Clear");
        glass.getItems().add("1/4 Clear");
        glass.getItems().add("3/16 Bronze");
        glass.getItems().add("1/4 Bronze");
        glass.getItems().add("3/16 Grey");
        glass.getItems().add("1/4 Grey");
        glass.getItems().add("IG");
        glass.getItems().add("Low E");
        glass.setValue("3/16 Clear");

        hardware.getItems().add("No Hardware");
        hardware.getItems().add("Cylinder");
        hardware.getItems().add("Deadbolt");
        hardware.getItems().add("RIM");
        hardware.getItems().add("CVR");
        hardware.getItems().add("Thumb-turn");
        hardware.getItems().add("Hook Bolt");
        hardware.getItems().add("Lever Latch");
        hardware.getItems().add("Electric Strike Surface Mount");
        hardware.getItems().add("Electric Strike Integrated");
        hardware.setValue("Deadbolt");

        secondHardware.getItems().add("No Hardware");
        secondHardware.getItems().add("Cylinder");
        secondHardware.getItems().add("Deadbolt");
        secondHardware.getItems().add("RIM");
        secondHardware.getItems().add("CVR");
        secondHardware.getItems().add("Thumb-turn");
        secondHardware.getItems().add("Hook Bolt");
        secondHardware.getItems().add("Lever Latch");
        secondHardware.getItems().add("Electric Strike Surface Mount");
        secondHardware.getItems().add("Electric Strike Integrated");
        secondHardware.setValue("Cylinder");

        bottomRail.getItems().add("4");
        bottomRail.getItems().add("7 1/2");
        bottomRail.getItems().add("10");
        bottomRail.setValue("4");

        stileSize.getItems().add("Narrow");
        stileSize.getItems().add("Medium");
        stileSize.getItems().add("Wide");
        stileSize.setValue("Narrow");

        color.getItems().add("Bronze");
        color.getItems().add("Clear");
        color.getItems().add("White");
        color.getItems().add("Black");
        color.setValue("Bronze");

        pull.getItems().add("8\" In-house");
        pull.getItems().add("8\" Chrome");
        pull.getItems().add("10\" Chrome");
        pull.setValue("8\" In-house");

        hardwareUneven.getItems().add("No Hardware");
        hardwareUneven.getItems().add("Cylinder");
        hardwareUneven.getItems().add("RIM");
        hardwareUneven.getItems().add("CVR");
        hardwareUneven.getItems().add("Thumb-turn");
        hardwareUneven.getItems().add("Hook Bolt");
        hardwareUneven.getItems().add("Lever Latch");
        hardwareUneven.getItems().add("Electric Strike Surface Mount");
        hardwareUneven.getItems().add("Electric Strike Integrated");

        quantity.setText("0");
        doorWidth.setText("35 15/16");
        doorHeight.setText("83 1/4");

    }

    public void submit(ActionEvent actionEvent) {

        int x = 300;
        int y = 50;
        int z = 150;
        int m = 12;

        GraphicsContext clearCanvas = previewCanvas.getGraphicsContext2D();
        clearCanvas.clearRect(0, 0, previewCanvas.getWidth(), previewCanvas.getHeight());

        GraphicsContext graphicsContext = previewCanvas.getGraphicsContext2D();
        double doorWidthDouble = fractionToDecimalWidth(doorWidth.getText());
        double doorHeightDouble = fractionToDecimalHeight(doorHeight.getText());

//        graphicsContext.stroke();
//        graphicsContext.rect(x,y,z, m);

        if (color.getValue().equals("Bronze") && doorWidthDouble >= 36 && stileSize.getValue().equals("Narrow") && doorHeightDouble >= 84 ) {

            int i = 0;
            for (i = 35; i < doorWidthDouble; i++)
                System.out.println(i);
            int b = (i - 36) * 5;

            int j = 0;
            for (j = 35; j < doorHeightDouble; j++)
                System.out.println(j);
            int c = (j - 36) * 5;

            //Top Rail
            graphicsContext.setFill(Color.BLACK);
            graphicsContext.fillRect(x, y + 25, z + b, m);
            //Bottom Rail
            graphicsContext.setFill(Color.BLACK);
            graphicsContext.fillRect(x, y + 100, z + b, m + 8);
            //Stile
            graphicsContext.setFill(Color.BLACK);
            graphicsContext.fillRect(x +25, y, z, m);

        } else if (color.getValue().equals("Bronze") && doorWidthDouble < 36 && stileSize.getValue().equals("Narrow")) {
            int i = 0;
            for (i = 0; i < doorWidthDouble; i++)
                System.out.println(i);
            int b = (i - 36) * 5;
            graphicsContext.setFill(Color.BLACK);
            graphicsContext.fillRect(x, y + 25, z + b, m );
            graphicsContext.setFill(Color.BLACK);
            graphicsContext.fillRect(x, y + 100, z + b, m + 8);
        }
    }

    public void doorWidthChange(ActionEvent actionEvent) {

    }

    private void drawTopRail(int x, int y, int z, int m) {

    }

    public void mainMenu(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/View/Print_Drawer.fxml"));
        loader.load();

        Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
        Parent scene = loader.getRoot();
        stage.setScene(new Scene(scene));
        stage.show();
    }

    private double fractionToDecimalWidth(String x) {
        String width = doorWidth.getText();

        try {
            String[] split = width.trim().split("\\s+");
            String fraction = split[1];
            String[] splitFraction = fraction.split("/");
            double y = Double.parseDouble(splitFraction[0]);
            double z = Double.parseDouble(splitFraction[1]);
            String whole = split[0];
            double wholeNum = Double.parseDouble(whole);

            return wholeNum + (y / z);
        } catch (ArrayIndexOutOfBoundsException e) {
            return Double.parseDouble(width);
        }
    }

    private double fractionToDecimalHeight(String x) {
        String height = doorHeight.getText();

        try {
            String[] split = height.trim().split("\\s+");
            String fraction = split[1];
            String[] splitFraction = fraction.split("/");
            double y = Double.parseDouble(splitFraction[0]);
            double z = Double.parseDouble(splitFraction[1]);
            String whole = split[0];
            double wholeNum = Double.parseDouble(whole);

            return wholeNum + (y / z);
        } catch (ArrayIndexOutOfBoundsException e) {
            return Double.parseDouble(height);
        }
    }

    public void clear(ActionEvent actionEvent) {

        GraphicsContext clearCanvas = previewCanvas.getGraphicsContext2D();
        clearCanvas.clearRect(0, 0, previewCanvas.getWidth(), previewCanvas.getHeight());
    }
}
