/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOUlang_10116138_Latihan38_PerhitunganLingkaran;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Hitung Lingkaran
 * NoRunning
 */
public class Lingkaran {

    double jari;
    double luas;
    double keliling;

    public double jariLingkaran(double diameter) {
        jari = diameter / 2;
        return jari;
    }

    public double luasLingkaran(double r) {
        luas = Math.PI * r * r;
        return luas;
    }

    public double kelilingLingkaran(double r) {
        luas = 2 * Math.PI * r;
        return luas;
    }
}
