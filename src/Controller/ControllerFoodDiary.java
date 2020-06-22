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

/**
 *
 * @author mbohd
 */
public class ControllerFoodDiary {
    OurApp frame;
    InterfaceFoodDiary infFD;
    List<ModFoodDiary> lfd;
    
    public ControllerFoodDiary(OurApp frame){
        this.frame = frame;
        this.infFD = new DAOFoodDiary();
    }
    
    public void isiTable(){
        //lfd = infFD.getAtDate("2020-06-22", 1);
        //lfd = infFD.getAtDate(frame.getTf_tanggal().getText(), frame.getU().getId_user());
        lfd = infFD.getAll();
        ModTblFoodDiary mt = new ModTblFoodDiary(lfd);
        frame.getTbl_FoodDiary().setModel(mt);
        
    }
}
