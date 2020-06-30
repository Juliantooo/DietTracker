/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author mbohd
 */
public class ModUser {
    private String username;
    private int id_user;
    private String vegetarian;

    public ModUser() {
    }

    public String isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(String vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public ModUser(String username, int id_user, String vegetarian) {
        this.username = username;
        this.id_user = id_user;
        this.vegetarian = vegetarian;
    }
    
    
}
