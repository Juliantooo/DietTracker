/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOFoodDiary;
import DAO.InterfaceFoodDiary;
import GUI.OurApp;
import Model.ModFoodDiary;
import Model.ModTblFoodDiary;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author mbohd
 */
public class ControllerFoodDiary {

    OurApp frame;
    InterfaceFoodDiary infFD;
    List<ModFoodDiary> lfd;

    public ControllerFoodDiary(OurApp frame) {
        this.frame = frame;
        this.infFD = new DAOFoodDiary();
    }

    public void isiTable() {
        //lfd = infFD.getAtDate("2020-06-22", 1);
        lfd = infFD.getAtDate(frame.getTf_tanggal().getText(), frame.getU().getId_user());
        //lfd = infFD.getAll();
        ModTblFoodDiary mt = new ModTblFoodDiary(lfd);
        frame.getTbl_FoodDiary().setModel(mt);
        int tk = 0;
        for(ModFoodDiary food : lfd){
            tk = tk + food.getKalori();
        }
        frame.getLbl_totalKalori().setText(String.valueOf(tk));
    }
    
    public void reset_field() {
        frame.getTf_idFood().setText("");
        frame.getTf_nmMakanan().setText("");
        frame.getCb_jenisMkn().setSelectedIndex(0);
        frame.getSp_kalori().setValue(0);
    }
    
    public void isi_field(int row) {
        frame.getTf_idFood().setText(String.valueOf(lfd.get(row).getId_food()));
        frame.getTf_nmMakanan().setText(lfd.get(row).getNama());
        frame.getCb_jenisMkn().setSelectedIndex(lfd.get(row).getJenis());
        frame.getSp_kalori().setValue(lfd.get(row).getKalori());
    }

    public void insert() {
        if (!frame.getTf_nmMakanan().getText().isEmpty()) {
            ModFoodDiary food = new ModFoodDiary();
            food.setJenis(frame.getCb_jenisMkn().getSelectedIndex());
            food.setKalori((int) frame.getSp_kalori().getValue());
            food.setNama(frame.getTf_nmMakanan().getText());
            infFD.insert(frame.getU().getId_user(), food, frame.getTf_tanggal().getText());
            JOptionPane.showMessageDialog(null, "Data disimpan");
        } else {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan");
        }
    }

    public void update() {
        if (!frame.getTf_nmMakanan().getText().isEmpty()) {
            ModFoodDiary food = new ModFoodDiary();
            food.setJenis(frame.getCb_jenisMkn().getSelectedIndex());
            food.setKalori((int) frame.getSp_kalori().getValue());
            food.setNama(frame.getTf_nmMakanan().getText());
            food.setId_food(Integer.parseInt(frame.getTf_idFood().getText()));
            infFD.update(food);
            JOptionPane.showMessageDialog(null, "Data diperbarui");
        } else {
            JOptionPane.showMessageDialog(null, "Data gagal diperbarui");
        }
    }
    
    public void delete() {
        if (!frame.getTf_idFood().getText().isEmpty()) {
            infFD.delete(Integer.parseInt(frame.getTf_idFood().getText()));
            JOptionPane.showMessageDialog(null, "Data dihapus");
        } else {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus");
        }
    }
}
