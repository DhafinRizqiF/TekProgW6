/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composition;

/**
 *
 * @author dhafin
 */
public class MainProgram {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Yamaha", 1500000);
        
        guitar.part(new Tuner("Cherub"), new Senar("Elixir"));
        
        System.out.println("Gitar "+ guitar.getMerk()+" dengan Senar "
                +guitar.getNamaSenar()+" dan Tuner "+guitar.getNamaTuner()+" seharga Rp"+guitar.getHarga());
    }
    
}
