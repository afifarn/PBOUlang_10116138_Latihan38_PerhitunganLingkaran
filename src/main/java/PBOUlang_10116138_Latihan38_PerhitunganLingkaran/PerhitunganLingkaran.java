/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOUlang_10116138_Latihan38_PerhitunganLingkaran;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Hitung Lingkaran
 * NoRunning
 */
public class PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diameter;
        double d;
        Scanner scanner = new Scanner(System.in);
        Lingkaran clc = new Lingkaran();

        System.out.println("===Perhitungan Lingkaran===");
        do {
            System.out.print("Masukan nilai diameter lingkaran : ");
            diameter = scanner.nextLine();
            System.out.println((!diameter.matches("[0-9]*"))
                    ? "Nilai Diameter tidak sesuai\n" : "");

        } while (!diameter.matches("[0-9]*"));
        System.out.println("===Hasil Perhitungan Lingkaran===");
        d = Double.parseDouble(diameter);

        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",
                clc.jariLingkaran(d));
        System.out.printf("Luas Lingkaran = %.2f cm %n",
                clc.luasLingkaran(clc.jariLingkaran(d)));
        System.out.printf("Keliling Lingkaran = %.2f cm %n",
                clc.kelilingLingkaran(clc.jariLingkaran(d)));
    }

}
