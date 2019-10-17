/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tunjangan;

/**
 *
 * @author Zaenal PC
 */
public class Karyawan {
    public double tunjangan;
    public double totalGaji = 0;
    
    public double hitungTunjangan(double gaji){
        return gaji * 0.35;
    }
    
    public void hitungGaji (double parGaji, String parStatus){
        if (parStatus.equals("Menikah")){
            tunjangan = hitungTunjangan(parGaji);
        }
        else {
            tunjangan = 0;
        }
        totalGaji = parGaji + tunjangan;
    }
}
