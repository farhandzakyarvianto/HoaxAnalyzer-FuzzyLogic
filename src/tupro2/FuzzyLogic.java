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
public class FuzzyLogic {
    private Berita berita;
    private Emosi emosi;
    private Provokasi provokasi;
    private Hoax hoax = new Hoax(1);
    private double [] min_hoax = new double[9];
    private double [] output_hoax = new double[9];
    double max_tidak;
    double max_ya;
    

    public FuzzyLogic(Berita berita, Emosi emosi, Provokasi provokasi) {
        this.berita = berita;
        this.emosi = emosi;
        this.provokasi = provokasi;
    }
    
    public void rule_min(){
        min_hoax[0] = Math.min(emosi.rendah(), provokasi.rendah());
        min_hoax[1] = Math.min(emosi.rendah(), provokasi.sedang());
        min_hoax[2] = Math.min(emosi.rendah(), provokasi.tinggi());
        min_hoax[3] = Math.min(emosi.sedang(), provokasi.rendah());
        min_hoax[4] = Math.min(emosi.sedang(), provokasi.sedang());
        min_hoax[5] = Math.min(emosi.sedang(), provokasi.tinggi());
        min_hoax[6] = Math.min(emosi.tinggi(), provokasi.rendah());
        min_hoax[7] = Math.min(emosi.tinggi(), provokasi.sedang());
        min_hoax[8] = Math.min(emosi.tinggi(), provokasi.tinggi());
    }
    
    public void rule_output(){
//        output_hoax[0] = hoax.tidak(min_hoax[0]);
//        output_hoax[1] = hoax.tidak(min_hoax[1]);
//        output_hoax[2] = hoax.ya(min_hoax[2]);
//        output_hoax[3] = hoax.tidak(min_hoax[3]);
//        output_hoax[4] = hoax.tidak(min_hoax[4]);
//        output_hoax[5] = hoax.ya(min_hoax[5]);
//        output_hoax[6] = hoax.tidak(min_hoax[6]);
//        output_hoax[7] = hoax.ya(min_hoax[7]);
//        output_hoax[8] = hoax.ya(min_hoax[8]);
        
        max_tidak = Math.max(Math.max(min_hoax[0], min_hoax[1]), 
                Math.max(Math.max(min_hoax[3], min_hoax[4]), min_hoax[6]));
        max_ya = Math.max(Math.max(min_hoax[2], min_hoax[5]), 
                Math.max(min_hoax[7], min_hoax[8]));
    }

    public double defuzzyfication(){
        double pembilang = 0, penyebut = 0;
//        for (int i = 0; i < 9; i++) {
//            pembilang += min_hoax[i]*output_hoax[i];
//            penyebut += min_hoax[i];
//        } 
        pembilang = (max_ya*0.6)+(max_tidak*0.4);
        penyebut = max_ya+max_tidak;
                
        return (pembilang/penyebut);
    }
       
    public void view(){
        rule_min();
        rule_output();
        String h;
        double a = defuzzyfication();
        if(a < 0.49){
            h = "Tidak";
        } else {
            h = "ya";
        }
        System.out.print(String.format("%5s %2s", berita.getNamaBerita(), "|"));
        System.out.print(String.format("%5s %1s", emosi.getNilaiEmosi(), "|"));
        System.out.print(String.format("%5s %5s", provokasi.getNilaiProvokasi(), "|"));
        System.out.println(String.format("%6s %1s", h, "|"));
    }
}
