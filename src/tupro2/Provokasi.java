/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupro2;

/**
 *
 * @author FarhanDzaky
 */
public class Provokasi {
    private int nilaiProvokasi;
    
    private double titikA = 0;
    private double titikB = 25;
    private double titikC = 40;
    private double titikD = 81;
    private double titikE = 90;
    private double titikF = 100;

    public Provokasi(int nilaiProvokasi) {
        this.nilaiProvokasi = nilaiProvokasi;
    }

    /**
     * @return the nilaiProvokasi
     */
    public int getNilaiProvokasi() {
        return nilaiProvokasi;
    }

    /**
     * @param nilaiProvokasi the nilaiProvokasi to set
     */
    public void setNilaiProvokasi(int nilaiProvokasi) {
        this.nilaiProvokasi = nilaiProvokasi;
    }
    
    public double rendah(){
        if (nilaiProvokasi >= titikA && nilaiProvokasi <= titikB)
            return 1;
        else if (nilaiProvokasi > titikB && nilaiProvokasi <= titikC)
            return (titikC - nilaiProvokasi)/(titikC - titikB);
        else
            return 0;
    }
    
    public double sedang(){
        if (nilaiProvokasi >= titikC && nilaiProvokasi <= titikD)
            return 1;
        else if (nilaiProvokasi > titikB && nilaiProvokasi < titikC)
            return (nilaiProvokasi - titikB)/(titikC - titikB);
        else if (nilaiProvokasi > titikD && nilaiProvokasi <= titikE)
            return (titikE - nilaiProvokasi)/(titikE - titikD);
        else 
            return 0;
    }
    
    public double tinggi(){
        if (nilaiProvokasi >= titikE)
            return 1;
        else  if (nilaiProvokasi > titikD && nilaiProvokasi < titikE) 
            return (nilaiProvokasi - titikD)/(titikE - titikD);
        else 
            return 0;
    }
}
