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

            if (frame.getLb_ket().getText() == "-") {

                return;
            } else if (frame.getLb_ket().getText() == "underweight") {
                lfd = ifMeal.getVegGain();
            } else {
                lfd = ifMeal.getVegDiet();
            }

        } else {

            if (frame.getLb_ket().getText() == "-") {

                return;
            } else if (frame.getLb_ket().getText() == "underweight") {

                lfd = ifMeal.getGain();
            } else {
                lfd = ifMeal.getDiet();

                System.err.println("isi :" + lfd.getMeal_type());
            }
        }

        frame.getjTextArea1().setText(lfd.getMeal_type());
    }
}
