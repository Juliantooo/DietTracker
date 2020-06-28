/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

//import DAO.DAOBodyMass;
import DAO.DAOVid;
import DAO.IFV;
//import DAO.InterfaceBMI;
import GUI.OurApp;
import Model.ModBMI;
import Model.ModTblVIdeo;
import Model.ModVideo;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.net.URI;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.List;

/**
 *
 * @author natra
 */
public class CtrlBMI {
    OurApp frame;
    
//    InterfaceBMI iBMI;
    IFV ivid;
    
    List<ModVideo> lmv;

    public CtrlBMI(OurApp frame) {
        this.frame = frame;
//        iBMI = new DAOBodyMass();
//        ividUN = new DAOVid();
//        ividOV = new DAOVid();
        ivid = new DAOVid();
        lmv = ivid.getALLUN();
        lmv = ivid.getALLOV();
    }
    
    public void reset(){
        frame.getTf_abot().setText("");
        frame.getTf_duwur().setText("");
    }
    
    public void insertTbBb(){
        
    }
    
    public void ukurBMI(){
        DecimalFormat dc = new DecimalFormat("#.#");
        ModBMI mod = new ModBMI();
        //System.err.println(Double.valueOf(frame.getTf_duwur().getText().trim()));
        Double bmi = mod.ukur(Double.valueOf(frame.getTf_duwur().getText().trim()), Double.valueOf(frame.getTf_abot().getText().trim()));
        
        frame.getLb_bmi().setText(String.valueOf(dc.format(bmi)));
        
        if(bmi < 18.5){
            frame.getLb_ket().setText("underweight");
            
            lmv = ivid.getALLUN();
            ModTblVIdeo mt = new ModTblVIdeo(lmv);
            frame.getTbl_video().setModel(mt);


            
            
        } else if(bmi >= 18.5
                && bmi < 25){
            frame.getLb_ket().setText("normalweight");
            
            lmv = ivid.getALLUN();
            ModTblVIdeo mt = new ModTblVIdeo(lmv);
            frame.getTbl_video().setModel(mt);


            
        } else if(bmi >= 25
                && bmi < 30){
            frame.getLb_ket().setText("overweight");
            
            lmv = ivid.getALLOV();
            ModTblVIdeo mt = new ModTblVIdeo(lmv);
            frame.getTbl_video().setModel(mt);

            
        } else{
            frame.getLb_ket().setText("obesity");
            
            lmv = ivid.getALLOV();
            ModTblVIdeo mt = new ModTblVIdeo(lmv);
            frame.getTbl_video().setModel(mt);

            
        }

    }
    
    public void link(String url){
        try
        {
            URI uri = new URL(url).toURI();
            
            Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
            if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE))
            {
                desktop.browse(uri);
            }
        }
        catch (Exception e)
        {
            
            e.printStackTrace();
            
            StringSelection stringSelection = new StringSelection(url);
            Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
            clpbrd.setContents(stringSelection, null);
            
//            WindowsTools.informationWindow("");
        }
    }
    
//     public boolean isiTabelUnder(){
//        lmv = ivid.getALLUN();
//        ModTblVIdeo mtv = new ModTblVIdeo(lmv);
//        //bmi.getTbl_bmi().setModel(mtv);
//        return true;
//        
//    }
//    
//    public boolean isiTabelOver(){
//        lmv = ivid.getALLOV();
//        ModTblVIdeo mtv = new ModTblVIdeo(lmv);
//        //bmi.getTbl_vidoo().setModel(mtv);
//        return true;
//    }
}
