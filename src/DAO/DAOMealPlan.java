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
    final String select = "SELECT * FROM mealplan WHERE type='vegetarian' ORDER BY RAND() LIMIT 1";
    final String selectVeg = "SELECT * FROM mealplan WHERE type='non_vegetarian' ORDER BY RAND() LIMIT 1";

    public DAOMealPlan() {
        this.connection = KoneksiDB.connection();
    }
       
    @Override
    public ModMealPlan getAll() {
      //To change body of generated methods, choose Tools | Templates.
        ModMealPlan meal = new ModMealPlan();  
      try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                meal.setMeal_type(rs.getString("meal_type"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOFoodDiary.class.getName()).log(Level.SEVERE, null, ex);
        }

        return meal;
    }

    @Override
    public ModMealPlan getAllVeg() {
         //To change body of generated methods, choose Tools | Templates.
           ModMealPlan meal = new ModMealPlan();  
      try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(selectVeg);
            while (rs.next()) {
                meal.setMeal_type(rs.getString("meal_type"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOFoodDiary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return meal;
    }
}
