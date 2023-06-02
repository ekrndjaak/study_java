package JDBCconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    public static void main(String[] args) {
        String dbFilePath = "C:\\database\\libDB.accdb";

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch (ClassNotFoundException e){
            System.out.println("jdbc not found!");
            e.printStackTrace();
            return;
        }
        try{
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://" + dbFilePath);
            System.out.println("jdbc connect");


            connection.close();
            System.out.println("connect close!");
        }
        catch(SQLException e){
            System.out.println("DataBase Error!");
            e.printStackTrace();
        }
    }
}
