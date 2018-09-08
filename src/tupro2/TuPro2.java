/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupro2;

import java.util.Scanner;

/**
 *
 * @author FarhanDzaky
 */
public class TuPro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        
            System.out.print(String.format("%5s %1s", "Berita", "|"));
            System.out.print(String.format("%5s %1s", "Emosi", "|"));
            System.out.print(String.format("%5s %1s", "Provokasi", "|"));
            System.out.println(String.format("%6s %1s", "Hoax", "|"));
            System.out.println("==================================");
        
            Berita[] berita = new Berita[30];
            for(int i = 0; i < 30; i++){
                berita[i] = new Berita("B0"+(i+1));
            }
            Emosi[] emosi = new Emosi[30];
            emosi[0] = new Emosi(97);emosi[1] = new Emosi(36);
            emosi[2] = new Emosi(63);emosi[3] = new Emosi(82);
            emosi[4] = new Emosi(71);emosi[5] = new Emosi(79);
            emosi[6] = new Emosi(55);emosi[7] = new Emosi(57);
            emosi[8] = new Emosi(40);emosi[9] = new Emosi(57);
            emosi[10] = new Emosi(77);emosi[11] = new Emosi(68);
            emosi[12] = new Emosi(60);emosi[13] = new Emosi(82);
            emosi[14] = new Emosi(40);emosi[15] = new Emosi(80);
            emosi[16] = new Emosi(60);emosi[17] = new Emosi(50);
            emosi[18] = new Emosi(100);emosi[19] = new Emosi(11);
            emosi[20] = new Emosi(58);emosi[21] = new Emosi(68);
            emosi[22] = new Emosi(64);emosi[23] = new Emosi(57);
            emosi[24] = new Emosi(77);emosi[25] = new Emosi(98);
            emosi[26] = new Emosi(91);emosi[27] = new Emosi(50);
            emosi[28] = new Emosi(95);emosi[29] = new Emosi(27);
            
            
            Provokasi[] provokasi = new Provokasi[30];
            provokasi[0] = new Provokasi(74);provokasi[1] = new Provokasi(85);
            provokasi[2] = new Provokasi(43);provokasi[3] = new Provokasi(90);
            provokasi[4] = new Provokasi(25);provokasi[5] = new Provokasi(81);
            provokasi[6] = new Provokasi(62);provokasi[7] = new Provokasi(45);
            provokasi[8] = new Provokasi(65);provokasi[9] = new Provokasi(45);
            provokasi[10] = new Provokasi(70);provokasi[11] = new Provokasi(75);
            provokasi[12] = new Provokasi(70);provokasi[13] = new Provokasi(90);
            provokasi[14] = new Provokasi(85);provokasi[15] = new Provokasi(68);
            provokasi[16] = new Provokasi(72);provokasi[17] = new Provokasi(95);
            provokasi[18] = new Provokasi(18);provokasi[19] = new Provokasi(99);
            provokasi[20] = new Provokasi(63);provokasi[21] = new Provokasi(70);
            provokasi[22] = new Provokasi(66);provokasi[23] = new Provokasi(77);
            provokasi[24] = new Provokasi(55);provokasi[25] = new Provokasi(64);
            provokasi[26] = new Provokasi(59);provokasi[27] = new Provokasi(95);
            provokasi[28] = new Provokasi(55);provokasi[29] = new Provokasi(79);
            
            for (int i = 0; i < 30; i++) {
                FuzzyLogic fuzzy = new FuzzyLogic(berita[i], emosi[i], provokasi[i]);
                fuzzy.view();
            }
            System.out.println("==================================");
            
            
            
        //=================================================//
//            Scanner input = new Scanner(System.in);
//            
//            System.out.print("Nama Berita = ");
//            String bri = input.nextLine();
//            
//            System.out.print("Emosi = ");
//            int em = input.nextInt();
//            
//            System.out.print("Provokasi = ");
//            int prov = input.nextInt();
//            System.out.println("==================================");
//            
//            Berita bri1 = new Berita(bri);
//            Emosi em1 = new Emosi(em);
//            Provokasi prov1 = new Provokasi(prov);
//
//            FuzzyLogic FL = new FuzzyLogic(bri1, em1, prov1);
//            FL.view();
//            System.out.println("==================================");
    }
    
}
