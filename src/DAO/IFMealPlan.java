/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModMealPlan;
import java.util.List;
/**
 *
 * @author Arcxt
 */
public interface IFMealPlan {
    public ModMealPlan getDiet();
    public ModMealPlan getGain();
    public ModMealPlan getVegDiet();
    public ModMealPlan getVegGain();
}
