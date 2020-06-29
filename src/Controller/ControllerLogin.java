/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOUser;
import DAO.IFUser;
import GUI.LoginForm;
import Model.ModUser;

/**
 *
 * @author mbohd
 */
public class ControllerLogin {
    LoginForm frame;
    IFUser ifu;

    public ControllerLogin(LoginForm frame) {
        this.frame = frame;
        this.ifu = new DAOUser();
    }
    
    public ModUser login(){
        //System.err.println("user : "+frame.getTf_uname().getText());
        //System.err.println("passwd : "+String.valueOf(frame.getTf_passwd().getPassword()));
        String username;
        String password;
        username = frame.getTf_uname().getText();
        password = String.valueOf(frame.getTf_passwd().getPassword());
        ModUser u = ifu.getUser(username, password);
        return u;
    }
    
    
}
