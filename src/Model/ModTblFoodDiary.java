/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mbohd
 */
public class ModTblFoodDiary extends AbstractTableModel{
    
    List<ModFoodDiary> lfd;
    
    public ModTblFoodDiary(List<ModFoodDiary> lfd) {
        this.lfd = lfd;
    }
    
    @Override
    public int getRowCount() {
        return lfd.size();
    }

    @Override
    public int getColumnCount() {
        return 3; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch(col){
            case 0:
                return lfd.get(row).getNama();
            case 1:
                return jenisVerbose(lfd.get(row).getJenis());
            case 2:
                return lfd.get(row).getKalori();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "Makanan";
            case 1:
                return "Jenis";
            case 2:
                return "Kalori";

            default:
                return null;
        } //To change body of generated methods, choose Tools | Templates.
    }
    public String jenisVerbose(int jenis){
        switch(jenis){
            case 0:
                return "Sarapan";
            case 1:
                return "Makan Siang";
            case 2:
                return "Makan Malam";
            case 3:
                return "Cemilan";
            default:
                return null;
        }
    }
    
}
