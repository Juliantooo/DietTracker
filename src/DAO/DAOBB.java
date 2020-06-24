/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Koneksi.KoneksiDB;
import Model.ModBB;
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
public class DAOBB implements IFBB{
    
    Connection connection;
    final String insert = "INSERT INTO riwayat_bb (id_user, bb, tanggal) VALUES (?,?,?)";
    final String delete = "DELETE FROM riwayat_bb WHERE id_bb=?";
    final String update = "UPDATE riwayat_bb SET bb=? WHERE id_user=? AND tanggal=?";
    final String select30days = "SELECT db_date AS tanggal, bb FROM time_dimension LEFT JOIN riwayat_bb ON riwayat_bb.tanggal=time_dimension.db_date AND riwayat_bb.id_user=?  WHERE db_date BETWEEN CURDATE() - INTERVAL 30 DAY AND CURDATE() ORDER BY db_date";
    final String selectCount = "SELECT COUNT(*) FROM riwayat_bb WHERE id_user=? AND tanggal=?";

    public DAOBB() {
        this.connection = KoneksiDB.connection();
    }

    @Override
    public void insert(int id_user, ModBB bb) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id_user);
            statement.setDouble(2, bb.getBb());
            statement.setString(3, bb.getTanggal());
            statement.executeUpdate();
                        
        } catch (SQLException ex) {
            Logger.getLogger(DAOBB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int no) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModBB> get30Days(int id_user) {
        List<ModBB> lbb = null;
        try {
            lbb = new ArrayList<>();
            PreparedStatement st = connection.prepareStatement(select30days);
            st.setInt(1, id_user);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ModBB bb = new ModBB();
                bb.setBb(rs.getDouble("bb"));
                bb.setTanggal(rs.getString("tanggal"));
                lbb.add(bb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lbb;
    }

    @Override
    public void update(int id_user, ModBB bb) {
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(update, Statement.RETURN_GENERATED_KEYS);
            statement.setDouble(1, bb.getBb());
            statement.setInt(2, id_user);
            statement.setString(3, bb.getTanggal());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
        } catch (SQLException ex) {
            Logger.getLogger(DAOBB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void isiBB(int id_user, ModBB bb) {
        PreparedStatement statement;
        int c=0;
        try {
            statement = connection.prepareStatement(selectCount, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id_user);
            statement.setString(2, bb.getTanggal());
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                c = rs.getInt("COUNT(*)");            
            }
            if(c>0){
                update(id_user, bb);
            }else{
                insert(id_user, bb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
