/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Koneksi.KoneksiDB;
import Model.ModMealPlan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Arcxt
 */
public class DAOMealPlan implements IFMealPlan {
    
    Connection connection;
    final String selectDiet = "SELECT * FROM mealplan WHERE type='non_vegetarian' AND for_who='diet' ORDER BY RAND() LIMIT 1";
    final String selectGain = "SELECT * FROM mealplan WHERE type='non_vegetarian' AND for_who='gain' ORDER BY RAND() LIMIT 1";
    final String selectVegDiet = "SELECT * FROM mealplan WHERE type='vegetarian' AND for_who='diet' ORDER BY RAND() LIMIT 1";
    final String selectVegGain = "SELECT * FROM mealplan WHERE type='vegetarian' AND for_who='gain' ORDER BY RAND() LIMIT 1";

    public DAOMealPlan() {
        this.connection = KoneksiDB.connection();
    }
       
    @Override
    public ModMealPlan getDiet() {
      //To change body of generated methods, choose Tools | Templates.
        ModMealPlan meal = new ModMealPlan();  
      try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(selectDiet);
            while (rs.next()) {
                meal.setMeal_type(rs.getString("meal_type"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOFoodDiary.class.getName()).log(Level.SEVERE, null, ex);
        }

        return meal;
    }

    @Override
    public ModMealPlan getVegDiet() {
         //To change body of generated methods, choose Tools | Templates.
           ModMealPlan meal = new ModMealPlan();  
      try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(selectVegDiet);
            while (rs.next()) {
                meal.setMeal_type(rs.getString("meal_type"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOFoodDiary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return meal;
    }

    @Override
    public ModMealPlan getGain() {
        ModMealPlan meal = new ModMealPlan();
        try {
            
            
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(selectGain);
            while (rs.next()) {
                meal.setMeal_type(rs.getString("meal_type"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOMealPlan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return meal;
    }

    @Override
    public ModMealPlan getVegGain() {
        ModMealPlan meal = new ModMealPlan();
        try {
            
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(selectVegGain);
            while (rs.next()) {
                meal.setMeal_type(rs.getString("meal_type"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOMealPlan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return meal;
    }
}
