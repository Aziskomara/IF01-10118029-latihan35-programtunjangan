/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan35.programtunjangan;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan tunjangan
 * 
 */
public class karyawan {
    public double gajiPokok;
    public String status;
    public double tunjangan;
    public double totalGaji;
    
    public double hitungTunjangan(double parGajiPokok, String parStatus){
        
        return tunjangan = parStatus.equals("Menikah")? 0.35*parGajiPokok:0;     
    }
    
    public double hitungTotalGaji (double parGajiPokok,double parTunjangan){
       
        return totalGaji=parGajiPokok + parTunjangan;
    }
    
    public void hasilHitung(String parStatus, double parGajiPokok){
        System.out.println("------Hasil Perhitungan Gaji Anda------");
        System.out.println("Gaji Pokok: Rp. " +gajiPokok);
        System.out.println("Tunjangan: Rp. " +hitungTunjangan(parGajiPokok, parStatus));
        System.out.println("Total Gaji: Rp. " +hitungTotalGaji(parGajiPokok, tunjangan));
        System.out.println("Developed by: Azis koomara");
    }
}
