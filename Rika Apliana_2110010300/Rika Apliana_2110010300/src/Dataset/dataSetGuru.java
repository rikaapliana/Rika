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
public class dataSetGuru {
    private ArrayList<String> NIK;
    private ArrayList<String> NamaGuru;
    private ArrayList<String> KodeGuru;
    private ArrayList<String>  JenisKelamin;

    public dataSetGuru() {
       NIK= new ArrayList<String>();
       NamaGuru= new ArrayList<String>();
       KodeGuru= new ArrayList<String>();
       JenisKelamin= new ArrayList<String>(); 
    }
    
    public void Nik(String value){
         NIK.add(value);
     }
     public ArrayList<String> getDatasetNik(){
         return this.NIK;
     }
     
     public void NamaGuru(String value){
         NamaGuru.add(value);
     }
     public ArrayList<String> getDatasetNamaGuru(){
         return this.NamaGuru;
     }
     
     public void KodeGuru(String value){
         KodeGuru.add(value);
     }
     public ArrayList<String> getDatasetKodeGuru(){
         return this. KodeGuru;
     }
     
     public void JenisKelamin(String value){
         JenisKelamin.add(value);
     }
     public ArrayList<String> getDatasetJenisKelamin(){
         return this.JenisKelamin;
     }

     public void tambahData(String Nik, String NamaGuru, String KodeGuru, String JenisKelamin){
         this.NIK.add(Nik);
         this.NamaGuru.add(NamaGuru);
         this.KodeGuru.add(KodeGuru);
         this.JenisKelamin.add(JenisKelamin); 
         
     }
        
    
}
