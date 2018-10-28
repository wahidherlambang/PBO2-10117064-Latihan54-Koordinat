/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan54.koordinat;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk mengetahui 
 * koordinat sumbu berdasarkan warna koordinat.
 */
public class PBO210117064Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat warna = new WarnaKoordinat (0,0,"");
        
        warna.setNamaWarna("Jingga");
        warna.setX(10);
        warna.setY(4);
        System.out.println("Warna Koordinat : " + warna.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + warna.getX()+ ", " 
                + "y : " + warna.getY());
    }
    
}
