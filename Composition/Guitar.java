/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composition;

/**
 *
 * @author dhafin
 */
public class Guitar {
    private Tuner tuner;
    private Senar senar;
    private String merk;
    private int harga;
    
    Guitar(String merk, int harga){
        this.merk = merk;
        this.harga = harga;
    }
    
    public void part(Tuner tuner, Senar senar){
        this.tuner = tuner;
        this.senar = senar;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public String getNamaTuner(){
        return tuner.getNama();
    }
    
    public String getNamaSenar(){
        return senar.getNama();
    }
}
