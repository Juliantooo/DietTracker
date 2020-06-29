/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Koneksi.KoneksiDB;
import Model.ModUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mbohd
 */
public class DAOUser implements IFUser {

    Connection connection;
    final String insert = "INSERT INTO food_diary (nama, jenis, kalori, id_user, tanggal) VALUES (?,?,?,?,?)";
    final String getUser = "SELECT * FROM user WHERE username=? AND password=?";

    public DAOUser() {
        this.connection = KoneksiDB.connection();
    }

    @Override
    public boolean cekUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModUser getUser(String username, String password) {
        ModUser u = null;
        //System.err.println("uname di getUser"+ username);
        //System.err.println("paswd di getUser"+password);
        try {
            u = new ModUser();
            PreparedStatement st = connection.prepareStatement(getUser);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
            while (rs.next()) {

                u.setUsername(rs.getString("username"));
                u.setId_user(rs.getInt("id_user"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }

    @Override
    public void insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
