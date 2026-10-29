/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASPraktikum4;

import java.util.Scanner;

/**
 *
 * @author rizky
 */

public class KomisiSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total penjualan hari ini : Rp");
        double penjualan = input.nextDouble();

        double uangJasa = 0;
        double komisi = 0;

        if (penjualan <= 2000000) {
            uangJasa = 100000;
            komisi = 0.10 * penjualan;
        } else if (penjualan <= 5000000) {
            uangJasa = 200000;
            komisi = 0.15 * penjualan;
        } else {
            uangJasa = 300000;
            komisi = 0.20 * penjualan;
        }

        double totalPendapatan = penjualan + uangJasa + komisi;

        System.out.println("Uang Jasa: Rp" + uangJasa);
        System.out.println("Komisi: Rp" + komisi);
        System.out.println("Total Pendapatan: Rp" + totalPendapatan);
    }
}