package MySqlDriver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;

public class Core {

    /**
     * Functionn: Start Connection for mySQL Local Database
     * @return
     *      1. Return Object of type Connection
     */
    private Connection getConnection() {
        Connect link = new Connect();
        return link.startConnection();
    }

    /**
     * Function: Execute all SQL queries.  Incorporates error handling
     * Parameters:
     *      1. qry -- String
     *      2. conn -- Connection
     */
    private void executeQuery(String qry, Connection conn) {
        Statement stmt = null;
        try{
            stmt = conn.createStatement();
            int c = stmt.executeUpdate(qry);
            conn.close();
        }
        catch(SQLException ex){
            System.out.println("SQL executeUpdate error: " + ex.toString());
        }
    }

    /**
     * Function: Converts int to string for sql query.
     * @param floor
     * @return sql query string
     */
    private String getFloor(int floor){
        switch(floor){
            case 1:
                return "floor_one";

            case 2:
                return "floor_two";

            case 3:
                return "floor_three";

            default:
                System.out.println("Invalid Floor Input");
                return "";
        }
    }

    private boolean timeChecker(){

        return false;
    }

    /**
     * Function: Insert a scheduled time slot for the user
     * Conditions:
     *       1. Slot must not be taken
     * Parameters:
     *       1. First Name -- String
     *       2. Last Name -- String
     *       3. Start Time -- Date Object?
     *       4. End Time -- Date Object?
     *       5. Floor (level) -- int
     */
    public void insert(String fName, String lName, Date start, Date end, int floor) {
        Connection conn = getConnection();
        String sqlQuery =
    }
}
