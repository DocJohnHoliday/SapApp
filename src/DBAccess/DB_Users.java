package DBAccess;

import Helper.JDBC;
import Model.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**This class handles the communication between the database and controllers for Users. */
public class DB_Users {
    /**Checks whether username and password are in database.
     * The loginCheck method checks whether the user entered correct username and passwords in login page.
     * @param userName User name in Users.
     * @param userPassword User password in Users.
     * @return boolean. */
    public static boolean loginCheck(String userName, String userPassword) {

        try {
            String sql = "SELECT * FROM users WHERE User_Name='" + userName + "' and Password='" + userPassword + "'";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    /**Gets all User info from database.
     * The getAllUsers method adds all users to observable list.
     * @return uList. */
    public static ObservableList<User> getAllUser() {

        ObservableList<User> ulist = FXCollections.observableArrayList();

        try {

            String sql = "SELECT * FROM users";
            PreparedStatement ps = JDBC.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int userID = rs.getInt("User_ID");
                String userName = rs.getString("User_Name");
                String password = rs.getString("Password");

                User U = new User(userID, userName, password);
                ulist.add(U);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return  ulist;
    }

    public static void createUser(String userName, String pasword) {

        try {
            String sql = "INSERT INTO users VALUES(NULL, ?, ?, NULL, NULL, NULL, NULL)";

            PreparedStatement psti = JDBC.getConnection().prepareStatement(sql);
            psti.setString(1, userName);
            psti.setString(2, pasword);


            psti.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}