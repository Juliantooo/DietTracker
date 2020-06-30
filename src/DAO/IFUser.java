/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModUser;

/**
 *
 * @author mbohd
 */
public interface IFUser {
    public ModUser getUser(String username, String password);
    public void insert(String username , String password ,String vegetarian, int tinggi);
}
