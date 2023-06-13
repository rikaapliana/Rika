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
public class dataSetSiswa {
   private ArrayList<String> NIS;
   private ArrayList<String> Nama;
   private ArrayList<String> JenisKelamin;
   private ArrayList<String> TTL;
   private ArrayList<String> Alamat;
   private ArrayList<String> Kelas;
   
   public dataSetSiswa (){
   NIS= new ArrayList<String>(); 
   Nama= new ArrayList<String>();
   JenisKelamin= new ArrayList<String>(); 
   TTL= new ArrayList<String>(); 
   Alamat= new ArrayList<String>();   
   Kelas= new ArrayList<String>();
   }
   
   public void NIS(String value){
        NIS.add(value);
     }
   public ArrayList<String> getDatasetNIS(){
         return this.NIS;
     }
   
   public void Nama(String value){
         Nama.add(value);
     }
   public ArrayList<String> getDatasetNama(){
         return this.Nama;
     }
   
   public void JenisKelamin(String value){
         JenisKelamin.add(value);
     }
   public ArrayList<String> getDatasetJenisKelamin(){
         return this.JenisKelamin;
     }
   
    public void TTL(String value){
         TTL.add(value);
     }
    public ArrayList<String> getDatasetTTL(){
         return this.TTL;
     }
   
    public void Alamat(String value){
         Alamat.add(value);
     }
    public ArrayList<String> getDatasetAlamat(){
         return this.Alamat;
     }
   
   public void Kelas(String value){
         Kelas.add(value);
     }
   public ArrayList<String> getDatasetKelas(){
         return this.Kelas;
     }
   
   public void tambahData(String NIS, String Nama, String JenisKelamin,String TTL, String Alamat, String Kelas){
         this.NIS.add(NIS);
         this.Nama.add(Nama);
         this.JenisKelamin.add(JenisKelamin);
         this.TTL.add(TTL);
         this.Alamat.add(Alamat);
         this.Kelas.add(Kelas);
         
     }
   
   
 }
    

