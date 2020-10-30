/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119016.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;
/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan cara 
 * melakukan pencarian nilai terbesar dam terkecil
 */
public class IF110119016Latihan23NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, jum_nilai, terbesar = 0, terkecil = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa======");
        System.out.print("Masukkan Nama Petugas : ");
        String petugas = scanner.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        jum_nilai = scanner.nextInt();
        int nilai_mhs[] = new int[jum_nilai];
        for (i = 0; i < jum_nilai; i++) {
            System.out.printf("Masukkan Nilai Mahasiswa Ke-%d: ", i+1);
            if (nilai_mhs[i] < terkecil) {
                terkecil = nilai_mhs[i];
            }
            nilai_mhs[i]= scanner.nextInt();
            if (nilai_mhs[i] > terbesar) {
                terbesar = nilai_mhs[i];
            }
        }

        System.out.println();
        System.out.println("======Hasil Nilai Mahasiswa======");
        for (i = 0; i < jum_nilai; i++) {
            System.out.printf("Nilai Mahasiswa Ke-%1$d = %2$d%n", i+1, nilai_mhs[i]);
        }
        System.out.println();
        System.out.println("Nilai Terbesar Adalah "+terbesar);
        System.out.println("Nilai Terkecil Adalah "+terkecil);
        System.out.println();
        System.out.println("Petugas : "+petugas);

    }
}