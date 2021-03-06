/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOBB;
import DAO.IFBB;
import GUI.OurApp;
import Model.ModBB;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author mbohd
 */
public class CtrlBB {
        OurApp frame;
    IFBB ifbb;
    List<ModBB> lbb;

    public CtrlBB(OurApp frame) {
        this.frame = frame;
        this.ifbb = new DAOBB();
    }
    
    public void isiGraph(){
        lbb = ifbb.get30Days(frame.getU().getId_user());
        frame.getbBGraph2().setLbb(lbb);
        //frame.getbBGraph2().refresh();
    }
    
    public void inputBB(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        ModBB bb = new ModBB();
        bb.setBb(Double.parseDouble(frame.getTf_bb().getText()));
        bb.setTanggal(dtf.format(frame.getNow()));
        ifbb.isiBB(frame.getU().getId_user(), bb);
    }
    
    public void getLatestBB(){
        frame.setBbNow(ifbb.getLatest(frame.getU().getId_user()));
    }
}
