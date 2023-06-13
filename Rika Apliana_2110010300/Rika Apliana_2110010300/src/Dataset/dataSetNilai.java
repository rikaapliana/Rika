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
public class dataSetNilai {
    private ArrayList<String> Semester;
    private ArrayList<String> TahunAjaran;
    private ArrayList<Integer> Tugas;
    private ArrayList<Integer> UTS;
    private ArrayList<Integer> UAS;
    private ArrayList<Integer> RataRata;
    
    public dataSetNilai (){
    Semester= new ArrayList<String>(); 
    TahunAjaran= new ArrayList<String>();
    Tugas= new ArrayList<Integer>();
    UTS= new ArrayList<Integer>();
    UAS= new ArrayList<Integer>();
    RataRata= new ArrayList<Integer>();
    }
    
    public void Semester(String value){
         Semester.add(value);
     }
     public ArrayList<String> getDatasetSemester(){
         return this.Semester;
     }
     
     public void TahunAjaran(String value){
         TahunAjaran.add(value);
     }
     public ArrayList<String> getDatasetTahunAjaran(){
         return this.TahunAjaran;
     }
     
     public void Tugas(Integer x){
         Tugas.add(x);
     }
     public ArrayList<Integer> getDatasetTugas(){
         return this.Tugas;
     }
     
     public void UTS(Integer x){
        UTS.add(x);
     }
     public ArrayList<Integer> getDatasetUTS(){
         return this.UTS;
     }
     
    public void UAS(Integer x){
        UAS.add(x);
     }
     public ArrayList<Integer> getDatasetUAS(){
         return this.UAS;
     }
     
     public void RataRata(Integer x){
        RataRata.add(x);
     }
     public ArrayList<Integer> getDatasetRataRata(){
         return this.RataRata;
     }
     
     public void tambahData(String Semester, String TahunAjaran, int Tugas, int UTS, int UAS, int RataRata){
         this.Semester.add(Semester);
         this.TahunAjaran.add(TahunAjaran);
         this.Tugas.add(Tugas);
         this.UTS.add(UTS);
         this.UAS.add(UAS);
         this.RataRata.add(RataRata);  
     }

    public String getRata() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
       
}
