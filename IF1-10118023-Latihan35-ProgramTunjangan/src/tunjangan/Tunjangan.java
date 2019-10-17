/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tunjangan;

import java.util.Scanner;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : (Object Oriented) Program Tunjangan
 */

public class Tunjangan {
    public static double gajiPokok;
    public static String status;

    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();
        Scanner input = new Scanner (System.in);
        
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp ");
        gajiPokok = input.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum) \t : ");
        status = input.next();
        System.out.println("");
        
        karyawan.hitungGaji(gajiPokok, status);
        
        System.out.println("========Hasil Perhitungan Anda========");
        System.out.println("Gaji Pokok\t\t\t: Rp " + gajiPokok);
        System.out.println("Tunjangan\t\t\t: Rp " + karyawan.tunjangan);
        System.out.println("Total Gaji\t\t\t: Rp " + karyawan.totalGaji);
        
        System.out.println("(Developed by Zaenal Anzarry)");
    }
    
}
