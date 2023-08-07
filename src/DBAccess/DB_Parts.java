package DBAccess;

import Helper.JDBC;
import Model.Part;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DB_Parts {

    public static ObservableList<Part> getAllParts() {

        ObservableList<Part> pList = FXCollections.observableArrayList();

        try {

            String sql = "SELECT * FROM parts";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int partsId = rs.getInt("partId");
                String partName = rs.getString("part_name");
                int partWeight = rs.getInt("part_weight");
                int partWidth = rs.getInt("part_width");
                int partHeight = rs.getInt("part_height");


                Part part = new Part(partsId, partName, partWeight, partWidth, partHeight);
                pList.add(part);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pList;
    }

    public static void createPart(String name, int weight, int width, int height) {


        try {
            String sqlti = "INSERT INTO parts VALUES(NULL, ?, ?, ?, ?)";

            PreparedStatement psti = JDBC.getConnection().prepareStatement(sqlti);
            psti.setString(1, name);
            psti.setInt(2, weight);
            psti.setInt(3, width);
            psti.setInt(4, height);

            psti.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static ObservableList<Part> getPartsWeight(int id) {

        ObservableList<Part> pList = FXCollections.observableArrayList();

        try {

            String sql = "SELECT part_weight FROM parts WHERE " + id + " = parts_Id";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int partsId = rs.getInt("partId");
                String partName = rs.getString("part_name");
                int partWeight = rs.getInt("part_weight");
                int partWidth = rs.getInt("part_width");
                int partHeight = rs.getInt("part_height");


                Part part = new Part(partsId, partName, partWeight, partWidth, partHeight);
                pList.add(part);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pList;
    }

}
