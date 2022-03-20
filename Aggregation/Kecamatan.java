/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aggregation;

/**
 *
 * @author dhafi
 */
public class Kecamatan {
     // state //
    private String kecamatan;
    private String kelurahan;
    
    // constructor //
    public Kecamatan (String kecamatan, String kelurahan){
        this.kecamatan = kecamatan;
        this.kelurahan = kelurahan;
    }
    
    public String getKelurahan(){
        return kelurahan;
    }
    
    public String getKecamatan (){
        return kecamatan;
    }
}
