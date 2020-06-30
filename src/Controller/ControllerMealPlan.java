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
        lfd = new ModMealPlan();
    }

    public void isiMeal() {

        if (frame.getU().isVegetarian() == "Vegetarian") {
            System.out.println("veg");
            if (frame.getLb_ket().getText() == "-") {
                System.out.println("ket kosong veg");
                return;
            } else if (frame.getLb_ket().getText() == "underweight") {
                lfd = ifMeal.getVegGain();
            } else {
                lfd = ifMeal.getVegDiet();
            }

            
        } else {
            System.out.println("tidak veg");
            if (frame.getLb_ket().getText() == "-") {
                System.out.println("ket kosong tidak veg");
                return;
            } else if (frame.getLb_ket().getText() == "underweight") {
                System.out.println("gain");
                lfd = ifMeal.getGain();
            } else {
                lfd = ifMeal.getDiet();
                System.out.println("diet");
                System.err.println("isi :" +lfd.getMeal_type());
            }
        }
        
        frame.getjTextArea1().setText(lfd.getMeal_type());
    }
}
