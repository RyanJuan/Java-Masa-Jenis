/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan41.masajenis;

import java.util.Scanner;

/**
 *
 * @author RyanJuan
 * NAMA                 : Rayan
 * KELAS                : PBOULG
 * NIM                  : 10115557
 * Deskripsi Program    : Program ini untuk menghitung massa jenis dan volume
 */
public class PBOULG10115557Latihan41MasaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Kubus kubus1 = new Kubus();
        Scanner scn = new Scanner (System.in);
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.print("Sisi\t: ");
        int kbs = scn.nextInt();
        System.out.print("Massa\t: ");
        int ms = scn.nextInt();
        
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume\t: "+kubus1.hasilVolume(kbs));
        System.out.println("Massa Jenis\t: "+kubus1.hitungMassa(ms,kbs));
    }
    
}
