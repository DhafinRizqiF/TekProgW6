/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aggregation;

/**
 *
 * @author dhafi
 */
public class MainProgram {
    public static void main(String[] args) {
        // TODO code application logic here
        Kota kota = new Kota("Bandung");
        Kecamatan kecamatan = new Kecamatan ("Bojongloa Kaler","Babakan Asih");
        
        kota.setKecamatan(kecamatan);
        
        // tampil //
        System.out.println ("Kota             : " + kota.getnamaKota());
        System.out.println ("Kecamatan        : " + kota.getKecamatan().getKecamatan());
        System.out.println ("Kelurahan        : " + kota.getKecamatan().getKelurahan());
        System.out.println (kota.getKecamatan().getKecamatan() + " adalah salah satu kecamatan di "+ kota.getnamaKota()+ " dan di dalamnya ada kelurahan " + kota.getKecamatan().getKelurahan());
    }
    
}
