/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rika.apliana_2110010300;

import java.util.Scanner;

/**
 *
 * @author LENOVO 110-14IBR
 */
public class RikaApliana_2110010300 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     sekolah obj = new sekolah();
     obj.setNis("2110010300");
     obj.setNama("Rika");
     obj.setJenis_kelamin("Perempuan");
     obj.setKelas("XI");
     System.out.println("NIS           :"+ obj.getNis());
     System.out.println("Nama          :"+ obj.getNama());
     System.out.println("Jenis Kelamin :"+ obj.getJenis_kelamin());
     System.out.println("Kelas         :"+ obj.getKelas());
     

   
        
    }
    
}
