/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan41.massajenis;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kubus = new Kubus();
        
        kubus.setSisi(5);
        kubus.setMassa(250);
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi: " + kubus.getSisi());
        System.out.println("Massa: " + kubus.getMassa());
        
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume: " + kubus.hitungVolume(0));
        System.out.println("Massa Jenis: " + kubus.hitungMassaJenis(0, 0));
    }
    
}
