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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModBB> cariBB(int id_user, String tanggal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
