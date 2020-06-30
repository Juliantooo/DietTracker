/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOUser;
import DAO.IFUser;
import GUI.RegisForm;
import Model.ModUser;

/**
 *
 * @author Arcxt
 */
public class ControllerRegister {
    RegisForm frame;
    IFUser ifu;
        public ControllerRegister(RegisForm frame) {
        this.frame = frame;
        this.ifu = new DAOUser();
    }
    
    public void insert(){
        String username;
        String password;
        String vegetarian ;
        username = frame.getjTextField1().getText();
        password = String.valueOf(frame.getjPasswordField3().getPassword());
        if(frame.getjCheckBox1().isSelected()){
            vegetarian =  frame.getjCheckBox1().getText();
        }else{
            vegetarian = "tidak";
        }
        ifu.insert(username, password, vegetarian);
    }
}
