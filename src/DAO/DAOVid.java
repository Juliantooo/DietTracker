/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Koneksi.KoneksiDB;
import Model.ModVideo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author natra
 */
public class DAOVid implements IFV{

    Connection connection;
    
    final String selectUN = "SELECT * FROM olahraga WHERE jenis='u'";
    final String selectOV = "SELECT * FROM olahraga WHERE jenis='o'";
    
    public DAOVid() {
        this.connection = KoneksiDB.connection();
    }
    
    
    
    @Override
    public List<ModVideo> getALLUN() {
        List<ModVideo> lmv = null;
        
        try{
            lmv = new ArrayList<ModVideo>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(selectUN);
            while(rs.next()){
                ModVideo mv = new ModVideo();
                mv.setNo(rs.getInt("no"));
                mv.setNama(rs.getString("nama"));
                mv.setDurasi(rs.getString("durasi"));
                mv.setKalori(rs.getString("kalori"));
                mv.setLink(rs.getString("link"));
                lmv.add(mv);
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(DAOBB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lmv;
    }

    @Override
    public List<ModVideo> getALLOV() {
        List<ModVideo> lmv = null;
        
        try{
            lmv = new ArrayList<ModVideo>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(selectOV);
            while(rs.next()){
                ModVideo mv = new ModVideo();
                mv.setNo(rs.getInt("no"));
                mv.setNama(rs.getString("nama"));
                mv.setDurasi(rs.getString("durasi"));
                mv.setKalori(rs.getString("kalori"));
                mv.setLink(rs.getString("link"));
                lmv.add(mv);
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(DAOBB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lmv;
    }
    
}
