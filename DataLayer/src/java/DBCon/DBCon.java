/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBCon;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author SHYAM
 */
public class DBCon {
    private static DBCon connect = new DBCon();
    
    private DBCon(){}
    
    public static DBCon getInstance(){
        return connect;
    }
    
    public Connection DBConnection(){
        Connection con =null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/jobsdb","root","");
        } catch (Exception e) {
        }
        
        return con;
    }
}
