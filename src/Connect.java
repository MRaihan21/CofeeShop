package CofeeShop;

import java.sql.*;

public class Connect {

    public static Connection getConnect() {
        Connection con = null;

         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_drinkfood", "root", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     
        return con;
    }
}