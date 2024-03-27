package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
/**This class sets up connection with the database. */
public abstract class JDBC {

    private static final String protocol = "jdbc";
    private static final String vendor = ":mysql:";
    private static final String location = "//127.0.0.1:3306/";
    private static final String databaseName = "pallet_schema";
    private static final String jdbcUrl = protocol + vendor + location + databaseName + "?connectionTimeZone = SERVER"; // LOCAL
    private static final String driver = "com.mysql.cj.jdbc.Driver"; // Driver reference
    private static final String userName = "root"; // Username
    private static final String password = "Kratosgodofwar#4"; // Password
    public static Connection connection;  // Connection Interface
    /**Opens connection with database.
     * The openConnection method opens the connection with the database. */
    public static void openConnection()
    {
        try {
            Class.forName(driver); // Locate Driver
            connection = DriverManager.getConnection(jdbcUrl, userName, password); // Reference Connection object
            System.out.println("Connection successful!");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /**Gets the connection to database.
     * The getConnection gets the connection that was opened with the openConnection method.
     * @return connection. */
    public static Connection getConnection(){
        return connection;
    }
    /**Closes the connection to database.
     * The closeConnection method closes the connection opened by the openConnection method. */
    public static void closeConnection() {
        try {
            connection.close();
            System.out.println("Connection closed!");
        }
        catch(Exception e)
        {
            System.out.println("Error:" + e.getMessage());
        }
    }
}

