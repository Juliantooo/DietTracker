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
 * @author natra
 */
public class ModTblVIdeo extends AbstractTableModel{

    List<ModVideo> lvid;

    public ModTblVIdeo(List<ModVideo> lvid) {
        this.lvid = lvid;
    }
    
    
    
    @Override
    public int getRowCount() {
        return lvid.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return lvid.get(rowIndex).getNo();
            case 1:
                return lvid.get(rowIndex).getNama();
            case 2:
                return lvid.get(rowIndex).getDurasi();
            case 3:
                return lvid.get(rowIndex).getKalori();
            case 4:
                return lvid.get(rowIndex).getLink();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Nomor";
            case 1:
                return "Nama";
            case 2:
                return "Durasi";
            case 3:
                return "Kalori";
            case 4:
                return "Link";
            default:
                return null;
        }
    }
}
