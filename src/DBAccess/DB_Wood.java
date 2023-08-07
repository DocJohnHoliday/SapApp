package DBAccess;

import Helper.JDBC;

import Model.Wood;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_Wood {

//    public static String getBaseWeightAvg;

    //Add wood weight to database
    public static void addWoodWeight(int baseWeight, int tierWeight) {

        try {
            String sqlti = "INSERT INTO wood Values(Null, ?, ?)";

            PreparedStatement ps = JDBC.getConnection().prepareStatement(sqlti);
            ps.setInt(1, baseWeight);
            ps.setInt(2, tierWeight);

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static ObservableList<Wood> getWoodWeight() {

        ObservableList<Wood> wList = FXCollections.observableArrayList();

        try {

            String sql = "SELECT * FROM wood";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int woodBaseWeight = rs.getInt("wood_base_weight");
                int woodTierWeight = rs.getInt("wood_tier-weight");


                Wood wood = new Wood(woodBaseWeight, woodTierWeight);
                wList.add(wood);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return wList;
    }


    public static String getBaseWeightAvg() {

        ObservableList<Integer> baseList = FXCollections.observableArrayList();

        int sum = 0;


        try {

            String sql = "SELECT wood_base_weight FROM wood";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int woodBaseWeight = rs.getInt("wood_base_weight");

                baseList.add(woodBaseWeight);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (Integer integer : baseList) sum = sum + integer;
        int avg = sum / baseList.size();

        return Integer.toString(avg);
    }

    public static String getTierWeightAvg() {

        ObservableList<Integer> tierList = FXCollections.observableArrayList();

        int sum = 0;


        try {

            String sql = "SELECT wood_tier_weight FROM wood";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int woodBaseWeight = rs.getInt("wood_tier_weight");

                tierList.add(woodBaseWeight);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (Integer integer : tierList) sum = sum + integer;
        int avg = sum / tierList.size();

        return Integer.toString(avg);
    }

}
