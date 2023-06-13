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
public class dataSetJadwal {
    private ArrayList<String> KodeKelas;
    private ArrayList<String> Hari;
    private ArrayList<String> Jam;
    
    public dataSetJadwal (){
       KodeKelas= new ArrayList<String>();
       Jam= new ArrayList<String>();
       Hari= new ArrayList<String>();
    }
    
     public void KodeKelas(String value){
         KodeKelas.add(value);
     }
     public ArrayList<String> getDatasetKodeKelas(){
         return this.KodeKelas;
     }
     
     public void Hari(String value){
         Hari.add(value);
     }
     public ArrayList<String> getDatasetHari(){
         return this.Hari;
     }
     
     public void Jam(String value){
         Jam.add(value);
     }
     public ArrayList<String> getDatasetJam(){
         return this.Jam;
     }
     
     public void tambahData(String KodeKelas, String Hari, String Jam){
         this.KodeKelas.add(KodeKelas);
         this.Hari.add(Hari);
         this.Jam.add(Jam);
         
     }
     
}
