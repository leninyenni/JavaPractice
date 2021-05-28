package seleniumPrograms.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectToMySQL {
    public static void main(String[] args) throws Exception {
        // Object of Connection from the Database
        Connection conn = null;
        // Object of Statement. It is used to create a Statement to execute the query
        Statement stmt = null;
        //Object of ResultSet => 'It maintains a cursor that points to the current row in the result set'
        ResultSet resultSet = null;
        Class.forName("com.mysql.jdbc.Driver");
        // Open a connection
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?autoReconnect=true&useSSL=false", "root", "welcome@123");
        // Execute a query
        stmt = conn.createStatement();
        resultSet = stmt.executeQuery("select * from world.country limit 10");
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + "|" + resultSet.getString(2) + "|" + resultSet.getString(3) + "|"
                    + resultSet.getString(4) + "|" + resultSet.getString(5));
        }
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (Exception e) {
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (Exception e) {
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception e) {
            }
        }
    }
}
