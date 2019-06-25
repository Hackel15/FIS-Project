package MySqlDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
/**
import org.*;
import com.mysql.jdbc.Driver;
*/

public class Connect {

    public Connection startConnection() {
        String driverName = "com.mysql.cj.jdbc.Driver";

        try{
            Class cls = Class.forName(driverName); // here is the ClassNotFoundException
            System.out.println("Class found: " + cls.getName());
            System.out.println("Package found: " + cls.getPackage());
        }
        catch(ClassNotFoundException ex){
            System.out.println(ex.toString());
        }

        String serverName = "localhost:3306/FIS_ROOM_SCHED";
        String url = "jdbc:mysql://" + serverName;

        String username = "root";
        String password = "Mount@inEveres!15";
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(url, username, password);
        }
        catch(SQLException ex){
            System.out.println("Connection Error: " + ex.toString());
        }
        return connection;
    }
}