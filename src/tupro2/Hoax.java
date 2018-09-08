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
public class Hoax {
    private double hasil;
    private double titikB = 0.4;
    private double titikC = 0.6;

    public Hoax(double hasil) {
        this.hasil = hasil;
    }

    /**
     * @return the hasil
     */
    public double getHasil() {
        return hasil;
    }

    /**
     * @param hasil the hasil to set
     */
    public void setHasil(double hasil) {
        this.hasil = hasil;
    }
    
    public double ya(double a){
        return titikC;
    }
    
    public double tidak(double a){
        return titikB;
    }
}
