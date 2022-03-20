/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dependence;

/**
 *
 * @author dhafin
 */
class Lebah {
    private String namaLebah;
    
    Lebah(String namaLebah){
        this.namaLebah = namaLebah;
    }
    
    public void memakanBunga(Bunga bunga){
        String macamBunga = bunga.getNamaBunga();
        System.out.println(macamBunga);
    }
    
    public String getNamaLebah(){
        return this.namaLebah;
    }
}
