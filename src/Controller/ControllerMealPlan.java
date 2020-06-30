/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOMealPlan;
import DAO.IFMealPlan;
import Model.ModMealPlan;
import GUI.OurApp;
import java.util.List;
/**
 *
 * @author Arcxt
 */
public class ControllerMealPlan {
    
    OurApp frame;
    IFMealPlan ifMeal;
    ModMealPlan lfd;
    
        public ControllerMealPlan(OurApp frame) {
        this.frame = frame;
        this.ifMeal = new DAOMealPlan();
    }
    
        public void isiMeal() {
        if(frame.getU().isVegetarian()=="vegetarian"){
            lfd = ifMeal.getAllVeg();
            frame.getjTextArea1().setText(lfd.getMeal_type());
        }else{
            lfd = ifMeal.getAll();
            frame.getjTextArea1().setText(lfd.getMeal_type());
        }
    }
}
