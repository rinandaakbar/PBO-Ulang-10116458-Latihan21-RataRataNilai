/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class PBOUlang10116458Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumMhs;
       int i=1;
       double rataNilai;
       double jumNilai = 0;
       double nilaiMhs;
       
       Scanner sc = new Scanner(System.in);
       
        System.out.print("Masukkan Banyaknya Mahasiswa = ");
        jumMhs = (int) sc.nextDouble();
        
        while (i <= jumMhs) {
            System.out.print("Nilai Mahasiswa Ke-" + i + " : ");
            
            nilaiMhs = sc.nextDouble();
            jumNilai = jumNilai + nilaiMhs;
            i++;
        }
        System.out.println(" ");
        
        //menghitung rata-rata nilai
        rataNilai = jumNilai / jumMhs;
        System.out.println("Maka, Rata-rata nilainya adalah " + rataNilai);
        System.out.println("(Developed by : Wahid Herlambang Suroso)");
    }
    
}
