/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Association;
import java.util.*;

/**
 *
 * @author dhafin
 */
public class MainProgram {
     public static void main(String[] args) {
        // TODO code application logic here
        Province province = new Province ("Jawa Barat");
        
        // inisialisasi nama Kabupaten //
        DistrictsClass districts1 = new DistrictsClass ("Kabupaten Bandung");
        DistrictsClass districts2 = new DistrictsClass ("Kabupaten Bandung Barat");
        DistrictsClass districts3 = new DistrictsClass ("Kabupaten Bekasi");
        
        // tampil //
        System.out.println(districts1.getNameDistricts() + " adalah kabupaten dari provinsi " + province.getProvinceName());
        System.out.println(districts2.getNameDistricts() + " adalah kabupaten dari provinsi " + province.getProvinceName());
        System.out.println(districts3.getNameDistricts() + " adalah kabupaten dari provinsi " + province.getProvinceName());
    }
    
}
