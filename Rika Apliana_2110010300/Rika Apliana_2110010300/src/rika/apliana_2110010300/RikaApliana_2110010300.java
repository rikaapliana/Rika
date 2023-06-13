/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rika.apliana_2110010300;
import Dataset.dataSetGuru;
import Dataset.dataSetJadwal;
import Dataset.dataSetNilai;
import Dataset.dataSetPelajaran;
import Dataset.dataSetSiswa;
import forms.frameutama;


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
     /* 
     siswa obj = new siswa();
     obj.setNis("2110010300");
     obj.setNama("Rika");
     obj.setJenis_kelamin("Perempuan");
     obj.setKelas("XI");
     System.out.println("NIS           :"+ obj.getNis());
     System.out.println("Nama          :"+ obj.getNama());
     System.out.println("Jenis Kelamin :"+ obj.getJenis_kelamin());
     System.out.println("Kelas         :"+ obj.getKelas());  
    */
     dataSetSiswa siswa= new dataSetSiswa();
        System.out.println("SISTEM INFORMASI DATA SISWA SMP NEGERI 1 TANJUNG");
        System.out.println("=================================================");
        System.out.println("|                   DATA SISWA                  |");
        System.out.println("=================================================");
        siswa.NIS("201200000");
        siswa.Nama("Rika Apliana");
        siswa.JenisKelamin("Perempuan");
        siswa.TTL("Tabalong, 07 Agustus 2010");
        siswa.Alamat("Tanjung");
        siswa.Kelas("VIII");
        System.out.println("NIS            : "+siswa.getDatasetNIS());
        System.out.println("Nama           : "+siswa.getDatasetNIS());
        System.out.println("Jenis Kelamin  : "+siswa.getDatasetJenisKelamin());
        System.out.println("Kelas          : "+siswa.getDatasetKelas());
        
     
     dataSetGuru guru= new dataSetGuru();
        System.out.println("=================================================");
        System.out.println("|                     GURU                      |");
        System.out.println("=================================================");
        guru.Nik("2110010300");
        guru.Nik("2110010301");
        guru.Nik("2110010302");
        guru.Nik("2110010303");
        guru.Nik("2110010304");
        guru.Nik("2110010305");
        guru.Nik("2110010306");
        guru.Nik("2110010307");
        System.out.println("NIK            : "+guru.getDatasetNik().get(0));
        
        guru.NamaGuru("Kiki Febriani, S.Pd");
        guru.NamaGuru("Devi Febriana, S.Pd");
        guru.NamaGuru("Rizal Fauzi, S.Pd");
        guru.NamaGuru("Novita Sari, S.Pd");
        guru.NamaGuru("Rizki Hidayat, S.Pd");
        guru.NamaGuru("Edi Saputra, S.Pd");
        guru.NamaGuru("Lisda Karlina, S.Pd");
        guru.NamaGuru("Rusdianoor, S.Pd");
        
        System.out.println("Nama Guru      : "+guru.getDatasetNamaGuru().get(0));
        
        guru.KodeGuru("B1");
        guru.KodeGuru("B2");
        guru.KodeGuru("A1");
        guru.KodeGuru("F3");
        guru.KodeGuru("F1");
        guru.KodeGuru("F2");
        guru.KodeGuru("C1");
        guru.KodeGuru("B3");
        
        System.out.println("Kode Guru      : "+guru.getDatasetKodeGuru().get(0));
        
        guru.JenisKelamin("Laki-laki");
        guru.JenisKelamin("Perempuan");
        System.out.println("Jenis Kelamin  : "+guru.getDatasetJenisKelamin().get(1));
        
        dataSetPelajaran mapel = new dataSetPelajaran();
        System.out.println("=================================================");
        System.out.println("|                 MATA PELAJARAN                |");
        System.out.println("=================================================");
        mapel.KodePelajaran("BI");
        mapel.KodePelajaran("PKN");
        mapel.KodePelajaran("PAI");
        mapel.KodePelajaran("MT");
        mapel.KodePelajaran("IPA");
        mapel.KodePelajaran("IPS");
        mapel.KodePelajaran("SBK");
        mapel.KodePelajaran("ES");
        System.out.println("Kode Pelajaran : "+mapel.getDatasetKodePelajaran().get(0));
        
        mapel.NamaPelajaran("Bahasa Indonesia");
        mapel.NamaPelajaran("Pendidikan Kewarganegaraan");
        mapel.NamaPelajaran("Pendidikan Agama Islam");
        mapel.NamaPelajaran("Matematika");
        mapel.NamaPelajaran("Ilmu Pengetahuan Alam");
        mapel.NamaPelajaran("Ilmu Pengetahuan Sosial");
        mapel.NamaPelajaran("Seni Budaya dan Keterampilan");
        mapel.NamaPelajaran("Bahasa Inggris");
        System.out.println("Mata Pelajaran : "+mapel.getDatasetNamaPelajaran().get(0));
   
        dataSetJadwal jadwal = new dataSetJadwal();
        System.out.println("=================================================");
        System.out.println("|                     JADWAL                    |");
        System.out.println("=================================================");
        jadwal.KodeKelas("VII");
        jadwal.KodeKelas("VIII");
        jadwal.KodeKelas("IX");
        System.out.println("Kode Kelas     : "+jadwal.getDatasetKodeKelas().get(1));
         
        jadwal.Hari("Senin");
        jadwal.Hari("Selasa");
        jadwal.Hari("Rabu");
        jadwal.Hari("Kamis");
        jadwal.Hari("Jum'at");
        System.out.println("Hari           : "+jadwal.getDatasetHari().get(0));
        
        jadwal.Jam("07.30 - 9.30");
        jadwal.Jam("10.00 - 12.00");
        jadwal.Jam("13.00 - 14.30");
        System.out.println("Jam            : "+jadwal.getDatasetJam().get(0));
        
        dataSetNilai nilai = new dataSetNilai();
        System.out.println("=================================================");
        System.out.println("|                   REKAP NILAI                 |");
        System.out.println("=================================================");
        nilai.Semester("1 (Satu)");
        nilai.Semester("2 (Dua)");
        nilai.Semester("3 (Tiga)");
        nilai.Semester("4 (Empat)");
        nilai.Semester("5 (Lima)");
        nilai.Semester("6 (Enam)");
        System.out.println("Semester       : "+nilai.getDatasetSemester().get(3));
        
        nilai.TahunAjaran("2021/2022");
        nilai.TahunAjaran("2022/2023");
        nilai.TahunAjaran("2023/2024");
        System.out.println("Tahun Ajaran   : "+nilai.getDatasetTahunAjaran().get(0));
        
        nilai.Tugas(99);
        System.out.println("Nilai Tugas    : "+nilai.getDatasetTugas().get(0));
        
        nilai.UTS(98);
        System.out.println("Nilai UTS      : "+nilai.getDatasetUTS().get(0));
        
        nilai.UAS(100);
        System.out.println("Nilai UAS      : "+nilai.getDatasetUAS().get(0));
        
        nilai.RataRata((99+98+100)/3);
        System.out.println("Nilai Rata-Rata  : " +nilai.getDatasetRataRata().get(0));
        
        frameutama formsaya = new frameutama();
        formsaya.setVisible(true);
        
   
    }

        
        
        
        
        
        
        
         
         
   
        
}
