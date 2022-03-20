    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dependence;

/**
 *
 * @author dhafin
 */
public class MainProgram {
    public static void main (String[] args)
    {
        Bunga bunga1 = new Bunga("Tulip");
        Bunga bunga2 = new Bunga("Mawar");

        Lebah lebah1 = new Lebah("Lebah 1");
        Lebah lebah2 = new Lebah("Lebah 2");
        
        System.out.print(lebah1.getNamaLebah() + " memakan bunga ");
        lebah1.memakanBunga(bunga1);
        System.out.print(lebah2.getNamaLebah() + " memakan bunga ");
        lebah2.memakanBunga(bunga2);
    }
}
