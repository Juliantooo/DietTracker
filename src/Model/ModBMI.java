/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author natra
 */
public class ModBMI {
    private Double tinggi;
    private Double berat;
    private Double ukur;
    private String ket;
    private int id_user;
    private int id_bb;
    private String tanggal;

    public Double getTinggi() {
        return tinggi;
    }

    public void setTinggi(Double tinggi) {
        this.tinggi = tinggi;
    }

    public Double getBerat() {
        return berat;
    }

    public void setBerat(Double berat) {
        this.berat = berat;
    }

    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_bb() {
        return id_bb;
    }

    public void setId_bb(int id_bb) {
        this.id_bb = id_bb;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    
    public double ukur(double tinggi, double berat){
        double BMI = berat/Math.pow(tinggi/100, 2);
        return BMI;
    }
}
