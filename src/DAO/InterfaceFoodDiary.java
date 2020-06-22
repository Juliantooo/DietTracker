/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModFoodDiary;
import java.util.List;

/**
 *
 * @author mbohd
 */
public interface InterfaceFoodDiary {
    public void insert(int id_user, ModFoodDiary mfd, String tgl);
    public void delete(int no);
    public List<ModFoodDiary> getAtDate(String tgl, int id_user);
    public void update(ModFoodDiary mfd);
    public List<ModFoodDiary> getAll();
}
