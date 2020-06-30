/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Arcxt
 */
public class ModMealPlan {
    String meal_type,type,for_who;
    
    public ModMealPlan(){
    
    }

    public String getMeal_type() {
        return meal_type;
    }

    public void setMeal_type(String meal_type) {
        this.meal_type = meal_type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFor_who() {
        return for_who;
    }

    public void setFor_who(String for_who) {
        this.for_who = for_who;
    }
    
}
