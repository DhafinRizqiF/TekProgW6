/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aggregation;

/**
 *
 * @author dhafin
 */
public class Kota {
   // state //
    private String namaKota;
    private Kecamatan kecamatan;
   
    // constructor //
    public Kota (String namaKota){
        this.namaKota = namaKota;
    }
    
    // getter setter //
    public void setKecamatan (Kecamatan kecamatan){
        this.kecamatan = kecamatan;
    }
    
    public Kecamatan getKecamatan(){
        return kecamatan;
    }
    
    public String getnamaKota(){
        return namaKota;
    }  
}
