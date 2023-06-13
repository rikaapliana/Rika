/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;

/**
 *
 * @author LENOVO 110-14IBR
 */
public class dataSetPelajaran {
   private ArrayList<String> KodePelajaran;
   private ArrayList<String> NamaPelajaran;
   
   public dataSetPelajaran (){
    KodePelajaran= new ArrayList<String>(); 
    NamaPelajaran= new ArrayList<String>();
   }
   
   public void KodePelajaran(String value){
         KodePelajaran.add(value);
     }
   public ArrayList<String> getDatasetKodePelajaran(){
         return this.KodePelajaran;
     }
   
   public void NamaPelajaran(String value){
         NamaPelajaran.add(value);
     }
   public ArrayList<String> getDatasetNamaPelajaran(){
         return this.NamaPelajaran;
     }
   
   public void tambahData(String KodePelajaran, String NamaPelajaran){
         this.KodePelajaran.add(KodePelajaran);
         this.NamaPelajaran.add(NamaPelajaran);
     }
}
