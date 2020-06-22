/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Koneksi.KoneksiDB;
import Model.ModFoodDiary;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mbohd
 */
public class DAOFoodDiary implements InterfaceFoodDiary{
    
    Connection connection;
    final String insert = "INSERT INTO food_diary (nama, jenis, kalori, id_user, tanggal) VALUES (?,?,?,?,?)";
    final String delete = "DELETE FROM food_diary WHERE id_food=?";
    final String update = "UPDATE food_diary SET nama=?, jenis=?, kalori=? WHERE id_food=?";
    final String cariPdTgl = "SELECT * FROM food_diary WHERE tanggal=? AND id_user=?";
    final String select = "SELECT * FROM food_diary";

    public DAOFoodDiary() {
        this.connection = KoneksiDB.connection();
    }
    
    @Override
    public void insert(int id_user, ModFoodDiary mfd, String tgl) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, mfd.getNama());
            statement.setInt(2, mfd.getJenis());
            statement.setInt(3, mfd.getKalori());
            statement.setInt(4, id_user);
            statement.setString(5, tgl);
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                mfd.setId_food(rs.getInt(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int no) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1, no);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOFoodDiary.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
            
    }

    @Override
    public List<ModFoodDiary> getAtDate(String tgl, int id_user) {
        List<ModFoodDiary> lfd = null;//To change body of generated methods, choose Tools | Templates.
                 
        try {
            lfd = new ArrayList<>();
            PreparedStatement st = connection.prepareStatement(cariPdTgl);
            st.setString(1, tgl);
            st.setInt(2, id_user);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ModFoodDiary fd = new ModFoodDiary();
                fd.setId_food(rs.getInt("id_food"));
                fd.setNama(rs.getString("nama"));
                fd.setJenis(rs.getInt("jenis"));
                fd.setKalori(rs.getInt("kalori"));
                lfd.add(fd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOFoodDiary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lfd;
    }

    @Override
    public void update(ModFoodDiary mfd) {
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(update, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, mfd.getNama());
            statement.setInt(2, mfd.getJenis());
            statement.setInt(3, mfd.getKalori());
            statement.setInt(4, mfd.getId_food());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
        } catch (SQLException ex) {
            Logger.getLogger(DAOFoodDiary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @Override
    public List<ModFoodDiary> getAll() {
        List<ModFoodDiary> lfd = null;
        try {
            lfd = new ArrayList<ModFoodDiary>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                ModFoodDiary fd = new ModFoodDiary();
                fd.setId_food(rs.getInt("id_food"));
                fd.setNama(rs.getString("nama"));
                fd.setJenis(rs.getInt("jenis"));
                fd.setKalori(rs.getInt("kalori"));
                lfd.add(fd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOFoodDiary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lfd;
    }
    
}
