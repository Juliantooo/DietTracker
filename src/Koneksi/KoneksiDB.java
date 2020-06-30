/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mbohd
 */
public class KoneksiDB {
        static Connection con;
    
    public static Connection connection(){
        if(con == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("uas_pbo");
            data.setUser("root");
            data.setPassword("");
            data.setPort(3306);
            data.setServerName("localhost");
            data.setServerTimezone("UTC");
            
            
            try {
                con = data.getConnection();
            } catch (SQLException ex) {
                //Logger.getLogger(KoneksiDB.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
        }
        return con;
    }
}
