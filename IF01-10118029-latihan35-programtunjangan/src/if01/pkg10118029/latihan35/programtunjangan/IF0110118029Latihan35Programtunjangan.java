/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan tunjangan
 * 
 */
public class IF0110118029Latihan35Programtunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        karyawan karyawan = new karyawan();
        
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda per bulan?\t: Rp. ");
        karyawan.gajiPokok= scanner.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        karyawan.status = scanner.next();

        karyawan.hasilHitung(karyawan.status, karyawan.gajiPokok);
    }
    
}
