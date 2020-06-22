/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModBB;
import java.util.List;

/**
 *
 * @author mbohd
 */
public interface IFBB {
    public void insert(int id_user, ModBB bb);
    public void delete(int no);
    public List<ModBB> get30Days(int id_user);
    public void update(int id_user, ModBB bb);
    public List<ModBB> cariBB(int id_user, String tanggal);
}
