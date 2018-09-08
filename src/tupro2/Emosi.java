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
public class Emosi {
    private int nilaiEmosi;
    
    private double titikA = 0;
    private double titikB = 30;
    private double titikC = 43;
    private double titikD = 60;
    private double titikE = 75;
    private double titikF = 100;
    
    
    public Emosi(int nilaiEmosi) {
        this.nilaiEmosi = nilaiEmosi;
    }

    /**
     * @return the nilaiEmosi
     */
    public int getNilaiEmosi() {
        return nilaiEmosi;
    }

    /**
     * @param nilaiEmosi the nilaiEmosi to set
     */
    public void setNilaiEmosi(int nilaiEmosi) {
        this.nilaiEmosi = nilaiEmosi;
    }
    
    public double rendah(){
        if (nilaiEmosi >= titikA && nilaiEmosi <= titikB)
            return 1;
        else if (nilaiEmosi > titikB && nilaiEmosi <= titikC)
            return (titikC - nilaiEmosi)/(titikC - titikB);
        else
            return 0;
    }
    
    public double sedang(){
        if (nilaiEmosi >= titikC && nilaiEmosi <= titikD)
            return 1;
        else if (nilaiEmosi > titikB && nilaiEmosi < titikC)
            return (nilaiEmosi - titikB)/(titikC - titikB);
        else if (nilaiEmosi > titikD && nilaiEmosi <= titikE)
            return (titikE - nilaiEmosi)/(titikE - titikD);
        else 
            return 0;
    }
    
    public double tinggi(){
        if (nilaiEmosi >= titikE)
            return 1;
        else  if (nilaiEmosi > titikD && nilaiEmosi < titikE) 
            return (nilaiEmosi - titikD)/(titikE - titikD);
        else 
            return 0;
    }
}
